package treino08;

public class Taxi extends Ligeiro {

    private String licenca;

	public Taxi(String matricula, String marca, String modelo, int potencia, int nQuadro, int capacidade, String licenca) {
		super(matricula, marca, modelo, potencia, nQuadro, capacidade);
        this.licenca = licenca;
	}

    public String getLicenca(){
        return licenca;
    }

    public String toString(){
        return super.toString() + "; Número de licença; " + licenca;
    }

    public int hashCode(){
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((licenca == null)? 0 : licenca.hashCode());
        return result;
    }

    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(!(obj instanceof Taxi))
            return false;
        Taxi other = (Taxi) obj;
        if(!super.equals(other))
            return false;
        if(licenca == null){
            if(other.licenca != null)
                return false;
        } else if(!licenca.equals(other.licenca))
            return false;
        return true;
    }
}
