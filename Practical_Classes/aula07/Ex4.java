package aula07;

import java.util.Scanner;

public class Ex4 {
    static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Equipa slb = makeBenfica();
		Equipa fcp = makePorto();
		Robo jonas = new Robo(0, 5, 27, "Jonas", "Avançado");
		Robo marega = new Robo(0, 5, 11, "Marega", "Avançado");
		slb.addJogador(jonas);
		fcp.addJogador(marega);
		Jogo jg = new Jogo(slb,fcp, new Bola(0,0,60), 25);
		
		jg.start();
		System.out.println(jg);
		System.out.println("---------------");
		esperar(jg);
		jg.golo1();
		System.out.println(jg);
		System.out.println("---------------");
		esperar(jg);
		marega.move(20, 40);
		jg.golo2();
		System.out.println(jg);
		System.out.println("---------------");
		esperar(jg);
		jonas.move(50, 20);
		jg.golo2();
		jg.golo2();
		System.out.println(jg);
		System.out.println("---------------");
		esperar(jg);
		jg.golo2();
		System.out.println(jg);
		System.out.println("---------------");
		
		
		
	}
	
	public static Equipa makeBenfica() {
		Equipa slb = new Equipa("Benfica", "Bruno Lage");
		Robo r4 = new Robo(0, 5, 99, "Odyseas", "GuardaRedes");
		Robo r3 = new Robo(0, 5, 33, "Jardel", "Defesa");
		Robo r2 = new Robo(0, 5, 28.5, "Pizzi", "Médio");
		slb.addJogador(r2);
		slb.addJogador(r3);
		slb.addJogador(r4);
		return slb;
	}
	
	public static Equipa makePorto() {
		Equipa fcp = new Equipa("Porto", "Sérgio Conceição");
		Robo r4 = new Robo(0, 5, 28, "Casillas", "GuardaRedes");
		Robo r3 = new Robo(0, 5, 28, "Pepe", "Defesa");
		Robo r2 = new Robo(0, 5, 22, "Danilo", "Médio");
		fcp.addJogador(r2);
		fcp.addJogador(r3);
		fcp.addJogador(r4);
		return fcp;
	}
	
	public static void esperar(Jogo jg) {
		String s;
		do {
			System.out.println("Continuar? (s)");
			s = sc.nextLine();
		}while(!s.equals("s"));
		jg.current();
	}

}
