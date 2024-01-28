package aula07;

public class Bola extends ObjetoMovel {

    private String cor;

	public Bola(int x, int y, double distanciaPercorrida) {
		super(x, y, distanciaPercorrida);
        this.cor = "Branca";
	}
    public Bola(int x, int y, double distanciaPercorrida, String cor) {
		super(x, y, distanciaPercorrida);
        this.cor = cor;
	}

    public void setCor(String cor){
        this.cor = cor;
    }
    public String getCor(){
        return cor;
    }


    @Override
    public String toString(){
        return "Bola " + cor + " de coordenadas: (" + super.getX() + ", "+ super.getY() + ") e distancia percorrida: " + super.getDistanciaPercorrida();
    }
}
