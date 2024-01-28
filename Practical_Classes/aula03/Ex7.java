package aula03;
import java.util.Scanner;
import java.util.Random;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = randomNumber(0, 100);
        
        System.out.print("Escolha um numero entre 0 e 100: ");
        int numberC = sc.nextInt();

        game(numberC, a);

        sc.close();
    }

    private static int randomNumber(int min, int max){
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public static void game(int x, int y){
        Scanner sc = new Scanner(System.in);
        int tries = 0;

        while(x != y){
            if(x > y){
                tries +=1;
                System.out.println("Alto");
                x = sc.nextInt();

            }else{
                tries += 1;
                System.out.println("Baixo");
                x = sc.nextInt();
            }
        }
        tries += 1;

        System.out.println("Parabens acertou o numero");
        System.out.println("Numero de tentativas: " + tries);

        System.out.print("Pretende continuar? Prima (S)im: ");
        String resposta = sc.next();

        if(resposta.equals("s") || resposta.equals("S") || resposta.equals("sim") || resposta.equals("Sim")){
            System.out.print("Escolha um numero entre 0 e 100: ");
            x = sc.nextInt();
            y = randomNumber(0, 100);
            game(x, y);

        }else{
            System.out.println("Jogo Terminado");
        }

        sc.close();
    }
}
