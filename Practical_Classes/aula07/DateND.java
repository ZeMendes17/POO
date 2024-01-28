package aula07;


public class DateND extends aula07.Date {
    int year;
    int month;
    int day;
    long res;
    

    public DateND(int year, int month, int day) {
        this.day = day;
        this.month = month;
        this.year = year;

        int janeiro_dia = 0; // conta tambem com o proprio dia
        int janeiro_mes = 1;
        int janeiro_ano = 2000;
        long result = 0;

        if(year == janeiro_ano){
            if(month == janeiro_mes){
                result = Math.abs(day - janeiro_dia);
            }else{
                int[] diasAno = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
                for(int i = 1; i != month; i++){
                    int mes = diasAno[i - 1];
                    result += mes;
                }

                result += Math.abs(day - janeiro_dia);
            }

        }else{
            result += day;

            if(aula05.Date.leapYear(year)){
                int[] diasAno = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

                for(int i = 1; i != month; i++){
                    int mes = diasAno[i - 1];
                    result += mes;
                }

            }else{
                int[] diasAno = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
                for(int i = 1; i != month; i++){
                    int mes = diasAno[i - 1];
                    result += mes;
                }
            }

            for(int i = year; i != 2000; i--){
                if(aula05.Date.leapYear(year)){
                    result += 366;
                }else{
                    result += 365;
                }
            }

        }
        this.res = result;
    }

    /* public static long diasEntre(int year, int month, int day) {
        int janeiro_dia = 1;
        int janeiro_mes = 1;
        int janeiro_ano = 2000;
        long res = 0;

        if(year == janeiro_ano){
            if(month == janeiro_mes){
                res = Math.abs(day - janeiro_dia);
            }else{
                int[] diasAno = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
                for(int i = 1; i != month; i++){
                    int mes = diasAno[i - 1];
                    res += mes;
                }

                res += Math.abs(day - janeiro_dia);
            }

        }else{
            res += day;

            if(aula05.Date.leapYear(year)){
                int[] diasAno = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

                for(int i = 1; i != month; i++){
                    int mes = diasAno[i - 1];
                    res += mes;
                }

            }else{
                int[] diasAno = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
                for(int i = 1; i != month; i++){
                    int mes = diasAno[i - 1];
                    res += mes;
                }
            }

            for(int i = year; i != 2000; i--){
                if(aula05.Date.leapYear(year)){
                    res += 366;
                }else{
                    res += 365;
                }
            }

        }

        return res;
    } */

    @Override
    public String toString() {
        return " " + Math.abs(res) + " days";
    }

    public void Increment(int increment) {
        res = res + increment;
    }

    public void Decrement(int decrement) {
        res = res - decrement;
    }
}
