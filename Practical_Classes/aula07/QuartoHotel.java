package aula07;

public class QuartoHotel extends Alojamento {
    private String tipo;

    public QuartoHotel(String cod, String n, String l, double prec, boolean disp, double aval, String t) {
        super(cod, n, l, prec, disp, aval);
        tipo = t;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "QuartoHotel [tipo=" + tipo + "".concat(super.toString());
    }

}
