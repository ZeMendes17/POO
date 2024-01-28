package aula08;

public class Alimento {
    double proteinas, calorias, peso;

    public Alimento(double proteinas, double calorias, double peso) {
        this.proteinas = proteinas;
        this.calorias = calorias;
        this.peso = peso;
    }

    public double getProteinas() {
        return proteinas * peso / 100; // pois é relativo a 100gr
    }
    public double getCalorias() {
        return calorias * peso / 100; // pois é relativo a 100gr
    }
    public double getPeso() {
        return peso;
    }

    public void setProteinas(double proteinas) {
        this.proteinas = proteinas;
    }
    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public int hashCode() {
        return (int) (proteinas + calorias + peso);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(!(obj instanceof Alimento))
            return false;
        Alimento other = (Alimento) obj;
        if(calorias != other.getCalorias())
            return false;
        if(proteinas != other.getProteinas())
            return false;
        if(peso != other.getPeso())
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Proteinas: " + getProteinas() + "; Calorias: " + getCalorias() + "; Peso: " + getPeso();
    }

}
