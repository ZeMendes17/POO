package treino05;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println("\nCIRCULO");
		Circulo circ = new Circulo(2.2);
		Circulo circ2 = new Circulo(4.5);
		Circulo circ3 = new Circulo(2.2);
		System.out.println(circ); 
		System.out.println(circ.getRaio()); 
		System.out.println(circ.equals(circ2)); //False
		System.out.println(circ.equals(circ3)); //True
		circ.setRaio(20);
		System.out.println(circ);
		System.out.println(circ.area()); //1256,6
		System.out.println(circ.perimetro()); //125,66

        // repetir para o resto, muito chato...
    }
}
