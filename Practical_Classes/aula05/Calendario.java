package aula05;

public class Calendario {
    private int ano;
    private int inicio;
    
    public Calendario(int ano, int inicio) {
        this.ano = ano;
        this.inicio = inicio;
    }

    private String[] semana = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    private String[] mes = {"January","February","March","April","May","June","July","August","September","October","November","December"};

    public int getYear() {
        return ano;
    }

    public String getFirstWeekdayOfYear() {
        return semana[inicio - 1]; // caso seja 1 da return a domingo (0), 2 segunda (1) etc...
    }

    public int firstWeekdayOfMonth(int m){
        int inic = inicio;
        for(int i = 1; i < m; i++){
            inic += Date.monthDays(i ,ano);
            inic %= 7;
            if(inic == 0){
                inic = 7;
            }
        }
        return inic;
    }


    
    public String printMonth(int month) { // 1-janeiro; 12- dezembro, logo remover 1.
        int dia_inicial = firstWeekdayOfMonth(month) - 1;
        StringBuilder sb = new StringBuilder("");

        sb.append("    " + mes[month - 1] + " " + ano + "\n");
        sb.append("Su Mo Tu We Th Fr Sa \n");

        //System.out.printf("%14s %-10s \n" , mes[month - 1], ano);
        //System.out.printf(" %3s %3s %3s %3s %3s %3s %3s \n", "Su", "Mo", "Tu", "We", "Th", "Fr", "Sa");

        int[] arr_calendario = new int [50];
        int dias_num_mes = Date.monthDays(month, ano);

        int j = 1;
        if(dia_inicial == 7) {
            for(int i = 0; i <= dias_num_mes + dia_inicial; i++) {
                if(j <= dias_num_mes){
                    arr_calendario[i] = j;
                    j++;
                }
            }
        }else {
            for(int i = dia_inicial; i <= dias_num_mes + dia_inicial; i++) {
                if(j <= dias_num_mes){
                    arr_calendario[i] = j;
                    j++;
                }
            }
        }

        int count = 0;
        for(int i = 0; i <= 5; i++){
            for(int k = 0; k <= 6; k++){
                if(arr_calendario[count] == 0){
                    // System.out.printf("%4s", " ");
                    sb.append("   ");
                } else{
                    // System.out.printf("%4d", arr_calendario[count]);
                    if(Integer.toString(arr_calendario[count]).length() == 1){
                    sb.append(" " + arr_calendario[count] + " ");
                    }else{
                        sb.append(arr_calendario[count] + " ");
                    }
                }

                count++;
            }
            // System.out.println();
            sb.append("\n");
        }
        return sb.toString();

    }

    public String toString(){
        StringBuilder sb= new StringBuilder("");
        for(int i=1;i<=12;i++){
            sb.append(printMonth(i));
        }
        return sb.toString();
    }
}
