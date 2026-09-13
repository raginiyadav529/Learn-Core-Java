package set;


import java.util.HashSet;
import java.util.Set;

public class Learn_HashSet {
    public static void main (String []args){

        Set<Student> student = new HashSet<>();  // Custom Type ->Student
        student.add(new Student(101,"Ragini"));
        student.add(new Student(102,"Nidhi"));
        student.add(new Student(103,"Prince"));
        student.add(new Student(101,"Mamta"));

        System.out.println(student);

       Student s1 = new Student(103,"Prince");
       Student s2 = new Student(101,"Mamta");
        System.out.println(s1.equals(s2));

        /*
        Set <Integer> set = new HashSet<>();

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

        set.clear();
        System.out.println(set);

         */

    }
}

/*
// ***************** HashSet ********************

 -> HashSet  -> Returns unique element but the order may alter in HashSet.
 -> Time Complexity -> o(1)
 */