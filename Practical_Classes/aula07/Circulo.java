package aula07;

public class Circulo extends Forma{

	protected double r;
	protected String cor = getCor();

	public String cor() {
		return getCor();
	}

	public Circulo(String cor) {
		super(cor);
	}
	public Circulo(double r, String cor) {
		super(cor);
		this.r = r;
	}

    public double getRaio() {
		return r;
	}


	public void setRaio(double raio) {
		this.r = raio;
	}

    @Override
    public double area() {
        return Math.PI*r*r;
    }

    @Override
    public double perimetro() {
        return DOUBLE_PI*r;
    }

    @Override
	public String toString() {
		return "Circulo [raio=" + r + ", Area=" + area() + ", Perimetro=" + perimetro() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(r);
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
		Circulo other = (Circulo) obj;
		if (Double.doubleToLongBits(r) != Double.doubleToLongBits(other.r))
			return false;
		if(!(cor.equals(other.getCor()))) {
			return false;
		}
		return true;
	}
    
}
