package aula08;

public class Taxi extends AutomovelLigeiro {

    private String numDeLicenca;

    public Taxi(String matricula, String marca, String modelo, int potencia, int numDeQuadro, int capDaBag, String numDeLicenca) {
        super(matricula, marca, modelo, potencia, numDeQuadro, capDaBag);
        this.numDeLicenca = numDeLicenca;
    }
    
    public String getNumDeLicenca() {
        return numDeLicenca;
    }
    public void setNumDeLicenca(String numDeLicenca) {
        this.numDeLicenca = numDeLicenca;
    }

    @Override
    public String toString() {
        return "Matricula: " + getMatricula() + "; Marca: " + getMarca() + "; Modelo: " + getModelo() + 
        "; Potência: " + getPotencia() + "; Número da Licença: " + getNumDeLicenca();
    }

    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Taxi))
			return false;
		Taxi other = (Taxi) obj;
		if(!super.equals(other))
			return false;
		if (!numDeLicenca.equalsIgnoreCase(other.getNumDeLicenca()))
			return false;
		return true;
	}
}
