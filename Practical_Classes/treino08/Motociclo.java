package treino08;

public class Motociclo extends Automovel {

    private String tipo; // desportivo e estrada

	// public Motociclo(String matricula, String marca, String modelo, int potencia) {
	// 	super(matricula, marca, modelo, potencia);
	// }

    public Motociclo(String matricula, String marca, String modelo, int potencia, String tipo) {
		super(matricula, marca, modelo, potencia);
        if(!tipo.equals("desportivo") && !tipo.equals("estrada")) throw new IllegalArgumentException("tipo inválido");
        this.tipo = tipo;
	}
    
    public String getTipo(){
        return tipo;
    }

    @Override
    public String toString(){
        return super.toString() + "; Tipo: " + tipo;
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

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
        return result;
    }

}
