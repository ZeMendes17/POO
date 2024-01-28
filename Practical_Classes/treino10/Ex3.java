package treino10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Ex3 {
    public static void main(String[] args) {
        String frase = "Hello World";
        Map<Character, ArrayList<Integer>> mapa = new HashMap<>();

        for(int i = 0; i < frase.length(); i++){
            Character c = frase.charAt(i);
            if(mapa.containsKey(c)){
                mapa.get(c).add(i);
            } else{
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(i);
                mapa.put(c, temp);
            }
        }

        System.out.println(mapa);
    }
}
