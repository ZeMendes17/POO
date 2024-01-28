package aula07;

public class Alojamento {
    private String codigo;
    private String nome;
    private String local;
    private double precoNoite;
    private boolean disponivel;
    private double avaliacao;

    public Alojamento(String cod, String n, String l, double prec, boolean disp, double aval) {
        codigo = cod;
        nome = n;
        local = l;
        precoNoite = prec;
        disponivel = disp;
        avaliacao = aval;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public double getPrecoNoite() {
        return precoNoite;
    }

    public void setPrecoNoite(double precoNoite) {
        this.precoNoite = precoNoite;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }

    @Override
    public String toString() {
        return "codigo=" + codigo + ", nome=" + nome + ", local=" + local + ", precoNoite=" + precoNoite
                + ", disponivel=" + disponivel + ", avaliacao=" + avaliacao;
    }
}
