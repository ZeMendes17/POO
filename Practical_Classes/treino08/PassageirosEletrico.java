package treino08;

public class PassageirosEletrico extends Passageiros implements VeiculoEletrico {

    private int autonomia;

	public PassageirosEletrico(String matricula, String marca, String modelo, int potencia, int nQuadro, int peso, int maxPessoas, int autonomia) {
		super(matricula, marca, modelo, potencia, nQuadro, peso, maxPessoas);
		this.autonomia = autonomia;
	}

	@Override
    public int autonomia() {
        return autonomia;
    }

    // @Override
    // public void carregar(int percentagem) {
    //     System.out.print("A carregar... ");
    //     while(percentagem <= 100){
    //         System.out.println(percentagem);
    //         percentagem++;
    //     }
    //     System.out.println("Fim de carregamento");
    // }
    @Override
	public void carregar(int percentagem) {
		
		System.out.println("O carro foi carregado até " + percentagem + " com sucesso");
	}
    
}
