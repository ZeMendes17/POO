package treino05;
import java.time.OffsetDateTime;

public class Date {
    private int day;
    private int month;
    private int year;

    // contructor
    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    // setters e getters
    public void set(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public int getDay(int day){
        return day;
    }
    public int getMonth(int month){
        return month;
    }
    public int getYear(int year){
        return year;
    }

    // incrementar um dia na data
    public void increment(){
        day++;
        if(!(valid(day, month, year))){
            day = 1;
            month++;
        }
        if(!(validMonth(month))){
            month = 1;
            year++;
        }
    }
    // decrementar um dia na data
    public void decrement(){
        day--;
        if(!(valid(day, month, year))){
            if(month != 1)
                day = monthDays(month - 1, year);
            else
                day = 31;
            month--;
        }

        if(!(validMonth(month))){
            year--;
            month = 12;
        }

       
    }

    // verifica se um numero inteiro representa um mes
    public static boolean validMonth(int month){
        if(1 <= month && month <= 12)
            return true;

        return false;
    }
    // dias do mes de acordo com o ano
    public static int monthDays(int month, int year){
        int count[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(leapYear(year))
            count[1] = 29;
        
        return count[month - 1];
        
    }
    // verifica se o ano é bissexto
    public static boolean leapYear(int year){
        if (year % 400 == 0){
            return true;
        } else if ((year % 4 == 0) && (year % 100 != 0)){
            return true;
        } else{
            return false;
        }
    }
    // verifica se uma certa data é valida
    public boolean valid(int day, int month, int year){
        boolean res = true;
        int numbOfDays = monthDays(month, year);
        if(day < 1 || day > numbOfDays)
            res = false;
        if(!(validMonth(month)))
            res = false;
        if(year < 0 || year > 9999)
            res = false;

        return res;
    }

    public static Date today() {
		OffsetDateTime dt = OffsetDateTime.now();
		int d = dt.getDayOfMonth();
		int m = dt.getMonthValue();
		int a = dt.getYear();
		
		return new Date(d, m, a);
	}

    public String toString(){
        return year + "-" + month + "-" + day;
    }

}
