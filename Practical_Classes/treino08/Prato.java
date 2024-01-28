package treino08;

import java.util.List;
import java.util.ArrayList;
import java.lang.Comparable;

public class Prato implements Comparable<Prato> {

    private String nome;
    private List<Alimento> ingredientes = new ArrayList<>();
    private double caloriasTotais;
    private DiaSemana  dia;

    public Prato(String nome){
        this.nome = nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }

    public double getCaloriasTotais(){
        return caloriasTotais;
    }

    public DiaSemana getDia() {
        return dia;
    }

    public void setDia(DiaSemana dia) {
        this.dia = dia;
    }

    public List<Alimento> getIngredientes(){
        return ingredientes;
    }


    public boolean addIngrediente(Alimento a){
        for(Alimento al : ingredientes){
            if(a.equals(al))
                return false;
        }
        ingredientes.add(a);
        caloriasTotais += a.getCalorias();
        return true;
    }

    @Override
    public String toString(){
        return "Prato " + nome + ", composto por " + ingredientes.size() + " Ingredientes, dia " + getDia();
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + ((ingredientes == null) ? 0 : ingredientes.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        for(Alimento a : ingredientes) {
			result += a.hashCode();
		}
        return result;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        Prato other = (Prato) obj;
        if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
        if(ingredientes == null){
            if(other.nome != null)  
                return false;
        } else if(!ingredientes.equals(other.ingredientes))
            return false;
        return true;
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
