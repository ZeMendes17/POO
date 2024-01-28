package aula08;

public class PesadoDeMercadorias extends Veiculo{

    private int numQuadro;
    private int peso;
    private double cargaMax; 

    public PesadoDeMercadorias(String matricula, String marca, String modelo, int potencia, int numQuadro, int peso, double cargaMax) {
        super(matricula, marca, modelo, potencia);
        this.numQuadro = numQuadro;
        this.peso = peso;
        this.cargaMax = cargaMax;
    }

    public int getNumQuadro() {
        return numQuadro;
    }
    public int getPeso() {
        return peso;
    }
    public double getCargaMax() {
        return cargaMax;
    }

    public void setNumQuadro(int numQuadro) {
        this.numQuadro = numQuadro;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public void setCargaMax(double cargaMax) {
        this.cargaMax = cargaMax;
    }

    @Override
    public String toString() {
        return "Matricula: " + getMatricula() + "; Marca: " + getMarca() + "; Modelo: " + getModelo() + 
        "; Potência: " + getPotencia() + "; Número da Quadro: " + getNumQuadro() + "; Peso: " + getPeso() + "; Carga Máxima: " + getCargaMax();
    }

    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof PesadoDeMercadorias))
			return false;
		PesadoDeMercadorias other = (PesadoDeMercadorias) obj;
		if(!super.equals(other))
			return false;
		if (cargaMax != other.getCargaMax())
			return false;
        if (peso != other.getPeso())
			return false;
        if (numQuadro != other.getNumQuadro())
			return false;
		return true;
	}	

}


