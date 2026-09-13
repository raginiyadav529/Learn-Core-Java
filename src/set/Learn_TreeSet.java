package set;

import java.util.Set;
import java.util.TreeSet;

public class Learn_TreeSet {

    public static void main(String[]args){

        Set<Integer> set = new TreeSet<>();

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
// **********************   TreeSet   ***********************

 ->  it gives unique and sorted element
 -> Implement BST(Binary Search Tree)
 -> Time Complexity -> o(n)

 */