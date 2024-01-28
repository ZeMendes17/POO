package treino07;

public class Circulo extends Forma {
    protected double raio;
    protected String cor = getCor();


    public String cor() {
		return getCor();
	}
    public Circulo(double raio, String cor){
        super(cor);
        this.raio = raio;
    }

    public void setRaio(double raio){
        this.raio = raio;
    }

    public double getRaio(){
        return raio;
    }


	@Override
	public double area() {
		return Math.pow(raio, 2) * Math.PI;
	}

	@Override
	public double perimetro() {
		return this.DOUBLE_PI * raio;
	}

    @Override
    public String toString(){
        return "Circulo " + super.toString() + "; raio: " + raio;
    }

    @Override
    public int hashCode(){
        final int prime = 31;
		int result = super.hashCode();
        long temp = Double.doubleToLongBits(raio);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
    }

    @Override
    public boolean equals(Object obj){
        if(!super.equals(obj)){
            return false;
        }
        if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circulo other = (Circulo) obj;
		if (Double.doubleToLongBits(raio) != Double.doubleToLongBits(other.raio))
			return false;
		return true;
    }    
}
