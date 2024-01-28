package aula07;

public class Carro {
    private int id;
    private char classe;
    private String combustivel;
    private boolean disponivel;
    private static int counter = 0;

    public Carro(char c, String comb) {
        classe = c;
        combustivel = comb;
        disponivel = true;
        id = ++counter;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "Carro [Código=" + id + ", classe=" + classe + ", combustivel=" + combustivel + ", disponivel="
                + disponivel + "]";
    }

    public char getClasse() {
        return classe;
    }

    public void setClasse(char classe) {
        this.classe = classe;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Carro.counter = counter;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
}
