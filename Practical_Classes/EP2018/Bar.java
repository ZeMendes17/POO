package EP2018;

import java.util.ArrayList;

import java.util.List;

import java.util.Collection;

public class Bar extends Tenda {

    List<Bebida> lista = new ArrayList<>();


    public Bar(int numero, String nome) {
        super(numero, nome);
    }

    public Bar(int numero, String nome, List<Bebida> lista) {
        super(numero, nome);
        this.lista = lista;
    }

    public boolean add(Bebida b){
        if(lista.contains(b)){
            return false;
        }else{
            lista.add(b);
            return true;
        }
    }

    public List<Bebida> getLista(){
        return lista;
    }

    public int totalProdutos(){
        return lista.size();
    }

    @Override
    public Collection<String> items(){
        List<String> l = new ArrayList<>();

        for(Bebida b :lista){
            l.add(b.toString());
        }

        return l;
    }
    
    
}
