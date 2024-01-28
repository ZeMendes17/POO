package aulas_praticas;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class aula11_ex3 {
    public static void main(String[] args) throws IOException {
    
        while(true){
        try{
            Scanner sc = new Scanner(System.in);
            String file = sc.nextLine();
            

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);  //creates a buffering character input stream
            StringBuilder sb = new StringBuilder();    //constructs a string buffer with no characters  
            String line;
            while((line = br.readLine())!=null) {  
                sb.append(line.toUpperCase());      //appends line to string buffer  
                sb.append("\n");     //line feed   
            } 
            fr.close();
            System.out.println(sb);
            
            sc.close();
        break;
        } catch(FileNotFoundException e) {
            System.out.println("File not found");
            continue;
        }
    }

    }
}
