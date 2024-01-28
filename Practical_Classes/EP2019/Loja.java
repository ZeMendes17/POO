package EP2019;
import java.util.TreeSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;;

public class Loja {
    
    private String nome;
    private String enderecoWeb;
    private TreeSet<Produto> produtos;

    public Loja(String nome, String enderecoWeb){
        this.nome = nome;
        this.enderecoWeb = enderecoWeb;
        this.produtos = new TreeSet<Produto>();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndercoWeb(){
        return enderecoWeb;
    }
    public void setEnderecoWeb(String enderecoWeb){
        this.enderecoWeb = enderecoWeb;
    }

    public Set<Produto> getProdutos() {
        return this.produtos;
    }

    public void setProdutos(TreeSet<Produto> produtos) {
        this.produtos = produtos;
    }
    
    public void add(Produto x) {
        produtos.add(x);
    }

    public int totalItems() {
        int x = 0;
        for (Produto y : produtos) {
            x += y.getStock();
        }
        return x;
    }

    public Produto getProdutoPelaDescricao(String string) {
        for(Produto p : produtos){
            if(p.getDescricao().equals(string)){
                return p;                
            }  
        }
        return null ;
    }

    public void reorder(){
        
    }

    public List<Produto> produtosPrecoFinalSuperiorA(double preco){
        List<Produto> lista = new ArrayList<>();
        for(Produto p : produtos){
            if(p.getPreco() > preco){
                lista.add(p);
            }
        }
        return lista;
    }

    public List<Electrodomestico> electrodomesticosClasseX(String s){
        List<Electrodomestico> lista = new ArrayList<>();
        for(Produto p : produtos){
            if(p instanceof Electrodomestico){
                Electrodomestico e = (Electrodomestico) p;

                if(e.getClasse().equals(s)){
                    lista.add(e);
                }
            }
        }
        return lista;
    }

    @Override
    public String toString() {
        String desc = nome + "\n";
        desc += String.format("%10s %-30s %10s %10s\n", "C�digo", "Produto", "Em Stock", "PVP");

        for (Produto p : produtos)
            desc += String.format("%10s %-30s %10d %10.2f\n", p.getCodigo(), p.getDescricao(), p.getStock(),
                    p.getPreco());

        return desc;
    }
}
