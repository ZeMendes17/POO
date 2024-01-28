package aula07;

import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Date date1 = null;
        Date date2 = null;
        int answer, year = 0, month = 0, day = 0, increment, decrement;
        var sc = new Scanner(System.in);
        do {
            System.out.print("Date Operations: \n 1- create new date \n 2- show current date \n 3- increment date \n 4- decrement date  \n 0- exit \n Select Option: ");
            answer = sc.nextInt();
            if (answer == 1) {
                do {
                    System.out.print("Ano? ");
                    year = sc.nextInt();
                } while (year <= 0);
                do {
                    System.out.print("Mês? ");
                    month = sc.nextInt();
                } while (DateYMD.ValidMonth(month));
                do {
                    System.out.print("Dia? ");
                    day = sc.nextInt();
                } while (day > DateYMD.getDay(month, year));
                date1 = new DateYMD(year, month, day);
                date2 = new DateND(year, month, day);
                System.out.print("\033[H\033[2J"); // CLEAR CONSOLE
                System.out.println("Date created sucessfully! \n---------------------------------");
                System.out.println("Current date: " + date1.toString() + "\n---------------------------------");
                System.out.println("Distance to 2000/1/1 - " + date2.toString() + "\n---------------------------------");
            }
            if (answer == 2) {
                System.out.print("\033[H\033[2J"); // CLEAR CONSOLE
                if (date1 == null)
                    System.out.println("No date has been created yet!");
                else
                    System.out.println("Current date: " + date1.toString() + "\n---------------------------------");
                System.out.println("Distance to 2000/1/1 - " + date2.toString() + "\n---------------------------------");
            }
            if (answer == 3) {
                if (date1 != null && date2 != null ){
                System.out.print("Whats the increment ( in days ): ");
                increment = sc.nextInt();
                date1.Increment(increment);
                date2.Increment(increment);
                System.out.print("\033[H\033[2J"); // CLEAR CONSOLE
                System.out.println("New Date: " + date1.toString() + "\n---------------------------------");
                System.out.println("Distance to 2000/1/1 - " + date2.toString() + "\n---------------------------------");
            }
            else {
                System.out.println("No date has been created yet!");
            }
            }
            if (answer == 4) {
                if (date1 != null && date2 != null){
                System.out.print("Whats the decrement ( in days ): ");
                decrement = sc.nextInt();
                date1.Decrement(decrement);
                date2.Decrement(decrement);
                System.out.print("\033[H\033[2J"); // CLEAR CONSOLE
                System.out.println("New Date: " + date1.toString() + "\n---------------------------------");
                System.out.println("Distance to 2020/1/1 - " + date2.toString() + "\n---------------------------------");
                }
                else {
                    System.out.println("No date has been created yet!");
                }
            }
        } while (answer != 0);
        sc.close();
    }
}
