package aula07;

public abstract class Forma {

    private String cor;
    public static final double DOUBLE_PI = 2 * Math.PI;
        

    public abstract double area();
    public abstract double perimetro();
    public abstract String cor();

    public Forma(String cor) {
        this.cor = cor;
    }

    // set and get

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    // metodo para verificar se as cores das formas são iguais
    public boolean igual(Forma f) {
        if(cor.equals(f.getCor())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Cor: " + getCor();
    }
   
}
