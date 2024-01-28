package treino08;

public class Passageiros extends Pesado {

    private int maxPessoas;

    public Passageiros(String matricula, String marca, String modelo, int potencia, int nQuadro, int peso, int maxPessoas) {
		super(matricula, marca, modelo, potencia, nQuadro, peso);
		this.maxPessoas = maxPessoas;
	}


    public int getMaxPessoas(){
        return maxPessoas;
    }

    public String toString(){
        return super.toString() + "; Número máximo de passageiros: " + maxPessoas;
    }

    public int hashCode(){
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + maxPessoas;
        return result;
    }

    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(!(obj instanceof Mercadorias))
            return false;
        Passageiros other = (Passageiros) obj;
        if(!super.equals(other))
            return false;
        if(maxPessoas != other.maxPessoas)
            return false;
        return true;
    }
    
}
