package aula09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import aula06.Pessoa;
import aula05.Date;
import java.util.TreeSet;

public class ALDemo {
    public static void main(String[] args) {
        // array list
        ArrayList<Integer> c1 = new ArrayList<>();
        for(int i = 10; i <= 100; i += 10) 
            c1.add(i);
        System.out.println("Size: " + c1.size());
        for(int i = 0; i < c1.size(); i++)
            System.out.println("Elemento: " + c1.get(i));
        
        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Vento");
        c2.add("Calor");
        c2.add("Frio");
        c2.add("Chuva");
        System.out.println(c2);
        Collections.sort(c2);
        System.out.println(c2);
        c2.remove("Frio");
        c2.remove(0);
        System.out.println(c2);
        c2.add(1, "Neve");
        System.out.println(c2.indexOf("Neve"));
        System.out.println(c2.contains("Vento"));  // true
        System.out.println(c2.contains("Agua"));  // false
        System.out.println(c2.lastIndexOf("Chuva"));
        System.out.println(c2.lastIndexOf("Neve"));
        c2.set(0, "Tornado");
        System.out.println(c2);
        System.out.println(c2.subList(1, 2));
        System.out.println(c2.subList(0, 3));

        // collection, linked list e iterator
        Collection<String> c = new LinkedList<>();
        c.add("Aveiro");
        c.add("Paris");
        Iterator<String> i = c.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }

        // set e hashset / iterator
        Set<Pessoa> c3 = new HashSet<>();
		c3.add(new Pessoa("Ana", 1, new Date(1,2,2000)));
		c3.add(new Pessoa("João", 2, new Date(7,4,2000)));
		c3.add(new Pessoa("Manuel", 3, new Date(11,9,2000)));
		c3.add(new Pessoa("Vitor", 4, new Date(6,3,2000)));
		c3.add(new Pessoa("Mário", 5, new Date(3,8,2000)));
		Iterator<Pessoa> it = c3.iterator();
		it.forEachRemaining(s -> {
			System.out.println(s);
		});

        Set<Date> c4 = new TreeSet<>();
        c4.add(new Date(1, 2, 2000));
        c4.add(new Date(2, 4, 1969));
        c4.add(new Date(3, 6, 2003));
        c4.add(new Date(4, 8, 2012));
        c4.add(new Date(5, 10, 1945));
        Iterator<Date> it1 = c4.iterator();
		it1.forEachRemaining(d -> {
			System.out.println(d);
		});
        
    }
}
