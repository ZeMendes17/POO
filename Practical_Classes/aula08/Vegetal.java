package aula08;

public class Vegetal extends Alimento implements Vegetariano {

    String nome;

    public Vegetal(double proteinas, double calorias, double peso, String nome) {
        super(proteinas, calorias, peso);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result += super.hashCode();
		return result;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(!(obj instanceof Vegetal))
            return false;
        Vegetal other = (Vegetal) obj;
        if(!(nome.equals(other.getNome())))
            return false;
        return true;
    }

    public String toString() {
        return nome + ", " + super.toString();
    }
    

}
