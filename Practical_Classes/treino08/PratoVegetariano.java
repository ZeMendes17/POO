package treino08;

public class PratoVegetariano extends Prato implements Vegetariano {

    public PratoVegetariano(String nome) {
        super(nome);
    }

    public boolean addIngrediente(Alimento a){
        if(!(a instanceof Vegetariano))
            return false;
        return super.addIngrediente(a);
    }

    @Override
    public boolean equals(Object obj) {
		if (!(obj instanceof Vegetariano))
			return false;
		return super.equals(obj);
	}

    @Override
    public String toString(){
        return "Prato " + super.getNome() + ", composto por " + super.getIngredientes().size() + " Ingredientes - Prato Vegetariano, dia "  + super.getDia();
    }
}
