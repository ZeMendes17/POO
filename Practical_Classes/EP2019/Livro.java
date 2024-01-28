package EP2019;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Livro extends Produto {

    private String titulo;
    private Set<Autor> lista;
    private static final double IVA = 0.06;

    public Livro(String titulo, double preco) {
        super("L", preco);
        this.titulo = titulo;
        this.lista = new TreeSet<Autor>();

    }

    public Livro(String titulo, double preco, List<Autor> lista) {
        super("L", preco);
        this.titulo = titulo;
        this.lista = new TreeSet<>(Autor::compare);

        for (Autor x : lista) {
            this.lista.add(x);
        }
    }

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public Set<Autor> getLista(){
        return lista;
    }
    public Set<Autor> autores(){
        return lista;
    }

    
    public void add(Autor a){
        lista.add(a);
    }

    public int numeroAutores(){
        return lista.size();
    }

    @Override
    public double precoVendaAoPublico() {
        return this.getPreco() + this.getPreco() * IVA;
    }
    
    @Override
    public String getDescricao() {
        return titulo;
    }

    @Override
    public String toString() {
        return "{" +
                " titulo='" + getTitulo() + "'" +
                ", autores='" + getLista() + "'" +
                "}";
    }
    
    public int compareTo(Autor o) {
        return this.titulo.length();
    }

    @Override
    public int compareTo(Produto o) {
        // TODO Auto-generated method stub
        return 0;
    }
}
