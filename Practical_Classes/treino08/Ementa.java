package treino08;

import java.util.List;
import java.util.ArrayList;

public class Ementa {

    private String nome;
    private String local;
    private List<Prato> pratos = new ArrayList<>();


    public Ementa(String nome, String local){
        this.nome = nome;
        this.local = local;
    }

    public String getNome(){
        return nome;
    }
    public String getLocal(){
        return local;
    }

    public void addPrato(Prato p, DiaSemana d){
        pratos.add(p);
        p.setDia(d);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        for(Prato p : pratos){
            sb.append(p.toString() + "\n");
        }

        return sb.toString();
    }

    
}
