package treino05;

public class Calendario {
    private int year;
    private int firstDay;
    
    // constructor
    public Calendario(int year, int firstDay){
        this.year = year;
        this.firstDay = firstDay;
    }

    // getters
    public int year(){
        return year;
    }
    public int firstWeekdayOfYear(){
        return firstDay;
    }

    // retrurns first day of a month
    public int firstWeekdayOfMonth(int month){
        int numb = firstDay;

        for(int i = 1; i < month; i++){
            numb += Date.monthDays(i, year);
            numb %= 7;
            if(numb == 0){
                numb = 7;
            }
        }
        return numb;
    }

    public String printMonth(int month){
        StringBuilder sb = new StringBuilder();
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "Noverber", "December"};

        // System.out.printf("%14s %-10d \n" , months[month - 1], year);
        // System.out.printf(" %3s %3s %3s %3s %3s %3s %3s \n", "Su", "Mo", "Tu", "We", "Th", "Fr", "Sa");
        sb.append(String.format("%16s %-10d \n" , months[month - 1], year));
        sb.append(String.format(" %3s %3s %3s %3s %3s %3s %3s \n", "Su", "Mo", "Tu", "We", "Th", "Fr", "Sa"));

        int first = firstWeekdayOfMonth(month);

        int days[] = new int[50];

        int c = 1;
        for(int i = first - 1; i < Date.monthDays(month, year) + first - 1; i++){
            days[i] = c;
            c++;
        }

        int count = 0;
        for(int i = 0; i <= 5; i++){
            for(int k = 0; k <= 6; k++){
                if(days[count] == 0){
                    // System.out.printf("%4s", " ");
                    sb.append(String.format("%4s", " "));
                } else{
                    // System.out.printf("%4d", days[count]);
                    sb.append(String.format("%4d", days[count]));
                }

                count++;
            }
            // System.out.println();
            sb.append("\n");
        }
        String fin = sb.toString();
        return fin;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= 12; i++){
            sb.append(printMonth(i));
        }
        String res = sb.toString();
        return res;
    }
}
