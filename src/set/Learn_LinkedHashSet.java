package set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Learn_LinkedHashSet {

    public static void  main (String[]args){
        Set<Integer> set = new LinkedHashSet<>();

        set.add(25);
        set.add(30);
        set.add(15);
        set.add(60);
        System.out.println(set);
        boolean remove = set.remove(15);
        System.out.println("Removed : "+ remove); // true
        System.out.println(set);

        boolean isElement =  set.contains(60);
        System.out.println(isElement);
        System.out.println(set.isEmpty());
        System.out.println(set.size());
    }
}

/*
   // *****************  LinkedHashSet ********************

 -> HashSet  -> Returns unique element but the order may alter in HashSet.

 ->  LinkedHashSet is same as HashSet but the difference is it -->
 -> Implement set and LinkedList properties
 -> Returns unique and provide element in order.

 */