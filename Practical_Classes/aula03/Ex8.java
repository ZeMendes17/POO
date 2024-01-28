package aula03;

public class Ex8 {
    public static void main(String[] args) {
        double[][] pauta = new double[16][3];  // Array de 16 linhas por 3 colunas
		
		System.out.printf("%10s %10s %10s\n", "NotaT", "NotaP", "Pauta");		
		
		for(double[] n : pauta) {			//Percorrer o Array					
			
			n[0] = rndNota();				//NotaT
			n[1] = rndNota();				//NotaP
			
			if( n[0] < 7 || n[1] < 7 ) {	//caso aguma nota seja menor que 7 a nota final é 66
				n[2] = 66;
			} else {
				n[2] = ( 0.4 * n[0] ) + ( 0.6 * n[1] );		//calculo da nota final
			}
			
			System.out.printf("%10.1f %10.1f %10.0f\n", n[0], n[1], n[2]);
			
		}
	}
	
	public static double rndNota() {			//method que retorna um numero aleatorio no intervalo [0.0 ; 20.0]
		double rnd;
		double num; // o math random gera um numero aleatorio entre 0 e 1
		
		rnd = (Math.random() * 21);					//double aleatorio de 0 a 20
		num = (double) (Math.round(rnd*10))/10;		//arredondar o numero á primeira casa decimal
		
		return num;
		
	}    
    
}
