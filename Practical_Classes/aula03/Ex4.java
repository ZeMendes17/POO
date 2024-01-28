package aula03;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        double i = 0.0;
        int total = 0;
        double soma = 0.0;
        double max;
        double min;

        Scanner sc = new Scanner(System.in);

        System.out.print("introduza vários números para obter o valor máximo, mínimo, a média e o total de números lidos (para terminar escreva o primeiro número introduzido): ");
        double num = sc.nextDouble();
        max = num;
        min = num;
        total += 1;
        soma += num;

        while(i != num){
            i = sc.nextDouble();
            
            if(i == num){
                break;
            }
            total += 1;
            soma += i;

            if(i > max){
                max = i;
            }
            if(i < min){
                min = i;
            }

        }

        double media = soma / total;

        System.out.println("Valor máximo: " + max);
        System.out.println("vallor minimo: " + min);
        System.out.println("Média: " + media);
        System.out.println("Total: " + total);

        sc.close();
    }
}
