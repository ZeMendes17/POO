package aula07;

public class Ex1 {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(2, "Vermelho");
        Circulo c2 = new Circulo(2, "Vermelho");
        Triangulo t1 = new Triangulo(1, 2, 3, "Azul");
        Triangulo t2 = new Triangulo(1, 2, 3, "Azul");
        Triangulo t3 = new Triangulo(2, 2, 3, "Azul");
        Triangulo t4 = new Triangulo(1, 2, 3, "Vermelho");
        Retangulo r1 = new Retangulo(4, 5, "Verde");
        Retangulo r2 = new Retangulo(4, 5, "Castanho");        
        Retangulo r3 = new Retangulo(2, 5, "Verde");
        Retangulo r4 = new Retangulo(4, 5, "Verde");

        System.out.println(c1.equals(c2)); // true
        System.out.println(t1.equals(t2)); // true
        System.out.println(t1.equals(t3)); // false
        System.out.println(t1.equals(t4)); // false
        System.out.println(r1.equals(r2)); // false
        System.out.println(r1.equals(r3)); // false
        System.out.println(r1.equals(r4)); // true
    }
}
