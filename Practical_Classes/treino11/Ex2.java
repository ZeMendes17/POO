package treino11;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;

public class Ex2 {
    public static void main(String[] args) throws IOException {
        
        Map<String, String> companhias = new HashMap<>();
        Map<String, Integer> nVoos = new HashMap<>();
        Map<String, ArrayList<Tempo>> atrasoMedio = new HashMap<>();
        PrintWriter out = new PrintWriter(new File("src/treino11/Infopublico.txt"));
        Scanner input_voos = new Scanner(new FileReader("src/aula11/voos.txt"));
        Scanner input_companhias = new Scanner(new FileReader("src/aula11/companhias.txt"));

        while(input_companhias.hasNextLine()){
            String[] c = input_companhias.nextLine().split("\t");
            if(c[0].equals("Sigla")){
                continue;
            }else{
                companhias.put(c[0], c[1]);
            }
        }
        input_companhias.close();

        System.out.printf("%-10s%-12s%-20s%-25s%-10s%-15s\n", "Hora", "Voo", "Companhia", "Origem", "Atraso", "Obs");
        out.printf("%-10s%-12s%-20s%-25s%-10s%-15s\n", "Hora", "Voo", "Companhia", "Origem", "Atraso", "Obs");

        while(input_voos.hasNextLine()){
            String voos[] = input_voos.nextLine().split("\t");
            if(voos[0].equals("Hora")){
                continue;
            }else{
                String companhia = companhias.get(voos[1].substring(0, 2));
                if(voos.length == 4){
                    if(atrasoMedio.containsKey(companhia)){
                        atrasoMedio.get(companhia).add(new Tempo(voos[3]));
                    }else{
                        ArrayList<Tempo> t = new ArrayList<>();
                        t.add(new Tempo(voos[3]));
                        atrasoMedio.put(companhia, t);
                    }
                    Voo v = new Voo(new Tempo(voos[0]), voos[1], companhia, voos[2], new Tempo(voos[3]));
                    System.out.println(v.toString());
                    out.println(v.toString());
                }else{
                    Voo v = new Voo(new Tempo(voos[0]), voos[1], companhia, voos[2], new Tempo(0));
                    System.out.println(v.toString());
                    out.println(v.toString());
                }

                if(nVoos.containsKey(voos[2])){
                    nVoos.replace(voos[2], nVoos.get(voos[2]) + 1);
                }else{
                    nVoos.put(voos[2], 1);
                }
            }
        }
        input_voos.close();
        out.close();

        Map<String, Double> atraso = new HashMap<>();
        for(String s : atrasoMedio.keySet()){
            double temporario = 0;

            for(int i = 0; i < atrasoMedio.get(s).size(); i++){
                String st = atrasoMedio.get(s).get(i).toString();
                temporario += ((Double.parseDouble(st.split(":")[0])) * 60) + (Double.parseDouble(st.split(":")[1]));
            }
            atraso.put(s, temporario / atrasoMedio.get(s).size());
        }

        System.out.printf("%-20s%-10s\n", "Companhia", "Atraso Médio");
        for(String s : atraso.keySet()){
            System.out.printf("%-20s%-10s\n", s, atraso.get(s));
        }

        PrintWriter out_cidades = new PrintWriter(new File("src/treino11/cidades.txt"));
        System.out.printf("%-25s%-10s\n", "Origem", "Voos");
        out_cidades.printf("%-25s%-10s\n", "Origem", "Voos");
        for(int i = 0; i < nVoos.size(); i++){
            int maior = 0;
            String st = "null";
            for(String s : nVoos.keySet()){
                if(nVoos.get(s) > maior){
                    maior = nVoos.get(s);
                    st = s;
                }
            }
            System.out.printf("%-25s%-10s\n", st, maior);
            out_cidades.printf("%-25s%-10s\n", st, maior);
            nVoos.remove(st);
        }
        out_cidades.close();
        
    }
}
