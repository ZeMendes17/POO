package treino08;

public class Peixe extends Alimento {

    private TipoPeixe tipo;

    public Peixe(TipoPeixe tipo, double proteinas, double calorias, double peso) {
        super(proteinas, calorias, peso);
        this.tipo = tipo;
    }

    public void setTipo(TipoPeixe tipo){
        this.tipo = tipo;
    }
    public TipoPeixe getTipo(){
        return tipo;
    }

    @Override
    public String toString(){
        return "Peixe " + tipo + ", " + super.toString();
    }
    
}
