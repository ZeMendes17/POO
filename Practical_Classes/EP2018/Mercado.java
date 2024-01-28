package EP2018;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;;

    public class Mercado {
        private String nome;
        private String endereço;
        private Set<Tenda> tendas;

    public Mercado(String nome, String endereço){
        this.nome = nome;
        this.endereço = endereço;
        this.tendas = new HashSet<>();
    }

    public Mercado(String nome, String endereço, Set<Tenda> tendas){
        this.nome = nome;
        this.endereço = endereço;
        this.tendas = tendas;
    }

    public String getNome(){
        return nome;
    }
    public String getEndereco(){
        return endereço;
    }
    public Set<Tenda> tendas(){
        return tendas;
    }

    public void add(Tenda t){
        tendas.add(t);
    }

    public int totalItems(){
        int total = 0;
        for(Tenda t : tendas){
            total += t.totalProdutos();
        }

        return total;
    }

    public List<String> getAllItems(){
        List<String> l = new ArrayList<>();

        for(Tenda t : tendas){
            for(String s : t.items()){
                l.add(s);
            }
        }
        l.sort((a, b) -> a.compareToIgnoreCase(b));
        return l;
    }

    @Override
    public String toString(){
        return "Mercado " + nome + "\n"
        + "Tendas: " + tendas();
    }
}
