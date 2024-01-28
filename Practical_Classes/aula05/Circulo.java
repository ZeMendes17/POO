package aula05;

public class Circulo {
	private double raio;
	
	//Contrutor
	
	
	public Circulo(double raio) {
		this.raio = raio;
	}

	//Getters e setters

	public double getRaio() {
		return raio;
	}


	public void setRaio(double raio) {
		this.raio = raio;
	}

	
	//Overrides

	@Override
	public String toString() {
		return "Circulo [raio=" + raio + ", Area=" + Area() + ", Perimetro=" + Perimetro() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(raio);
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
		if (Double.doubleToLongBits(raio) != Double.doubleToLongBits(other.raio))
			return false;
		return true;
	}
	
	//outros métodos
	
	public double Area() {
		return Math.PI * Math.pow(this.raio, 2);
	}
	
	public double Perimetro() {
		return Math.PI * 2 * this.raio;
	}

}
