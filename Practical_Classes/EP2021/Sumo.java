package EP2021;

import java.util.ArrayList;

public class Sumo extends Bebida {

    private ArrayList<String> sumos = new ArrayList<>();

    public Sumo(String nome, String[] ingredientes, double preco) {
        super(nome, ingredientes, preco);
        sumos.add(nome);
    }
    

    public boolean isSumo(String s){
        if(sumos.contains(s))
            return true;
        return false;

    }
}
