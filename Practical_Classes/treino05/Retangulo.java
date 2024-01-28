package treino05;

public class Retangulo {
    private double comprimento;
    private double altura;

    public Retangulo(double comprimento, double altura){
        if(comprimento > 0)
            this.comprimento = comprimento;
        if(altura > 0)
            this.altura = altura;
    }

    public void setAltura(double altura){
        if(altura > 0)
            this.altura = altura;
    }
    public void setComprimento(double comprimento){
        if(comprimento > 0)
            this.comprimento = comprimento;
    }

    public double getAltura(){
        return altura;
    }
    public double getComprimento(){
        return comprimento;
    }

    @Override
    public String toString(){
        return "Retangulo de altura: " + altura + " e comprimento: " + comprimento; 
    }

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(altura);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(comprimento);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Retangulo other = (Retangulo) obj;
		if (Double.doubleToLongBits(altura) != Double.doubleToLongBits(other.altura))
			return false;
		if (Double.doubleToLongBits(comprimento) != Double.doubleToLongBits(other.comprimento))
			return false;
		return true;
	}

    public double area(){
        return altura * comprimento;
    }

    public double perimetro(){
        return 2 * altura + 2 * comprimento;
    }
}
