package aula05;
import java.time.OffsetDateTime;

public class Date implements Comparable<Date>{
    
    int year;
    int month;
    int day;

    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }


    public static boolean validMonth(int month) {
        if(month >= 1 && month <= 12){ return true;}else{
            return false;
        }
    }

    public static int monthDays(int month, int year) {
        if(month == 2){
            if(leapYear(year)) {
                return 29;
            }else {
                return 28;
            }
        }else {
            if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
                return 31;
            }else{
                return 30;
            }
        }
    }
    public static boolean leapYear(int year) {
        if (year % 400 == 0){
            return true;
        } else if ((year % 4 == 0) && (year % 100 != 0)){
            return true;
        } else{
            return false;
        }
    }

    public boolean valid(int day, int month, int year) {
        if(year <= 0 || year >= 9999){

            return false;
        }
        if(!validMonth(month)){
            return false;
        }
        int dias = monthDays(month, year);
        if(day <= 0 || day > dias){
            return false;
        }
        return true;
    }

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
   
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }

    public void increment(int day, int month, int year) {
        int dias = monthDays(month, year);
        if(day == dias){
            if(month == 12){
                day = 1;
                month = 1;
                this.year = year++;
            }else{
                day = 1;
                this.month = month++;
                this.year = year;
            }
        }else{
            this.day = day++;
            this.month = month;
            this.year = year;
        }
        setDate(day, month, year);
    }

    public void decrement(int day, int month, int year){
        if(day == 1){
            if(month == 1){
                month = 12;
                this.year = year--;
                int dias = monthDays(month, year);
                day = dias;
            }else{
                this.month = month--;
                this.year = year;
                int dias = monthDays(month, year);
                day = dias;
            }
        }else{
            this.day = day--;
            this.month = month;
            this.year = year;
        }
        setDate(day, month, year);
    }

    public String toString() {
        return year + "-" + month + "-" + day;
    }

    public static Date today() {
		OffsetDateTime dt = OffsetDateTime.now();
		int d = dt.getDayOfMonth();
		int m = dt.getMonthValue();
		int a = dt.getYear();
		
		return new Date(d, m, a);
	}


    @Override
	public int compareTo(Date d) {
		if(this.year - d.year !=0) {
			return this.year-d.year;
		} else if(this.month - d.month !=0) {
			return this.month-d.month;
		} else if(this.day - d.day !=0) {
			return this.day-d.day;
		}
		return 0;	
	}


}

// adicionar metodo para saber a quantidade de dias entre duas datas
