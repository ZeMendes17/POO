package treino08;

public class Carne extends Alimento {

    private TipoCarne tipo;

    public Carne(TipoCarne tipo, double proteinas, double calorias, double peso) {
        super(proteinas, calorias, peso);
        this.tipo = tipo;
    }

    public void setTipo(TipoCarne tipo){
        this.tipo = tipo;
    }

    public TipoCarne getTipo(){
        return tipo;
    }

    @Override
    public String toString(){
        return "Carne " + tipo + ", " + super.toString();
    }
    
}
