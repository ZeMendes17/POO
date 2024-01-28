package aula11;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Ex1 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new FileReader("src/aula11/major.txt"));
        input.useDelimiter("[\\\t\n\r .,:'‘’;?!-*{}=+&/()\\[\\]”“\"\']+"); // \p punct for special char and \s for spaces

        ArrayList<String> words = new ArrayList<>();
        HashMap<String, HashMap<String, Integer>> tudo = new HashMap<>();

        while(input.hasNext()){
            String word = input.next();
            if(word.length() >= 3){
                words.add(word);
            }
        }

        for(int i = 0; i < words.size() - 1; i++){ // tem - 1 pois a ultima palavra nao tera seguinte para adicionar
            String esta = words.get(i);
            String proxima = words.get(i + 1);

            if(!(tudo.containsKey(esta))){
                HashMap<String, Integer> adicionar = new HashMap<>();
                adicionar.put(proxima, 1);
                tudo.put(esta, adicionar);
            } else {
                if(tudo.get(esta).containsKey(proxima)) {
                    tudo.get(esta).replace(proxima, tudo.get(esta).get(proxima) + 1);
                } else {
                    tudo.get(esta).put(proxima, 1);
                }
            }
        }
    input.close();

    for(int i = 0; i < tudo.size(); i++) {
        System.out.println(tudo.entrySet().toArray()[i].toString());
        
    }
    }
}
