package EP2019;

public abstract class Produto implements PVP, Comparable<Produto> {
    private String codigo;
    private int quantidade;
    private double preco;
    private static int codigo_atual = 1000;

    public Produto(String inicio, double preco) {
        this.codigo = inicio + Integer.toString(codigo_atual);
        codigo_atual += 2;
        this.preco = preco;
    }

    public String getCodigo(){
        return codigo;
    }
    public int getStock(){
        return quantidade;
    }
    public double getPreco(){
        return preco;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public void setStock(int quantidade){
        this.quantidade = quantidade;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }

    public void addStock(int x) {
        quantidade += x;
    }

    public boolean vender(int x) {
        boolean controlo = true;
        int stock = this.getStock();

        if (stock - x < 0) {
            controlo = false;
        }
        setStock(stock - x);
        return controlo;
    }
    

    public abstract String getDescricao();
}
