package treino08;

public class Alimento {
    private double proteinas;
    private double calorias;
    private double peso;

    public Alimento(double proteinas, double calorias, double peso){
        this.proteinas = proteinas;
        this.calorias = calorias;
        this.peso = peso;
    }

    public void setProteinas(double proteinas){
        this.proteinas = proteinas;
    }
    public void setCalorias(double calorias){
        this.calorias = calorias;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }

    public double getProteinas(){
        return proteinas / 100; // relativo a 100gr
    }
    public double getCalorias(){
        return calorias; // 100; // relativo a 100gr
    }
    public double getPeso(){
        return peso;
    }

    @Override
    public String toString(){
        return "Proteinas: " + proteinas + ", calorias: " + calorias + ", Peso: " + peso;
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        long temp;
		temp = Double.doubleToLongBits(proteinas);
		result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(calorias);
		result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(peso);
		result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if (getClass() != obj.getClass())
			return false;
        Alimento other = (Alimento) obj;
        if (Double.doubleToLongBits(proteinas) != Double.doubleToLongBits(other.proteinas))
			return false;
        if (Double.doubleToLongBits(calorias) != Double.doubleToLongBits(other.calorias))
			return false;
        if (Double.doubleToLongBits(peso) != Double.doubleToLongBits(other.peso))
			return false;
        return true;
    }
    
}
