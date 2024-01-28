package aula07;

public class Robo extends ObjetoMovel {
    private String id;
    private String tipoJogador; // GuardaRedes, Avancado, Defesa, Medio
    private int golos;


    public Robo(int x, int y, double distanciaPercorrida, String id, String tipoJogador) {
		super(x, y, distanciaPercorrida);
        this.id = id;
        this.tipoJogador = tipoJogador;
	}

    public void setId(String id){
        this.id = id;
    }
    public void setTipoJogador(String tipoJogador){
        this.tipoJogador = tipoJogador;
    }

    public String getId(){
        return id;
    }
    public String getTipoJogador(){
        return tipoJogador;
    }
    public int getGolos(){
        return golos;
    }

    public void marcar(){
        this.golos++;
    }

    @Override
    public String toString(){
        return "Robo " + id + "do tipo " + tipoJogador + "; coordenadas: (" + super.getX() + ", "+ super.getY() + ") e distancia percorrida: " + super.getDistanciaPercorrida();
    }

    
}
