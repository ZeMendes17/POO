package treino06;

import treino05.Date;

public class Bolseiro extends Aluno {
    private int bolsa;

	public Bolseiro(String nome, int cc, Date dataNasc) {
		super(nome, cc, dataNasc);
	}
    public Bolseiro(String nome, int cc, Date dataNasc, Date dataInsc) {
		super(nome, cc, dataNasc, dataInsc);
	}
    public Bolseiro(String nome, int cc, Date dataNasc, Date dataInsc, int bolsa) {
		super(nome, cc, dataNasc, dataInsc);
        this.bolsa = bolsa;
	}
    public Bolseiro(String nome, int cc, Date dataNasc, int bolsa) {
		super(nome, cc, dataNasc);
        this.bolsa = bolsa;
	}

    public void setBolsa(int bolsa){
        this.bolsa = bolsa;
    }

    public int getBolsa(){
        return bolsa;
    }

    @Override
    public String toString(){
        return this.getNome() + "; Número Mecanografico: " + this.getNMec() + "; Data de Nascimento: " + this.getDatanasc() + "; Valor na bolsa: " + bolsa;
    }
    
}
