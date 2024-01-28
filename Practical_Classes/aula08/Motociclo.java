package aula08;

public class Motociclo extends Veiculo {

    String tipo;

    public Motociclo(String matricula, String marca, String modelo, int potencia, String tipo) {
        super(matricula, marca, modelo, potencia);
        if(!tipo.equals("desportivo") && !tipo.equals("estrada")) throw new IllegalArgumentException("tipo inválido");

        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public String toString() {
        return "Matricula: " + getMatricula() + "; Marca: " + getMarca() + "; Modelo: " + getModelo() + 
            "; Potência: " + getPotencia() + "; Tipo: " + getTipo();
    }

    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Motociclo))
			return false;
		Motociclo m = (Motociclo) obj;
		if(!super.equals(m))
			return false;
		if (!tipo.equals(m.tipo))
			return false;
		return true;
	}	
}
