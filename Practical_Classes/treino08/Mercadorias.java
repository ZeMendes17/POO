package treino08;

public class Mercadorias extends Pesado {

    private int cargaMax;

	public Mercadorias(String matricula, String marca, String modelo, int potencia, int nQuadro, int peso, int cargaMax) {
		super(matricula, marca, modelo, potencia, nQuadro, peso);
		this.cargaMax = cargaMax;
	}

    public int getCargaMax(){
        return cargaMax;
    }

    public String toString(){
        return super.toString() + "; Carga Máxima: " + cargaMax;
    }

    public int hashCode(){
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + cargaMax;
        return result;
    }

    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(!(obj instanceof Mercadorias))
            return false;
        Mercadorias other = (Mercadorias) obj;
        if(!super.equals(other))
            return false;
        if(cargaMax != other.cargaMax)
            return false;
        return true;
    }
    
}
