package aula04;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduza uma palavra, frase ou paragrafo: ");
        String frase = sc.nextLine();
        sc.close();
        String minusculas = frase.toLowerCase();
        System.out.println("A sua frase em letras minusculas: " + minusculas);

        int comprimento = frase.length();

        System.out.println("O último caracter da frase é: " + frase.charAt(comprimento - 1));
        

        System.out.printf("Os 3 primeiros caracteres são: %1s, %1s e %1s. \n", frase.charAt(0), frase.charAt(1), frase.charAt(2));
    
        char[] ch = new char[frase.length()];
        int j = 0;
        for(int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i) != ' ' && frase.charAt(i) != '\t') {
                j++;
            }
            ch[i] = frase.charAt(i);

        }
        
        System.out.println("Número de caracteres (sem contar com os espaços): " + j);

        String maiusculas = frase.toUpperCase();
        System.out.println("A sua frase em letras maiusculas: " + maiusculas);

        if(frase.startsWith("a") || frase.startsWith("A")){
            System.out.println("A sua  frase começa com a letra A");
        }else {
            System.out.println("A sua frase não começa com a letra A");
        }
    }
}
