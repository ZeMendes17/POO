package aula06;
import aula05.Date;


public class Aluno extends Pessoa{

    private Date dataInsc;
    private final int NMec;
    private static int contador = 100;

    // Construtores

    public Aluno(String nome, int cc, Date dataNasc, Date dataInsc) {
        super(nome, cc, dataNasc);
		this.dataInsc = dataInsc;
		this.NMec= contador++;
    }


    public Aluno(String nome, int cc, Date dataNasc) {
        super(nome, cc, dataNasc);
        this.NMec= contador++;
		this.dataInsc = Date.today();
    }
    
    // getters e toString()

    public Date getDataInsc() {
        return dataInsc;
    }
    public int getNMec() {
        return NMec;
    }

    public String toString() {
        return this.getNome() + "; Número Mecanografico: " + NMec + "; Data de Inscrição: " + dataInsc;
    }
}
