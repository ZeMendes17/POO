package aula10;

import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;

public class Ex3 {
    public static void main(String[] args) {
        String frase = "Hello World";
        Map<Character, HashSet<Integer>> mapa = new HashMap<>();

        for(int i = 0; i < frase.length(); i++) {
            if(mapa.get(frase.charAt(i)) == null) {
                HashSet<Integer> ad = new HashSet<>();
                ad.add(i);

                mapa.put(frase.charAt(i), ad);
            } else {
               HashSet<Integer> c = mapa.get(frase.charAt(i));
               c.add(i);

               mapa.put(frase.charAt(i), c);
            }
        }

        System.out.println(mapa);
    }


}
