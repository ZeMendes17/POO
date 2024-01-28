package treino05;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int opt;
        Date data = null;
        int day;
        int month;
        int year;

        Scanner sc = new Scanner(System.in);

        do{
            menu();
            opt  = sc.nextInt();

            switch(opt){
                case 1:
                    System.out.print("Day: ");
                    day = sc.nextInt();
                    System.out.print("Month: ");
                    month = sc.nextInt();
                    System.out.print("Year: ");
                    year = sc.nextInt();

                    data = new Date(day, month, year);
                    break;
                case 2:
                    System.out.println("Date: " + data.toString());
                    break;
                case 3:
                    data.increment();
                    break;
                case 4:
                    data.decrement();
                    break;
                case 0:
                    System.out.println("Closing...");
                    break;
                default:
                    System.out.println("Error - choose another option");
                    break;
            }

        }while(opt != 0);

        sc.close();
    }

    public static void menu(){
        System.out.println();
        System.out.println("1 - create new date");
        System.out.println("2 - show currnet date");
        System.out.println("3 - increment date");
        System.out.println("4 - decremnet date");
        System.out.println("0 - exit");
        System.out.println();
    }
}
