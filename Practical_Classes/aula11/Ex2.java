package aula11;
// esqueci me e so criei as classes depois, tambem podem ser usadas com a mesma logica que este programa

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.PrintWriter;
import java.io.File;
import java.util.Collections;

public class Ex2 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new FileReader("src/aula11/voos.txt"));
        Scanner input_companhias = new Scanner(new FileReader("src/aula11/companhias.txt"));
        HashMap<String, String> companhias = new HashMap<>();
        HashMap<String, ArrayList<Integer>> atrasos = new HashMap<>();
        HashMap<String, Integer> voosTotais = new HashMap<>();
        // colocar as siglas e as compamnhias num hashmap, quando a sigla for igual mudar
        // usar  split de 0 a 2 para obter so as duas primeiras siglas
        PrintWriter out = new PrintWriter(new File("src/aula11/Infopublico.txt"));
        while(input_companhias.hasNextLine()){ // guarda as companhias em sigla=nome
            String words[] = input_companhias.nextLine().split("\\t");
            if(words[0].equals("Sigla")){
                continue;
            } else{
                companhias.put(words[0], words[1]);
            }
        }
        input_companhias.close();


        System.out.printf("%-15s%-15s%-30s%-25s%-15s%-15s\n", "Hora", "Voo", "Companhia", "Origem", "Atraso", "Obs");
        out.printf("%-15s%-15s%-30s%-25s%-15s%-15s\n", "Hora", "Voo", "Companhia", "Origem", "Atraso", "Obs");
        while(input.hasNextLine()){
            String words[] = input.nextLine().split("\\t");
            if(words[0].equals("Hora"))
                continue;

            String horas_s[] = words[0].split(":");
            int horas[] = {Integer.parseInt(horas_s[0]),Integer.parseInt(horas_s[1])};

            // numero de voos com a origem no mesmo local
            if(voosTotais.containsKey(words[2])){
                voosTotais.replace(words[2], voosTotais.get(words[2]) + 1);
            } else{
                voosTotais.put(words[2], 1);
            }

            String companhia = companhias.get(words[1].substring(0, 2));
            if(words.length == 3){
                System.out.printf("%-15s%-15s%-30s%-25s\n", words[0], words[1], companhia, words[2]);
                out.printf("%-15s%-15s%-30s%-25s\n", words[0], words[1], companhia, words[2]);
            } else{

                String atraso_s[] = words[3].split(":");
                int atraso = Integer.parseInt(atraso_s[1]);
                int minutos = (horas[1] + atraso);
                if(atrasos.containsKey(companhia)){
                    atrasos.get(companhia).add(atraso);
                } else{
                    atrasos.put(companhia, new ArrayList<>());
                    atrasos.get(companhia).add(atraso);
                }
                if(minutos >= 60){
                    minutos -= 60;
                    int length = String.valueOf(minutos).length(); // para por os dois digitos na parte dos minutos
                    if(length == 2){
                        System.out.printf("%-15s%-15s%-30s%-25s%-15s%-15s\n", words[0], words[1], companhia, words[2], words[3], "Previsto: " + (horas[0] + 1) + ":" + minutos);
                        out.printf("%-15s%-15s%-30s%-25s%-15s%-15s\n", words[0], words[1], companhia, words[2], words[3], "Previsto: " + (horas[0] + 1) + ":" + minutos);
                    }
                    else{
                        System.out.printf("%-15s%-15s%-30s%-25s%-15s%-15s\n", words[0], words[1], companhia, words[2], words[3], "Previsto: " + (horas[0] + 1) + ":" + minutos + "0");
                        out.printf("%-15s%-15s%-30s%-25s%-15s%-15s\n", words[0], words[1], companhia, words[2], words[3], "Previsto: " + (horas[0] + 1) + ":" + minutos + "0"); 
                    }

                } else{
                    int length = String.valueOf(minutos).length();
                    if(length == 2){
                        System.out.printf("%-15s%-15s%-30s%-25s%-15s%-15s\n", words[0], words[1], companhia, words[2], words[3], "Previsto: " + (horas[0]) + ":" + minutos);
                        out.printf("%-15s%-15s%-30s%-25s%-15s%-15s\n", words[0], words[1], companhia, words[2], words[3], "Previsto: " + (horas[0]) + ":" + minutos); 
                    }
                    else{
                        System.out.printf("%-15s%-15s%-30s%-25s%-15s%-15s\n", words[0], words[1], companhia, words[2], words[3], "Previsto: " + (horas[0]) + ":" + minutos + "0");
                        out.printf("%-15s%-15s%-30s%-25s%-15s%-15s\n", words[0], words[1], companhia, words[2], words[3], "Previsto: " + (horas[0]) + ":" + minutos + "0");
                    } 
                }
            }
        }
        input.close();
        out.close();


        // exercicio c)
        HashMap<String, Double> atrasoMedio = new HashMap<>();
        PrintWriter out_voos = new PrintWriter(new File("src/aula11/cidades.txt"));
        for(String s : atrasos.keySet()){
            Double soma = 0.0;
            int quant = 0;
            for(int i : atrasos.get(s)){
                soma += i;
                quant++;
            }
            Double c = soma / quant;
            atrasoMedio.put(s, c);
        }
        System.out.println();
        while(atrasoMedio.size() != 0) {
            Double menor = Collections.max(atrasoMedio.values());
            String companhia_maior = atrasoMedio.keySet().iterator().next();
            for(String s : atrasoMedio.keySet()){
                if(atrasoMedio.get(s) < menor){
                    companhia_maior = s;
                    menor = atrasoMedio.get(s);
                }
            }
            atrasoMedio.remove(companhia_maior);
            System.out.printf("%-30s%-15s\n", companhia_maior, menor);

        }
        System.out.println();
        System.out.printf("%-30s%-10s\n", "Orgem", "Voos");
        out_voos.printf("%-30s%-10s\n", "Orgem", "Voos");
        while(voosTotais.size() != 0) {
            int maior = Collections.min(voosTotais.values());
            String companhia_maior = voosTotais.keySet().iterator().next();
            for(String s : voosTotais.keySet()){
                if(voosTotais.get(s) > maior){
                    companhia_maior = s;
                    maior = voosTotais.get(s);
                }
            }
            voosTotais.remove(companhia_maior);
            System.out.printf("%-30s%-10s\n", companhia_maior, maior);
            out_voos.printf("%-30s%-10s\n", companhia_maior, maior);
        }
        out_voos.close();
    }
}
