package aula08;

public class Peixe extends Alimento {

    TipoPeixe tipo; // congelado ou fresco

    public Peixe(TipoPeixe tipo, double proteinas, double calorias, double peso) {
        super(proteinas, calorias, peso);
        this.tipo = tipo;
    }

    public TipoPeixe getTipo() {
        return tipo;
    }

    public void setTipo(TipoPeixe tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		result += super.hashCode();
		return result;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(!(obj instanceof Peixe))
            return false;
        Peixe other = (Peixe) obj;
        if(!(tipo.equals(other.getTipo()))){
            return false;
        }
        return true;

    }

    @Override
    public String toString() {
        return "Peixe " + getTipo() + ", " + super.toString();
    }
    
}
