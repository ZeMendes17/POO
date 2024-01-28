package aula04;
import java.util.Scanner;


public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Mês? ");
        int mes = sc.nextInt();

        System.out.print("Ano? ");
        int ano = sc.nextInt();

        System.out.print("Dia da semana em que começa o mês (ex: segunda = 1, terça = 2 etc.) ");
        int dia = sc.nextInt();

        sc.close();
        calendario(mes, ano, dia);
    }

    public static void calendario(int m, int a, int d) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "Noverber", "December"};

        System.out.printf("%14s %-10s \n" , months[m - 1], a);
        System.out.printf(" %3s %3s %3s %3s %3s %3s %3s \n", "Su", "Mo", "Tu", "We", "Th", "Fr", "Sa");
        // print a 6 linhas do calendario

        
        int[] arr_calendario = new int [50];

        int numero_dias = diasMes(m, a);

        int j = 1;
        if(d == 7) {
            for(int i = 0; i <= numero_dias + d; i++) {
                if(j <= numero_dias){
                    arr_calendario[i] = j;
                    j++;
                }
            }
        }else {
            for(int i = d; i <= numero_dias + d; i++) {
                if(j <= numero_dias){
                    arr_calendario[i] = j;
                    j++;
                }
            }
        }

        //for(int i = 0; i < arr_calendario.length; i++){
        //    System.out.println(arr_calendario[i]);
        //}

        int count = 0;
        for(int i = 0; i <= 5; i++){
            for(int k = 0; k <= 6; k++){
                if(arr_calendario[count] == 0){
                    System.out.printf("%4s", " ");
                } else{
                    System.out.printf("%4d", arr_calendario[count]);
                }

                count++;
            }
            System.out.println();
        }
    }
    public static int diasMes(int mes,  int ano){
        if(mes == 2){
            Boolean res = bissexto(ano);

            if(res == true){
                return 29;
            }else{
                return 28;
            }

        } else{
            if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
                return 31;
            }else{
                return 30;
            }
        }
    }

    public static boolean bissexto(int x){
        if (x % 400 == 0){
            return true;
        } else if ((x % 4 == 0) && (x % 100 != 0)){
            return true;
        } else{
            return false;
        }
    }
}
