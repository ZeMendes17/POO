package aula08;

public class PesadoPassageirosEletrico extends Veiculo implements VeiculoEletrico{

    int autonomia;

    public PesadoPassageirosEletrico(String matricula, String marca, String modelo, int potencia, int autonomia) {
        super(matricula, marca, modelo, potencia);
        this.autonomia = autonomia;
    }

    @Override
    public int autonomia() {
        return autonomia;
    }

    @Override
    public void carregar(int percentagem) {
        System.out.print("A carregar... ");
        while(percentagem <= 100){
            System.out.println(percentagem);
            percentagem++;
        }
        System.out.println("Fim de carregamento");
        
    }
    
}
