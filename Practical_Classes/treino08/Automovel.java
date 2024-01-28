package treino08;

public class Automovel implements KmPercorridosInterface {

    private String matricula;
    private String marca;
    private String modelo;
    private int potencia;
    private int totalKm = 0;
    private int trajetoKm = 0;


    public Automovel(String matricula, String marca, String modelo, int potencia){
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
    }

    public String getMatricula(){
        return matricula;
    }
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public int getPotencia(){
        return potencia;
    }

    
    @Override
    public String toString(){
        return marca + " " + modelo +"; " + matricula + "; Potência: " + potencia;
    }

    @Override
    public int hashCode(){
        final int prime = 31;
		int result = 1;
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + potencia;
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		return result;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Automovel other = (Automovel) obj;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		if (potencia != other.potencia)
			return false;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
        if (modelo == null) {
            if (other.modelo != null)
                return false;
        } else if (!modelo.equals(other.modelo))
            return false;
		return true;
    }


	@Override
	public void trajeto(int quilometros) {
		trajetoKm = quilometros;
        totalKm += quilometros;
		
	}

	@Override
	public int ultimoTrajeto() {
		return trajetoKm;
	}

	@Override
	public int distanciaTotal() {
		return totalKm;
	}
    
}
