package aula07;

public class Jogo {
    private Equipa e1, e2;
    private Bola bola;
    private int duracao;
    private long inicio;
    private long tempoDecorrido;
    private boolean done = false;

    public Jogo(Equipa e1, Equipa e2, Bola bola, int duracao){
        this.e1 = e1;
        this.e2 = e2;
        this.bola = bola;
        this.duracao = duracao;
    }
    
    public void start(){
        inicio = System.currentTimeMillis() / 1000;
    }

    public void current() {
		tempoDecorrido = (System.currentTimeMillis()/1000) - inicio;
		if(tempoDecorrido>=duracao) {
			done = true;
            
		}
        finish();
	}

    public void finish(){
        if(done){
            System.out.println("O jogo terminou!!!");
        }
    }

    public void golo1(){
        if(!done){
            e1.marcou();
            e2.sofreu();
        }else{
            System.out.println("Jogo terminou, nao é possivel marcar golos");
        }
    }

    public void golo2(){
        if(!done){
            e2.marcou();
            e1.sofreu();
        }else{
            System.out.println("Jogo terminou, nao é possivel marcar golos");
        }
    }

    @Override
	public String toString() {
		return e1 + "\n" + e2 + "\nTempo Decorrido: " + tempoDecorrido + " segundos\n" + e1.getNome()+" "+e1.getMarcados()+"-"+e2.getMarcados()+" "+e2.getNome() + "\nBola do jogo: " + bola.getCor() + "\n";
	}
}
