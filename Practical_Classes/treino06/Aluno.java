package treino06;

import treino05.Date;

public class Aluno extends Pessoa {
    private Date dataInsc;
    private final int nMec;
    private static int contador = 100;

	public Aluno(String nome, int cc, Date dataNasc) {
		super(nome, cc, dataNasc);
		this.nMec = contador++;
        this.dataInsc = Date.today();
	}

    public Aluno(String nome, int cc, Date dataNasc, Date dataINsc) {
		super(nome, cc, dataNasc);
        this.dataInsc = dataINsc;
		this.nMec = contador++;
	}

    public void setDataInsc(Date dataInsc){
        this.dataInsc = dataInsc;
    }

    public Date getDataInsc(){
        return dataInsc;
    }
    public int getNMec(){
        return nMec;
    }

    @Override
    public String toString(){
        return this.getNome() + "; Número mecanografico: " + nMec + "; Data de inscrição: " + dataInsc;
    }

    // @Override
    // public int hashCode(){
    //     final int prime = 31;
    //     int result = 1;
    //     result = prime * result + nMec;
    //     result = prime * result + ((dataInsc == null)? 0 : dataInsc.hashCode());
    //     return result;
    // }

    
}
