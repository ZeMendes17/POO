package treino10;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Ex4 {
    public static void main(String[] args) throws IOException {
        List<String> maisDe2 = new ArrayList<>();
        List<String> acabadasEmS = new ArrayList<>();
        List<String> newList = new ArrayList<>();
        List<String> palavrasComOutrosChar = new ArrayList<>();
        
        Scanner input = new Scanner(new FileReader("src/aula10/words.txt"));
        while(input.hasNext()){
            String word = input.next();
            System.out.println(word);

            if(word.length() > 2)
                maisDe2.add(word);

            if(word.endsWith("s"))
                acabadasEmS.add(word);

            for(int i = 0; i < word.length(); i++){
                if(!Character.isLetter(word.charAt(i))){
                    palavrasComOutrosChar.add(word);
                    break;
                }
                if(i == word.length() - 1){
                     newList.add(word);
                }
            }
        }

        System.out.println(maisDe2);
        System.out.println(acabadasEmS);
        System.out.println(newList);
        System.out.println(palavrasComOutrosChar);
    }
}
