package treino08;

public class PratoDieta extends Prato {
    private double limite;

    public PratoDieta(String nome, double limite) {
        super(nome);
        this.limite = limite;
    }

    public void setLimite(double limite){
        this.limite = limite;
    }

    public double getLimite(){
        return limite;
    }

    public boolean addIngrediente(Alimento a){
        if(a.getCalorias() + super.getCaloriasTotais() > limite)
            return false;
        return super.addIngrediente(a);
    }

    @Override
    public String toString(){
        return "Prato " + super.getNome() + ", composto por " + super.getIngredientes().size() + " Ingredientes - Dieta (" + super.getCaloriasTotais() + " Calorias) , dia " + super.getDia();
    }

    

}
