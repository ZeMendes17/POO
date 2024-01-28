package aula07;

public abstract class Date {
    private int year, month, day = 0;

    // como o que vai mudar entre DateYMD e DateND vai ser os incrementos e os decrementos por causa das datas serem diferentes
    // vamos colocar increment e decrement como abstratos
    public abstract void Increment(int increment);

    public abstract void Decrement(int decrement);

    public static boolean valid(int day, int month, int year) {
        if (ValidMonth(month) && day < getDay(month, year) && year > 0)
            return true;
        else
            return false;
    }

    public static boolean ValidMonth(int month) {
        if (month <= 0 || month > 12)
            return true; // return is swapped because of the do while in DateMain
        else
            return false;
    }

    public static int getDay(int month, int year) {
        int days = 0;
        switch (month) {
            case 1, 3, 5, 8, 7, 10, 12:
                days = 31;
                break;
            case 4, 6, 9, 11:
                days = 30;
                break;
            case 2:
                if (LeapYear(year)) {
                    days = 29;
                } else
                    days = 28;
                break;
        }
        return days;
    }

    public static boolean LeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            return true;
        else
            return false;
    }
    public int getYear(){
        return year;
    }
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }
    public void setDay(int day){
        this.day = day;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public void setYear(int year){
        this.year = year;
    }
}
