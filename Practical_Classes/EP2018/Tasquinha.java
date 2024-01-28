package EP2018;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Tasquinha extends Tenda {

    Set<String> pratos = new HashSet<>();

    public Tasquinha(int numero, String nome) {
        super(numero, nome);
    }

    public Tasquinha(int numero, String nome, String[] array) {
        super(numero, nome);

        for(String s : array){
            pratos.add(s);
        }
    }

    public void addPrato(String p){
        pratos.add(p);
    }

    public Set<String> getPratos(){
        return pratos;
    }


    @Override
    public int totalProdutos() {
        return pratos.size();
    }

    @Override
    public Collection<String> items(){
        return pratos;
    }
    
}
