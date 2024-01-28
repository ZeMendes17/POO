package aula02;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         System.out.print("Montante investido: ");

         double montante = sc.nextDouble();

         System.out.print("Taxa: ");

         double taxa = sc.nextInt();

        double t = (1 + taxa / 100);

         double mf =  (Math.pow(t, 3)) * montante;

        System.out.println("Valor total: " + mf);

         sc.close();
    }
}
