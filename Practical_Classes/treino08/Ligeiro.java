package treino08;

public class Ligeiro extends Automovel {
    private int nQuadro;
    private int capacidade;

	// public Ligeiro(String matricula, String marca, String modelo, int potencia) {
	// 	super(matricula, marca, modelo, potencia);
	// }

    public Ligeiro(String matricula, String marca, String modelo, int potencia, int nQuadro, int capacidade) {
		super(matricula, marca, modelo, potencia);
        this.nQuadro = nQuadro;
        this.capacidade = capacidade;
	}

    public int getNQuadro(){
        return nQuadro;
    }
    public int getCapacidade(){
        return capacidade;
    }

    @Override
    public String toString(){
        return super.toString() + "; Número de quadro: " + nQuadro + ": Capacidade da Bagageira: " + capacidade;
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + nQuadro;
        result = prime * result + capacidade;
        return result;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(!(obj instanceof Ligeiro))
            return false;
        Ligeiro l = (Ligeiro) obj;
        if(!super.equals(l))
            return false;
        if(nQuadro != l.nQuadro)
            return false;
        if(capacidade != l.capacidade)
            return false;
        return true;
    }
    
}
