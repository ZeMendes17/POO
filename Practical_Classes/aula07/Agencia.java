package aula07;

import java.util.ArrayList;
import java.util.Scanner;

public class Agencia {
    private String nome;
    private String endereco;
    private ArrayList<Carro> carros;
    private ArrayList<Alojamento> alojamentos;
    private static Scanner sc = new Scanner(System.in);

    public Agencia(String nome, String endereco, ArrayList<Carro> car, ArrayList<Alojamento> aloj) {
        this.nome = nome;
        this.endereco = endereco;
        carros = car;
        alojamentos = aloj;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Carro> getCarros() {
        return carros;
    }

    public void setCarros(ArrayList<Carro> carros) {
        this.carros = carros;
    }

    public ArrayList<Alojamento> getAlojamentos() {
        return alojamentos;
    }

    public void setAlojamentos(ArrayList<Alojamento> alojamentos) {
        this.alojamentos = alojamentos;
    }

    private void add(Alojamento obj) {
        alojamentos.add(obj);
    }

    public void addAp() {
        System.out.println("CODIGO: ");
        String cd = sc.next();
        sc.nextLine();
        System.out.println("NOME: ");
        String nm = sc.next();
        sc.nextLine();
        System.out.println("LOCAL: ");
        String lc = sc.next();
        sc.nextLine();
        System.out.println("PREÇO DA NOITE: ");
        double pn = sc.nextDouble();
        System.out.println("DISPONIBILIDADE(Y/N): ");
        ;
        boolean dsp = askDisponibilidade(sc.next());
        System.out.println("AVALIAÇÃO: ");
        double avl = sc.nextDouble();
        System.out.println("NÚMERO DE QUARTOS: ");
        int q = sc.nextInt();

        this.add(new Apartamento(cd, nm, lc, pn, dsp, avl, q));
    }

    public void addQuarto() {
        System.out.print("CODIGO: ");
        String cd = sc.next();
        sc.nextLine();
        System.out.print("NOME: ");
        String nm = sc.next();
        sc.nextLine();
        System.out.print("LOCAL: ");
        String lc = sc.next();
        sc.nextLine();
        System.out.print("PREÇO DA NOITE: ");
        double pn = sc.nextDouble();
        System.out.print("DISPONIBILIDADE(Y/N): ");
        boolean dsp = askDisponibilidade(sc.next());
        System.out.print("AVALIAÇÃO: ");
        double avl = sc.nextDouble();
        System.out.print("TIPO: ");
        String t = sc.next();
        sc.nextLine();

        this.add(new QuartoHotel(cd, nm, lc, pn, dsp, avl, t));
    }

    private boolean askDisponibilidade(String c) {
        return c.equals("y") || c.equals("Y");
    }

    public void addCarro() {
        System.out.print("CLASSE: ");
        char c = (char) sc.next().charAt(0);
        sc.nextLine();
        System.out.print("COMBUSTIVEL: ");
        String comb = sc.next();
        carros.add(new Carro(c, comb));
    }

    public void listAloj() {
        for (Alojamento a : alojamentos) {
            System.out.println(a.toString());
        }
    }

    public void listCar() {
        for (Carro c : carros) {
            System.out.println(c.toString());
        }
    }

    public void emprestarCarro() {
        System.out.print("CÓDIGO: ");
        int cd = sc.nextInt();
        if (carros.get(findCarro(cd)).isDisponivel()) {
            carros.get(findCarro(cd)).setDisponivel(false);
            System.out.println("CARROS EMPRESTADO COM SUCESSO");
        } else {
            System.out.println("O CARRO NÃO ESTÁ DISPONÍVEL");
        }
    }

    private int findCarro(int id) {
        int i = 0;
        for (Carro c : carros) {
            if (c.getId() == id)
                break;
            i++;
        }
        return i;
    }

    public void reservar() {
        System.out.print("CÓDIGO");
        int id = sc.nextInt();

        if (alojamentos.get(findAloj(id)).isDisponivel()) {
            alojamentos.get(findAloj(id)).setDisponivel(false);
            System.out.println("RESERVA EFETUADA COM SUCESSO");
        } else {
            System.out.println("O ALOJAMENTO NÃO ESTÁ DISPONÍVEL");
        }
    }

    private int findAloj(int id) {
        int i = 0;
        for (Alojamento a : alojamentos) {
            if (Integer.parseInt(a.getCodigo()) == id)
                break;
            i++;
        }
        return i;
    }

}
