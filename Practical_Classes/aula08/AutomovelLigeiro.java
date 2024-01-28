package aula08;

public class AutomovelLigeiro extends Veiculo{

    private int numDeQuadro;
    private int capDaBag;

    public AutomovelLigeiro(String matricula, String marca, String modelo, int potencia, int numDeQuadro, int capDaBag) {
        super(matricula, marca, modelo, potencia);
        this.numDeQuadro = numDeQuadro;
        this.capDaBag = capDaBag;
    }

    public int getNumDeQuadro() {
        return numDeQuadro;
    }
    public int getCapDaBag() {
        return capDaBag;
    }

    public void setNumDeQuadro(int numDeQuadro) {
        this.numDeQuadro = numDeQuadro;
    }
    public void setCapDaBag(int capDaBag) {
        this.capDaBag = capDaBag;
    }

    @Override
    public String toString() {
        return "Matricula: " + getMatricula() + "; Marca: " + getMarca() + "; Modelo: " + getModelo() + 
        "; Potência: " + getPotencia() + "; Capacidade da Bagageira: " + getCapDaBag() + "; Número do quadro: " + getNumDeQuadro();
    }

    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof AutomovelLigeiro))
			return false;
		AutomovelLigeiro other = (AutomovelLigeiro) obj;
		if(!super.equals(other))
			return false;
		if (capDaBag!=other.getCapDaBag())
			return false;
        if (numDeQuadro!=other.getNumDeQuadro())
			return false;
		return true;
	}
}
