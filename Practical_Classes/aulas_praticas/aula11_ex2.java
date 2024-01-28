package aulas_praticas;

import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

public class aula11_ex2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int num = 0;

        Scanner input = new Scanner(new FileReader("numerosPrimos.txt"));
        while(input.hasNext()) {
            String word = input.next();
            int n = Integer.parseInt(word);
            soma += n;
            num++;

        }
        float media = soma / num;
        System.out.println("A soma dos numeros primos entre 1 e 1000 é: " + soma);
        System.out.println("E a sua media é: " + media);



        sc.close();
    }
}
