package aula07;
import aula05.Date;

public class Alojamento {
    private final String codigo, nome, local;	//Imutáveis
	private double precoNoite, avaliacao;
	private boolean disponivel = true;
    private String hospede_nome, hospede_cc;
    private Date dataEntrada;

   
    public Alojamento(String codigo,String nome,String local, double precoNoite, double avaliacao) {
		this.codigo = codigo;
		this.nome = nome;
		this.local = local;
		this.precoNoite = precoNoite;
		this.avaliacao = avaliacao;
	}

    public void checkIn(String nome, String cc, Date data) {
        if(disponivel) {
            this.hospede_nome = nome;
            this.hospede_cc = cc;
            this.dataEntrada = data;
            this.disponivel = false;
        } else {
            System.out.println("Infelizmente não há possibilidade");
        }
    }

    public double checkOut(Date data) {
        if(!disponivel) {
            double apagar = precoNoite * ;

        }
    }

   public String getCodigo() {
       return codigo;
   }

   public String getNome() {
       return nome;
   }

   public String getLocal() {
       return local;
   }

   public double getPrecoNoite() {
       return precoNoite;
   }

   public boolean getDiponibilidade() {
       return disponivel;
   }

   public double getAvaliacao() {
       return avaliacao;
   }


   public void setPrecoNoite(double precoNoite) {
       this.precoNoite = precoNoite;
   }

   public void setDisponibilidade(boolean disponivel) {
       this.disponivel = disponivel;
   }

   public void setAvaliacao(double avaliacao) {
       this.avaliacao = avaliacao;
   }
}
