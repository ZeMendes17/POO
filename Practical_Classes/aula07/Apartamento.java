package aula07;

public class Apartamento extends Alojamento {
    private int quartos;

    public Apartamento(String cod, String n, String l, double prec, boolean disp, double aval, int nQuartos) {
        super(cod, n, l, prec, disp, aval);
        quartos = nQuartos;
    }

    public int getQuartos() {
        return quartos;
    }

    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }

    @Override
    public String toString() {
        return "Apartamento [quartos=" + quartos + "".concat(super.toString());

    }
}
