package treino08;

public class Pesado extends Automovel {

    private int nQuadro;
    private int peso;

	public Pesado(String matricula, String marca, String modelo, int potencia, int nQuadro, int peso) {
		super(matricula, marca, modelo, potencia);
		this.nQuadro = nQuadro;
        this.peso = peso;
	}

    public int getNQuadro(){
        return nQuadro;
    }
    public int getPeso(){
        return peso;
    }

    @Override
    public String toString(){
        return super.toString() + "; Numero de quadro: " + nQuadro + "; Peso: " + peso;
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + nQuadro;
        result = prime * result + peso;
        return result;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(!(obj instanceof Pesado))
            return false;
        Pesado other = (Pesado) obj;
        if(!super.equals(other))
            return false;
        if(nQuadro != other.nQuadro)
            return false;
        if(peso != other.peso)
            return false;
        return true;
    }
    
}
