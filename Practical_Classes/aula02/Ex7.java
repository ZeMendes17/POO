package aula02;

import java.lang.Math;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduza as coordeenadas de um ponto x: ");
        double x1= sc.nextDouble();
        double x2= sc.nextDouble();

        System.out.print("Introduza as coordeenadas de um ponto y: ");
        double y1 = sc.nextDouble();
        double y2= sc.nextDouble();

        double d = Math.sqrt(Math.pow(y2 - x2, 2) + Math.pow(y1 - x1, 2));

        System.out.println("A distancia entre x e y é: " + d);

        sc.close();
    }
}
