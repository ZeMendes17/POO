package aula07;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.*;

public class Ex3 {
    public static Scanner sc = new Scanner(in);
    public static Agencia agc = new Agencia("Agencia", "teste", new ArrayList<Carro>(),
            new ArrayList<Alojamento>());

    public static void main(String[] args) {
        menu();
    }

    static void menu() {
        out.println("==========================");
        out.println("MENU DA AGENCIA");
        out.println("1 - ADICIONAR APARTAMENTO");
        out.println("2 - ADICIONAR QUARTO");
        out.println("3 - ADICIONAR CARRO");
        out.println("4 - LISTAR ALOJAMENTOS");
        out.println("5 - LISTAR CARROS");
        out.println("6 - EMPRESTAR CARRO");
        out.println("7 - RESERVAR");
        out.println("8 - SAIR");
        out.print("\n\n OPCAO ->");

        execMenu(sc.nextInt());

    }

    static void execMenu(int op) {
        switch (op) {
            case 1:
                agc.addAp();
                menu();
                break;
            case 2:
                agc.addQuarto();
                menu();
                break;
            case 3:
                agc.addCarro();
                menu();
                break;
            case 4:
                agc.listAloj();
                menu();
                break;
            case 5:
                agc.listCar();
                menu();
                break;
            case 6:
                agc.emprestarCarro();
                menu();
                break;
            case 7:
                agc.reservar();
                menu();
                break;
            case 8:
                exit(0);
                break;
            default:
                menu();
                op = sc.nextInt();
                break;

        }
    }
}
