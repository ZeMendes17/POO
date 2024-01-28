package aula12;
import java.util.Set;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.io.FileReader;

public class Ex1 {
    public static void main(String[] args) throws IOException {
        Set<String> words = new HashSet<>();
        int allWords = 0;

        Scanner input = new Scanner(new FileReader("major.txt"));
        input.useDelimiter("[\\p{Punct}\\s]+");

        while(input.hasNext()) {
            String word = input.next();
            allWords++;
            words.add(word);
        }
        input.close();

        System.out.println("Número Total de Palavras: " + allWords);
        System.out.println("Número de Diferentes Palavras: " + words.size());
    }
}
