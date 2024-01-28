package aula10;

import java.util.TreeMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Ex2 {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> mapa = new TreeMap<String, ArrayList<String>>();

        mapa.put("branco", new ArrayList<>(Arrays.asList("Que tem a cor da neve", "Descorado, pálido", "Cor de leite")));
        mapa.put("vermelho", new ArrayList<>(Arrays.asList("coiso", "e", "tal")));
        mapa.put("verde", new ArrayList<>(Arrays.asList("nao", "faco", "ideia")));
        mapa.put("azul", new ArrayList<>(Arrays.asList("Cor do ceu", "cor do mar", "opa se la")));
        mapa.put("amarelo", new ArrayList<>(Arrays.asList("so", "para", "acabar")));

        System.out.println(mapa);
        mapa.replace("branco", new ArrayList<>(Arrays.asList("mudou")));

        System.out.println(mapa);
        mapa.remove("amarelo");

        System.out.println(mapa.entrySet());
        System.out.println(mapa.keySet());
        System.out.println(mapa.values());

        for(String chave : mapa.keySet()) {
			System.out.println(chave+": "+ def(mapa, chave));
		}
    }

    private static String def(Map<String, ArrayList<String>> mapa, String chave) {
        ArrayList<String> valores = mapa.get(chave);
		return valores.get(randomNumber(valores.size()));
    }

    public static int randomNumber(int max) {
		Random r = new Random();
		return r.nextInt(max); // num aleatorio ate max exclusive
	}
}
