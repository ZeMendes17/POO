package aula10;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;

public class Ex4 {
    public static void main(String[] args) throws IOException {
        Set<String> mais_que_2 = new HashSet<>();
        Set<String> termina_s = new HashSet<>();
        Scanner input = new Scanner(new FileReader("src/aula10/words.txt"));
        ArrayList<String> words = new ArrayList<>();
        while(input.hasNext()) {
            String word = input.next();
            words.add(word);
            System.out.println(word);

            if(word.length() > 2) 
                mais_que_2.add(word);
            

            if(word.endsWith("s"))
                termina_s.add(word);
        }
        System.out.println();
        System.out.println("Palavras com mais de duas letras:");
        System.out.println(mais_que_2);
        System.out.println();
        System.out.println("Palavras que terminam em 's':");
        System.out.println(termina_s);
        System.out.println();
        System.out.println("Todas as palavras:");
        System.out.println(words);
        System.out.println();
        for(int i = 0; i < words.size(); i++) {
            char[] chars = (words.get(i)).toCharArray();
            for(char c: chars) {
                if(!Character.isLetter(c)) {
					words.remove(i);
				}
            }
        }
        
        System.out.println("Palavras so com letras:");
        System.out.println(words);

        input.close();
    }
}
