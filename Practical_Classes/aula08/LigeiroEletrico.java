package aula08;

public class LigeiroEletrico extends AutomovelLigeiro implements VeiculoEletrico{

    int autonomia;

    public LigeiroEletrico(String matricula, String marca, String modelo, int potencia, int numDeQuadro, int capDaBag, int autonomia) {
        super(matricula, marca, modelo, potencia, numDeQuadro, capDaBag);
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
