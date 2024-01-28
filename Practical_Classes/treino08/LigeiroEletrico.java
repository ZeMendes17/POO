package treino08;

public class LigeiroEletrico extends Ligeiro implements VeiculoEletrico {

    private int autonomia;

	public LigeiroEletrico(String matricula, String marca, String modelo, int potencia, int nQuadro, int capacidade, int autonomia) {
		super(matricula, marca, modelo, potencia, nQuadro, capacidade);
        this.autonomia = autonomia;
    }

	@Override
	public int autonomia() {
		return autonomia;
	}

	@Override
	public void carregar(int percentagem) {
		
		System.out.println("O carro foi carregado até " + percentagem + " com sucesso");
	}
    
}
