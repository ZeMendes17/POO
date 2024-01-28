package EP2019;

public class Autor implements Comparable<Autor> {
    private String nome;
    private int ano;

    public Autor(String nome, int ano){
        this.nome = nome;
        this.ano = ano;
    }

    public String getNome(){
        return nome;
    }
    public int getAno(){
        return ano;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setAno(int ano){
        this.ano = ano;
    }

    public int compare(Autor a) {
        return this.nome.compareTo(a.nome);
    }

    @Override
    public String toString() {
        return nome + " (" + ano + "-)";
    }

    @Override
    public int compareTo(Autor o) {
        return this.ano;
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + ano;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
        Autor other = (Autor) obj;
        if(nome == null){
            if(other != null)
                return false;
        }else if(nome != other.nome)
            return false;
        if(ano != other.ano)
            return false;
        return true;

    }
    
}
