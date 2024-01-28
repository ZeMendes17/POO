package aula10;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
public class Ex1 {
    public static void main(String[] args) {
        Map<String, String> mapa = new HashMap<>();
        
        mapa.put("branco", "Que tem a cor de neve.");
        mapa.put("verde", "Que tem a cor da relva.");
        mapa.put("azul", "Que tem a cor do ceu.");
        mapa.put("branco", "Que tem a cor das nuvens."); // vai trocar o que tinha branco antes
        mapa.put("vermelho", "Sei la, é vermelho.");
        mapa.put("rosa", "porque sim");

        System.out.println(mapa.toString());

        mapa.replace("rosa", "porque sim", "mudou");
        mapa.replace("vermelho", "mudou mas é vermelho");

        Set<Entry<String, String>> set= mapa.entrySet();
        for(Entry<String, String> c: set)System.out.println(c.getKey() + " ---> "+ c.getValue());
        System.out.println();

        mapa.remove("azul");
        Set<Entry<String, String>> set1= mapa.entrySet();
        for(Entry<String, String> c: set1)System.out.println(c.getKey() + " ---> "+ c.getValue());

        System.out.println(mapa.entrySet());
        System.out.println(mapa.keySet());
        System.out.println(mapa.values());

    }
}
    

