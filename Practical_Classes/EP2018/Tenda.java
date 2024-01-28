package EP2018;

import java.util.Collection;

public abstract class Tenda implements ItensInterface {

    private int numero;
    private String nome;

    public Tenda(int numero, String nome){
        this.nome = nome;
        this.numero = numero;
    }

    public int getNumero(){
        return numero;
    }
    public String getNome(){
        return nome;
    }

    @Override
    public String toString(){
        return "Tenda [num=" + numero + ", nome=" + nome + "]";
    }

    @Override
    public Collection<String> items() {
        return null;
    }

    public abstract int totalProdutos();

    
}
