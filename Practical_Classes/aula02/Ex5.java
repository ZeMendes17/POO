package aula02;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Velocidade 1: ");
        double v1 = sc.nextDouble();

        System.out.print("Distancia 1: ");
        double d1 = sc.nextDouble();

        System.out.print("Velocidade 2: ");
        double v2 = sc.nextDouble();

        System.out.print("Distancia 2: ");
        double d2 = sc.nextDouble();

        // v = d/t => t = d/v

        double t1 = d1 / v1;

        double t2 = d2 / v2;

        double t = t1 + t2;

        double d = d1 + d2;

        double vm = d / t;

        System.out.println("Velocidade media de: " + vm);


        sc.close();
    }
}
