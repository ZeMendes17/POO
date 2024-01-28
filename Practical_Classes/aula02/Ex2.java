package aula02;

import java.util.Scanner;


public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escolha uma temperatura em celsius para transformar em fahrenheit ");

        double cel = sc.nextDouble();

        double fr = 1.8 * cel + 32;
        
        System.out.println("Em fahrenheit: " + fr);

        sc.close();
    }
}
