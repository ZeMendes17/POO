package EP2021;

import java.time.LocalDateTime;
import java.util.ArrayList;


public class Pedido {
    private LocalDateTime tempo;
    private String[] bebida;
    private ArrayList<Bebida> bebidas = new ArrayList<>();
    private double preco = 0;

    
    public Pedido(LocalDateTime tempo){
        this.tempo = tempo;
        this.bebida = null;
    }
    
    public Pedido(LocalDateTime tempo, String[] bebida){
        this.tempo = tempo;
        this.bebida = bebida;
    }


    public LocalDateTime getTempo(){
        return tempo;
    }
    public String[] getBebida(){
        return bebida;
    }
    public ArrayList<Bebida> getBebidas(){
        return bebidas;
    }

    public void setTempo(LocalDateTime tempo){
        this.tempo = tempo;
    }
    public void setBebida(String[] bebida){
        this.bebida = bebida;
    }
    

    public Pedido adiciona(Bebida b){
        bebidas.add(b);
        preco += b.getPreco();
        return this;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "{" +
                " bebidas='" + getBebidas() + "'" +
                "}";
    }

}
