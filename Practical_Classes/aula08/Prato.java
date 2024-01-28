package aula08;

import java.util.ArrayList;
import java.lang.Comparable;

public class Prato implements Comparable<Prato> {

    String nome;
    ArrayList<Alimento> ingredientes = new ArrayList<Alimento>();
    double caloriasTotais = 0;
    private DiaSemana  dia;

    
    public Prato(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean addIngrediente(Alimento al) {
        for(Alimento i : ingredientes){
            if(i == al){
                return false;
            }

        }
        ingredientes.add(al);
        caloriasTotais += al.getCalorias();
        return true;
    }

    public double getCaloriasTotais() {
        return caloriasTotais;
    }

    public DiaSemana getDia() {
        return dia;
    }

    public void setDia(DiaSemana dia) {
        this.dia = dia;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
		int result = 1;
		result = prime * result + ((ingredientes == null) ? 0 : ingredientes.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		for(Alimento a:ingredientes) {
			result+=a.hashCode();
		}
		return result;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(!(obj instanceof Prato))
            return false;
        Prato other = (Prato) obj;
        if(!(nome.equals(other.getNome())))
            return false;
        if(!(ingredientes.equals(other.ingredientes)))
            return false;
        return true;
    }

    public String toString() {
        return "Prato " + nome + " composto por " + ingredientes.size() + " Ingredientes";
    }




    @Override
    public int compareTo(Prato o) {
        if(this.caloriasTotais > o.getCaloriasTotais())
			return 1;
		else if(this.caloriasTotais < o.getCaloriasTotais())
			return -1;
		return 0;
    }
    
}
