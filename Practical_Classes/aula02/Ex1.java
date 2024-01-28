package aula02;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número em kilometros: ");

        double num = sc.nextDouble();

        double mile = num / 1.609;

        System.out.println("Isso corresponde a " + mile + " milhas");

        sc.close();
    }
}
