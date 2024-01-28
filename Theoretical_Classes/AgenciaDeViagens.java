package aula07;

public class AgenciaDeViagens {
    
    Alojamento[] alojamentos = new Alojamento[5];
    Carro[] carros = new Carro[5];  
    private String nome, endereco;

    public AgenciaDeViagens(String nome, String endereco) {
        this.nome = nome; this.endereco = endereco;
    }

    public int getAlojamentos() {
        return alojamentos;
    }

    public int getViaturas() {
        return viaturas;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setAlojamentos(int alojamentos) {
        this.alojamentos = alojamentos;
    }

    public void setViaturas(int viaturas) {
        this.viaturas = viaturas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


}
