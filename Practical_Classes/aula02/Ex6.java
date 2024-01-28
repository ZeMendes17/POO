package aula02;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Numero de segundos: ");

        int sec = sc.nextInt();

        int h = sec / 3600;

        int resto = sec % 3600;

        int m = resto / 60;

        int s = resto % 60;

        System.out.println(h + ":" + m + ":" + s);

        sc.close();
    }
}
