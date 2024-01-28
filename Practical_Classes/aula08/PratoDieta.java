package aula08;

public class PratoDieta extends Prato {

    double limiteCalorias;
    double calorias = 0;

    public PratoDieta(String nome, double limiteCalorias) {
        super(nome);
        this.limiteCalorias = limiteCalorias;
    }

    public double getLimiteCalorias() {
        return limiteCalorias;
    }

    public void setLimiteCalorias(double limiteCalorias) {
        this.limiteCalorias = limiteCalorias;
    }

    public boolean addIngrediente(Alimento a) {
        if(a.getCalorias() + calorias > limiteCalorias){
            return false;
        }
        return super.addIngrediente(a);
    }

    public String toString() {
        return "Dieta (" + limiteCalorias + " Calorias) "+super.toString();
    }
    
}
