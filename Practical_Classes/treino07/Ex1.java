package treino07;

public class Ex1 {
    public static void main(String[] args) {
        Circulo c = new Circulo(2.3, "Amarelo");
        Circulo c2 = new Circulo(2.3, "Amarelo");
        Circulo c3 = new Circulo(2.5, "VE");


        System.out.println(c.equals(c2));
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());

        
    }
}
