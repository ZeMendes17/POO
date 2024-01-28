package treino05;

public class Triangulo {
    private double l1;
	private double l2;
	private double l3;
	
	//Construtores
	
	public Triangulo(double l1, double l2, double l3) {
        if(l1 > 0)
		    this.l1 = l1;
        if(l2 > 0) 
            this.l2 = l2;
        if(l3 > 0) 
            this.l3 = l3;
	}

	//getters e setters
	
	public double getL1() {
		return l1;
	}

	public double getL2() {
		return l2;
	}

	public double getL3() {
		return l3;
	}

	public void setL1(double l1) {
        if(l1 > 0)
		    this.l1 = l1;
	}   

	public void setL2(double l2) {
        if(l2 > 0)
		    this.l2 = l2;
	}

	public void setL3(double l3) {
        if(l3 > 0)
		    this.l3 = l3;
	}
	
	//Overrides

	@Override
	public String toString() {
		return "Triangulo [lado1=" + l1 + ", lado2=" + l2 + ", lado3=" + l3 + ", Perimetro=" + Perimetro() + ", Area="
				+ Area() + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(l1);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(l2);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(l3);
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
		Triangulo other = (Triangulo) obj;
		if (Double.doubleToLongBits(l1) != Double.doubleToLongBits(other.l1))
			return false;
		if (Double.doubleToLongBits(l2) != Double.doubleToLongBits(other.l2))
			return false;
		if (Double.doubleToLongBits(l3) != Double.doubleToLongBits(other.l3))
			return false;
		return true;
	}

	//outros métodos
	
	public double Perimetro() {
		return (l1 + l2 + l3);
	}
	
	public double Area() {				
		double p = this.Perimetro()/2;
		return Math.sqrt(p*(p-l1)*(p-l2)*(p-l3));
    }
}
