package aula08;

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

    public String toString() {
        return "Vegetariano " + super.toString();
    }
}
