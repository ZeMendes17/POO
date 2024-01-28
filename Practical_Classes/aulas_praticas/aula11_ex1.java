package aulas_praticas;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class aula11_ex1 {
    public static void main(String[] args) throws Exception {
        // pedir o nome do ficheiro e escrever nele os num primos de 1 a 1000
        // depois criar outro script que leia o ficheiro e apresente a soma e a media dos numeros
        // programa que peça o nome de um ficheiro e so quando este existe, imprime o seu conteudo em maiusculas

        Scanner sc = new Scanner(System.in);
        String file_name = sc.nextLine();
        sc.close();

        ArrayList<Integer> p = primos(1, 1000);
        
        PrintWriter writer = new PrintWriter(file_name, "UTF-8");
        

        for(int i : p) {
            writer.println(Integer.toString(i));
        }
        writer.close();

        
    }

    public static ArrayList<Integer> primos(int x, int y) {
        ArrayList<Integer> prime = new ArrayList<>();

        for(int i = x; i <= y; i++) {
            if(primo(i)){
                prime.add(i);
            }
        }
        return prime;
    }

    public static boolean primo(int f) {
        if(f == 1) {
            return false;
        }

        for(int i = f - 1; i > 1; i--) {
            if(f % i == 0) {
                return false;
            }
        }
        return true;
    }
}
