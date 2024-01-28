package treino11;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Ex1 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new FileReader("src/aula11/major.txt"));
        input.useDelimiter("[\\p{Punct}\\s]+");
        ArrayList<String> words = new ArrayList<>();
        HashMap<String, HashMap<String, Integer>> tudo = new HashMap<>();

        while(input.hasNext()){
            String word = input.next();
            if(word.length() >= 3){
                words.add(word);
            }
        }

        for(int i = 0; i < words.size() - 1; i++){
            String current = words.get(i);
            String next = words.get(i + 1);

            if(tudo.containsKey(current)){
                if(tudo.get(current).containsKey(next)){
                    tudo.get(current).replace(next, tudo.get(current).get(next) + 1);
                }else{
                    tudo.get(current).put(next, 1);
                }

            }else{
                HashMap<String, Integer> temp = new HashMap<>();
                temp.put(next, 1);
                tudo.put(current, temp);
            }
        }

        input.close();

        for(int i = 0; i < tudo.size(); i++) {
            System.out.println(tudo.entrySet().toArray()[i].toString());
            
        }
    }
}
