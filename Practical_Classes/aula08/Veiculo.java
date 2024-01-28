package aula08;

public class Veiculo implements KmPercorridosInterface{
    private String matricula;
    private String marca;
    private String modelo;
    private int potencia;
    private int kmTotal = 0;
    private int kmPasso = 0;

    public Veiculo(String matricula, String marca, String modelo, int potencia) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
    }

    // getters
    public String getMatricula() {
        return matricula;
    }
    public String getModelo() {
        return modelo;
    }
    public String getMarca() {
        return marca;
    }
    public int getPotencia() {
        return potencia;
    }

    @Override
    public void trajeto(int quilometros) {
        kmPasso = quilometros;
        kmTotal += quilometros;
        
    }

    @Override
    public int ultimoTrajeto() {
        return kmPasso;
    }

    @Override
    public int distanciaTotal() {
        return kmTotal;
    }

    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Veiculo))
			return false;
		Veiculo other = (Veiculo) obj;
		if (potencia != other.potencia)
			return false;
		if (!marca.equalsIgnoreCase(other.marca))
			return false;
		if (!matricula.equals(other.getMatricula()))
			return false;
		if (!modelo.equalsIgnoreCase(other.getModelo()))
			return false;
		return true;

    }
}
