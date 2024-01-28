package aula05;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int op;
        Calendario newDate =  null; //inicializada aqui para não dar erro no switch
        int y;
        int m;
        int first;

        do{
            System.out.println();
            System.out.println("1 - Criar nova data");
            System.out.println("2 - Imprimir um mês do calendário");
            System.out.println("3 - Imprimir calendário");
            System.out.println("0 - Sair");
            System.out.println();
            System.out.print("Operação: ");
            op = sc.nextInt();

            switch(op){
                case 0:
                    System.out.println("Encerrando...");
                    break;
                case 1:
                    System.out.print("Insira um ano: ");
                    y=sc.nextInt();
                    System.out.print("Insira o primeiro dia da semana do mês: ");
                    System.out.printf(" %9s | %9s | %9s | %9s | %9s | %9s | %9s \n","1=Domingo","2=Segunda","3=Terça","4=Quarta","5=Quinta","6=Sexta","7=Sábado");
                    first=sc.nextInt();
                    if(first>=1 && first<=7){
                        newDate= new Calendario(y,first);
                    }else{
                        System.out.println("Erro! Insira um dia da semana válido.");
                    }
                    break;
                case 2:
                System.out.print("Insira um mês: ");
                    m=sc.nextInt();
                    if(Date.validMonth(m)){
                        System.out.print(newDate.printMonth(m));
                    }else{
                        System.out.println("Erro! Insira um mês válido.");
                    }
                    break;
                case 3:
                    System.out.print(newDate);
                    break;
                default:
                    System.out.println("Erro! Escolha uma opção válida");
                    break;
            }
        }while(op!=0);
        sc.close();
    }
}
