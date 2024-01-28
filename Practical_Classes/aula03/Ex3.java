package aula03;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduza um número positivo para verificar se é primo: ");
        int numero = sc.nextInt();

        while(numero <= 0){
            System.out.println("O numero entroduzido não é positivo, tente outra vez");
            System.out.print("Introduza um número positivo para verificar se é primo: ");
            numero = sc.nextInt();
        }
        sc.close();
        
        if(primo(numero) == true){
            System.out.println("É número primo");
        }else{
            System.out.println("Não é número primo");
        }

    }

    private static boolean primo(int x){

        if(x == 1){
            return false;
        }
        
        for(int i = 2; i < x; i++){
            if(x % i == 0){
                return false;
            }

        }
        return true;
    }
}
