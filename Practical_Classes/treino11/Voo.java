package treino11;

public class Voo {
    private Tempo hora;
    private String voo;
    private String companhia;
    private String origem;
    private Tempo atraso;
    private Tempo previsto;

    public Voo(Tempo hora, String voo, String companhia, String origem, Tempo atraso){
        this.hora = hora;
        this.voo = voo;
        this.companhia = companhia;
        this.origem = origem;
        this.atraso = atraso;
        this.previsto = calcPrevisto(hora, atraso);
    }

    public Tempo getHora() {
		return hora;
	}

	public String getVoo() {
		return voo;
	}

	public String getCompanhia() {
		return companhia;
	}

	public String getOrigem() {
		return origem;
	}

	public Tempo getAtraso() {
		return atraso;
	}

	public Tempo getPrevisto() {
		return previsto;
	}

    public Tempo calcPrevisto(Tempo h, Tempo a){
        return h.add(a);
    }

    @Override
    public String toString(){
        if(atraso.getMinutos() == 0){
            return String.format("%-10s%-12s%-20s%-25s", hora, voo, companhia, origem);
        }else{
            return String.format("%-10s%-12s%-20s%-25s%-10s%-15s", hora, voo, companhia, origem, atraso, "Previsto: " + previsto);
        }
    }
}
