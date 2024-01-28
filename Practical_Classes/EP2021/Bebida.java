package EP2021;

public class Bebida {
    private String nome;
    private String[] ingredientes;
    private double preco;

    public Bebida(String nome, String[] ingredientes, double preco){
        this.nome = nome;
        this.ingredientes = ingredientes;
        this.preco = preco;
    }

    public String getNome(){
        return nome;
    }
    public String[] getIngredientes(){
        return ingredientes;
    }
    public double getPreco(){
        return preco;
    }

    public void setNome(String nome){
        this.nome = nome;
    }    
    public void setIngredientes(String[] ingredientes){
        this.ingredientes = ingredientes;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }

    public Bebida nome(String nome) {
        setNome(nome);
        return this;
    }

    public Bebida ingredientes(String[] ingredientes) {
        setIngredientes(ingredientes);
        return this;
    }

    public Bebida preco(double preco) {
        setPreco(preco);
        return this;
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        long temp;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((ingredientes == null) ? 0 : ingredientes.hashCode());
        temp = Double.doubleToLongBits(preco);
        result = prime * result + (int) ( temp ^ (temp >>> 32));
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
        Bebida other = (Bebida) obj;
        if(nome == null){
            if(other.nome != null)
                return false;
        }else if(!nome.equals(other.nome))
            return false;
        return true;
    }

    @Override
    public String toString(){
        return "{" +
        " nome='" + getNome() + "'" +
        ", ingredientes='" + getIngredientes() + "'" +
        ", preco='" + getPreco() + "'" +
        "}";
    }
}

