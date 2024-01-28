package aula02;

import java.lang.Math;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

        System.out.print("Escolha o valor dos catetos para determinar a hipotenusa: ");

        System.out.print("Cateto A: ");
        double x = sc.nextDouble();

        System.out.print("Cateto B: ");
        double y = sc.nextDouble();

        double h = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        System.out.println("Hipotnusa: " + h);

        double ang = Math.atan(y / x);
        double a = (ang * 180) / Math.PI;


        System.out.println("Angulo: " + a);
        sc.close();

    }
}
