package EP2021;

import java.io.File;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.time.LocalDateTime;
import java.util.Arrays;

//Notas:
//Não altere o código apresentado na main e alinea1
//Deve completar o código da alinea2
//Comente o código com erros para garantir que vai executando parcialmente

public class P3_20 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Bar bar = new Bar("Naturalis");
		PrintWriter fl = new PrintWriter(new File("p3_2021.txt"));
		alinea1(bar, System.out); // executa e escreve na consola
		alinea2(bar, fl); // executa e escreve no ficheiro
		fl.close();
	}

	public static void alinea1(Bar b, PrintStream out) {
		out.println("\nAlínea 1) ----------------------------------\n");

		Bebida b1 = new Batido("Tropical Ambrosia",
				new String[] { "pineapple", "apple", "coconut milk", "orange", "banana" }, 12.0);
		Bebida b2 = new Batido("Spotty Smoothy", new String[] { "raspberry", "orange", "yoghurt" }, 9.50);
		Bebida b3 = new Sumo("Mango Fix", new String[] { "mango", "pineapple" }, 7.50);
		Bebida b4 = new Sumo("Red Mist", new String[] { "beetroot", "apple", "lemon" }, 7.00);
		Bebida b5 = new Sumo("Snoozing Rabbit", new String[] { "carrot", "lettuce" }, 7.00);

		System.out.print("Bebidas: ");
		System.out.print(b.adicionaBebida(b1) + ", "); // true
		System.out.print(b.adicionaBebida(b2) + ", "); // true
		System.out.print(b.adicionaBebida(b3) + ", "); // true
		System.out.print(b.adicionaBebida(b4) + ", "); // true
		System.out.print(b.adicionaBebida(b5) + ", "); // true
		System.out.print(b.adicionaBebida(
				new Sumo("Mango Fix", new String[] { "mango" }, 4.50)) + "\n"); // false (bebida com mesmo nome já
																				// existe)

		System.out.println("\nPedidos: ");
		System.out.println(b.novoPedido(LocalDateTime.parse("2021-02-26T12:10:15")).adiciona(b1).adiciona(b2));
		System.out.println(b.novoPedido(LocalDateTime.parse("2021-02-26T12:11:24")).adiciona(b3).adiciona(b5));
		System.out.println(b.novoPedido(LocalDateTime.parse("2021-02-26T12:16:36")).adiciona(b4).adiciona(b3));
		System.out.println(b.novoPedido(LocalDateTime.parse("2021-02-26T12:23:02"),
				new String[] { "Spotty Smoothy", "Snoozing Rabbit", "Red Mist" }));

		System.out.println("\n\n-------- Listagem de pedidos --------");
		System.out.println("----- ordenados por preço total -----\n");
		for (Iterator<Pedido> ri = b.iterator(); ri.hasNext();)
			System.out.println(ri.next());
	}

	private static void alinea2(Bar b, PrintWriter out) throws IOException {

		try {
			List<String> linhas = Files.readAllLines(Paths.get("src/EP2021/bar.txt"));

			for (int i = 1; i < linhas.size(); i++) {
				String[] parametros = linhas.get(i).split(";");
				if(parametros[0].equals("P")){
					System.out.println(Arrays.copyOfRange(parametros, 2, parametros.length));
					System.out.println(parametros[2]);
					b.novoPedido(LocalDateTime.parse(parametros[1]), Arrays.copyOfRange(parametros, 2, parametros.length));
				}
			}
			out.println(b.getPedidos());

		} catch (IOException e) {
			System.out.println("Não foi possivel encontrar o ficheiro");
		}

		// Adicione a seguir o código necessário para ler e processar o ficheiro com os
		// movimentos (usar java streams)
		// O ficheiro contém linhas que representam pedidos (linhas iniciadas com 'P')
		// O ficheiro contém linhas que representam pagamentos (linhas iniciadas com
		// 'R')

		// Adicione a seguir o código necessário para escrever para ficheiro todos os
		// pedidos que contêm apenas Sumos (usar java streams)

		// Adicione a seguir o código necessário para escrever para ficheiro todos os
		// pedidos por pagar (usar java streams)

	}
}
