package aula08;

public class PesadoDePassageiros extends Veiculo {

    private int numQuadro;
    private int peso;
    private int numMaxPassageiros;

    public PesadoDePassageiros(String matricula, String marca, String modelo, int potencia, int numQuadro, int peso, int numMaxPassageiros) {
        super(matricula, marca, modelo, potencia);
        this.numQuadro = numQuadro;
        this.peso = peso;
        this.numMaxPassageiros = numMaxPassageiros;
    }

    public int getNumQuadro() {
        return numQuadro;
    }
    public int getPeso() {
        return peso;
    }
    public int getPassageiros() {
        return numMaxPassageiros;
    }

    public void setNumQuadro(int numQuadro) {
        this.numQuadro = numQuadro;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public void setCargaMax(int numMaxPassageiros) {
        this.numMaxPassageiros = numMaxPassageiros;
    }

    @Override
    public String toString() {
        return "Matricula: " + getMatricula() + "; Marca: " + getMarca() + "; Modelo: " + getModelo() + 
        "; Potência: " + getPotencia() + "; Número da Quadro: " + getNumQuadro() + "; Peso: " + getPeso() + "; Número Máximo de Passageiros: " + getNumQuadro();
    }

    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof PesadoDePassageiros))
			return false;
		PesadoDePassageiros other = (PesadoDePassageiros) obj;
		if(!super.equals(other))
			return false;
		if (numMaxPassageiros != other.numMaxPassageiros)
			return false;
        if (peso != other.peso)
			return false;
        if (numQuadro != other.numQuadro)
			return false;
		return true;
	}
}
