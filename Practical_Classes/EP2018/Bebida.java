package EP2018;

public class Bebida {
    
    private String nome;
    private double teorAlc;

    public Bebida(String nome, double teorAlc){
        this.nome = nome;
        this.teorAlc = teorAlc;
    }

    public String getNome(){
        return nome;
    }
    public double getAlcool(){
        return teorAlc;
    }

    @Override
    public String toString(){
        return "[nome=" + nome + ", teorAlc=" + teorAlc + "]";
    }
}
