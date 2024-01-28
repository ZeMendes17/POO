package aula03;

import java.util.Scanner;


public class Ex1 {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Nota da prática: ");
    float notaP = sc.nextFloat();

    while(notaP < 0.0 || notaP > 20.0){
        System.out.println("O número introduzido tem de ser entre 0 e 20!");
        System.out.print("Nota da prática: ");
        notaP = sc.nextFloat();
    }

    System.out.print("Nota da teorica: ");
    float notaT = sc.nextFloat();

    while(notaT < 0.0 || notaT > 20.0){
        System.out.println("O número introduzido tem de ser entre 0 e 20!");
        System.out.print("Nota da prática: ");
        notaT = sc.nextFloat();
    }

    sc.close();

    if(notaP < 7.0 || notaT < 7.0){
        System.out.println("66");
    }else{
        double nota = 0.4 * notaT + 0.6 * notaP;

        System.out.printf("A nota obtida é  %02.1f", nota);

        }
    }

}

