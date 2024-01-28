package treino05;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int opt;
        Calendario cal = null;
        int year;
        int firstDay;

        Scanner sc = new Scanner(System.in);

        do{
            menu();
            opt = sc.nextInt();
            
            switch(opt){
                case 1:
                    System.out.print("Year: ");
                    year = sc.nextInt();
                    System.out.print("First WeekDay of the Month: ");
                    firstDay = sc.nextInt();

                    cal = new Calendario(year, firstDay);
                    break;
                case 2:
                    System.out.println("Month: ");
                    int m = sc.nextInt();
                    System.out.println(cal.printMonth(m));
                    break;
                case 3:
                   System.out.println( cal.toString());
                   break;
                case 0:
                    System.out.println("Closing...");
                default:
                    System.out.println("Operation invalid, choose a valid one");
                    break;
            }
        }while(opt != 0);

        sc.close();
    }

    public static void menu(){
        System.out.println();
        System.out.println("Calendar operations:");
        System.out.println("1 - create new calendar");
        System.out.println("2 - print calendar month");
        System.out.println("3 - print calendar");
        System.out.println("0 - exit");
        System.out.println();
    }
}
