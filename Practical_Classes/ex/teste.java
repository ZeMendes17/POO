package ex;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
// import java.util.Map;
import java.util.Scanner;
// import java.util.TreeMap;

public class teste {
    public static void main(String[] args) throws IOException {
        // Map<Date, Date> a = new TreeMap<>();

        Scanner input = new Scanner(new FileReader("numeros.txt"));
        List<Integer> l = new ArrayList<>();
        while(input.hasNext()){
            l.add(Integer.parseInt(input.next()));
        }


        int maior = l.get(0);
        int menor = l.get(0);
        int sum = 0;
        for(int i : l){
            sum += i;

            if(i > maior)
                maior = i;
            if(i < menor)
                menor = i;
        }
        
        double media = sum / l.size();

        System.out.println(media);
        System.out.println(menor);
        System.out.println(maior);



    }
}
