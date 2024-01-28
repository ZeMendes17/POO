package aula08;

public class Carne extends Alimento {

    VariedadeCarne tipo; // vaca, porco, peru, frango, outra

    public Carne(VariedadeCarne tipo, double proteinas, double calorias, double peso) {
        super(proteinas, calorias, peso);
        this.tipo = tipo;
    }

    public VariedadeCarne getTipo() {
        return tipo;
    }

    public void setTipo(VariedadeCarne tipo) {
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
        if(!(obj instanceof Carne))
            return false;
        Carne other = (Carne) obj;
        if(!(tipo.equals(other.getTipo()))){
            return false;
        }
        return true;

    }

    @Override
    public String toString() {
        return "Carne " + getTipo() + ", " + super.toString();
    }
}
