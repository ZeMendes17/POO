package aula04;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inttroduza uma frase: ");
        String frase = sc.nextLine();
        int number_of_digits = countDigits(frase);
        sc.close();
        System.out.println("Número de digitos: " + number_of_digits);
        int number_of_spaces = countSpaces(frase);
        System.out.println("Número de espaços: " + number_of_spaces);
        boolean min = onlySmall(frase);
        if(min) {
            System.out.println("Está frase apenas possui minusculas");
        }else {
            System.out.println("Está frase não possui apenas minusculas");
        }

        StringBuilder frase_espaços = toSpaces(frase);
        System.out.println("Frase com os espaços corrigidos: " + frase_espaços);

        boolean palindromo = isPolindrome(frase);

        if(palindromo) {
            System.out.println("A frase é um palindromo");
        }else {
            System.out.println("A frase não é um palindromo");
        }
    }
    public static int countDigits(String s) {
        int digits = 0;
        for(int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))) {
                digits++;
            }
        }
        return digits;
    }

    public static int countSpaces(String s) {
        int spaces = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                spaces++;
            }
        }
        return spaces;
    }

    public static boolean onlySmall(String s) {
        if(s.equals(s.toLowerCase())) {
            return true;
        }else {
            return false;
        }
        
    }

    public static StringBuilder toSpaces(String s) {
        StringBuilder rev = new StringBuilder();
        // adicionar enquanto for caracter, caso nao seja somar um " ", depois verfificar se o ultimo caracter é espaço ou nao
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != ' ') {
                rev.append(s.charAt(i));
            }else {
                if(rev.charAt(rev.length() - 1) !=  ' ') {
                    rev.append(" ");
                }
            }
        }
        return rev;
    }

    public static boolean isPolindrome(String s) {
        String inverse = new StringBuilder(s).reverse().toString();
        if(s.equals(inverse)) {
            return true;
        }else{
            return false;
        }
    }
}
