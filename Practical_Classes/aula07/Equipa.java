package aula07;

public class Equipa {
    private String nome;
    private String nomeResponsavel;
    private int golosMarcados = 0;
    private int golosSofridos = 0;
    private Robo team[] = new Robo[11];
    private int countPlayer = 0;

    public Equipa(String nome, String nomeResponsavel){
        this.nome = nome;
        this.nomeResponsavel = nomeResponsavel;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setNomeResponsavel(String nomeResponsavel){
        this.nomeResponsavel = nomeResponsavel;
    }

    public String getNome(){
        return nome;
    }
    public String getNomeResponsavel(){
        return nomeResponsavel;
    }
    public int getMarcados(){
        return golosMarcados;
    }
    public int getSofridos(){
        return golosSofridos;
    }
    public String getTeam(){
        StringBuilder sb = new StringBuilder();
        for(Robo r : team){
            if(r != null)
                sb.append(r + "\n");
        }
        return sb.toString();
    }

    public void marcou(){
        golosMarcados++;
    }
    public void sofreu(){
        golosSofridos++;
    }

    public void addJogador(Robo r){
        if(team[10] != null){
            System.out.println("A equipa está cheia\n");
        } else{
            team[countPlayer] = r;
            countPlayer++;
            System.out.println("Jogador adicionado com sucesso\n");
        }
    }

    public String toString(){
        return "Equipa '" + nome + "' constituida por: " + getTeam() + "Treinador: " + nomeResponsavel;
    }
}
