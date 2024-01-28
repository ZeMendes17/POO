package aula03;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Escolha um número para fazer uma contagem decrescente: ");
        int numeroEscolhido = sc.nextInt();
        sc.close();

        while(numeroEscolhido >= 0){
            System.out.println(numeroEscolhido);
            numeroEscolhido--;
        }
    }
}
