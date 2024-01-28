package aula02;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de agua? (Kg) ");

        double M = sc.nextDouble();

        System.out.print("Temperatura inicial (Celsius): ");

        double iT = sc.nextDouble();

        System.out.print("Temperatura final (Celsius): ");

        double fT = sc.nextDouble();

        double Q = M * (fT - iT) * 4184;

        System.out.println("Energia necessaria: " + Q + "Joules");
        sc.close();
    }
}
