package aula03;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número de montante investido(múltiplo de 1000 e positivo): ");
        double investimento = sc.nextDouble();

        while(investimento < 0.0 || investimento % 1000 != 0){
            System.out.println("Valor introduzido não é válido!");
            System.out.print("Positivo e múltiplo de 1000: ");
            investimento = sc.nextDouble();

        }

        System.out.print("Taxa de juro mensal? (0% - 5%): ");
        float per = sc.nextFloat();

        while(per < 0.0 || per > 5.0){
            System.out.println("Valor introduzido não é válido!");
            System.out.print("Enrte 0% e 5%: ");
            per = sc.nextFloat();
        }
        sc.close();

        for(int j = 0; j <= 12; j++){
            double mais = investimento * (per / 100);
            investimento += mais;

            System.out.printf("Valor do mês " + j +" é %.2f\n", mais);
        }
        System.out.printf("Total: %.2f", investimento);
    }
}
