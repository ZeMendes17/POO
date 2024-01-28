package aula05;
import java.util.Scanner;
public class Ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = 0;
        int month = 0;
        int year = 0;

        Date date = new Date(day, month, year);
        int op;
        do{
            menu();
            op = sc.nextInt();
            switch(op){
                case 1:
                    System.out.print("Escolha um dia: ");
                    day = sc.nextInt();
                    System.out.print("Escolha um mes: ");
                    month = sc.nextInt();
                    System.out.print("Escolha um ano: ");
                    year = sc.nextInt();

                    while(date.valid(day, month, year) == false){
                        System.out.println("Data não valida!");

                        System.out.print("Escolha um dia: ");
                        day = sc.nextInt();
                        System.out.print("Escolha um mes: ");
                        month = sc.nextInt();
                        System.out.print("Escolha um ano: ");
                        year = sc.nextInt();
                    }

                    date.setDate(day, month, year);
                break;

                case 2:
                System.out.println(date);
                break;

                case 3:
                date.increment(day, month, year);
                day = date.getDay();
                month = date.getMonth();
                year = date.getYear();
                break;

                case 4:
                date.decrement(day, month, year);
                day = date.getDay();
                month = date.getMonth();
                year = date.getYear();
                break;

            }

            // fazer switch e chamar as funcoes cosoante a escolha
            
        }while(op != 0);
        sc.close();
    }
    public static void menu(){
        System.out.println();
        System.out.println("Date operations:");
        System.out.println("1 - create new date");
        System.out.println("2 - show current date");
        System.out.println("3 - increment date");
        System.out.println("4 - decrement date");
        System.out.println("0 - exit");
    }
}
