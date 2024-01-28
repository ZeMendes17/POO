package aula03;
import java.util.Scanner;


public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduza um mês: ");
        int mes = sc.nextInt();

        System.out.print("Introduza um ano: ");
        int ano = sc.nextInt();

        sc.close();

        if(mes == 2){
            Boolean res = bissexto(ano);

            if(res == true){
                System.out.println("28");
            }else{
                System.out.println("29");
            }

        } else{
            if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
                System.out.println("31");
            }else{
                System.out.println("30");
            }
        }

    }
    private static boolean bissexto(int x){
        if (x % 400 == 0){
            return true;
        } else if ((x % 4 == 0) && (x % 100 != 0)){
            return true;
        } else{
            return false;
        }
    }
}
