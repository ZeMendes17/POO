package aula04;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduza uma frase:");
        String frase = sc.nextLine();
        StringBuilder acronimo = new StringBuilder();
        sc.close();
        String[] arrFrase = frase.split(" ");

        for(int i = 0; i < arrFrase.length; i++) {
            if(arrFrase[i].length() >= 3) {
                String palavra = arrFrase[i];
                char letra = palavra.charAt(0);
                acronimo.append(letra);
            }
        }

        System.out.print("Acronimo: " + acronimo);
    }
    // usar o metodo split e verificar se tiver mais do que 3 de length adicionar
}
