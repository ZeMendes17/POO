package treino07;

public abstract class Forma {

    public final double DOUBLE_PI = 2 * Math.PI;
    private String cor;
    
    public abstract double area();
    public abstract double perimetro();

    public Forma(String cor){
        this.cor = cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }
    public String getCor(){
        return cor;
    }

    @Override
    public String toString(){
        return "Cor: " + cor;
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cor == null) ? 0 : cor.hashCode());
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
        Forma other = (Forma) obj;
        if (cor == null) {
			if (other.cor != null)
				return false;
		} else if (!cor.equals(other.cor))
			return false;
        return true;
    }
}
