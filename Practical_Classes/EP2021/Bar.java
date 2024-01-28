package EP2021;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bar {
    private String nome;
    private List<Pedido> pedidos = new ArrayList<>();
    private ArrayList<Bebida> bebidas = new ArrayList<>();

    public Bar(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public List<Pedido> getPedidos(){
        return pedidos;
    }


    public ArrayList<Bebida> getBebidas() {
        return this.bebidas;
    }

    public boolean adicionaBebida(Bebida b){
        if(!bebidas.contains(b)){
            bebidas.add(b);
            return true;
        }else{
            return false;
        }
    }

    public Pedido novoPedido(LocalDateTime l){
        Pedido pedido = new Pedido(l);
        pedidos.add(pedido);
        return pedido;

    }
    public Pedido novoPedido(LocalDateTime l, String[] s){
        Pedido p = new Pedido(l, s);
        pedidos.add(p);
        return p;
    }

    public Iterator<Pedido> iterator(){
        pedidos.sort((a, b) -> Double.compare(a.getPreco(), b.getPreco()));
        Iterator<Pedido> it = pedidos.iterator();
        return it;
    }

    @Override
    public String toString(){
        return "{" +
        " nome='" + getNome() + "'" +
        ", bebidas='" + getBebidas() + "'" +
        "}";
    }
}
