import set.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionsClass {

    public static void main(String[]args){

        List<Student> student = new ArrayList<>();

        student.add(new Student(101,"Ragini"));
        student.add(new Student(102,"Nidhi"));
        student.add(new Student(103,"Prince"));
        student.add(new Student(1,"Mamta"));

        System.out.println(student);
        Student s1 = new Student(106,"Shaurya");
        Student s2 = new Student(105,"Ayush");

        System.out.println(s1.compareTo(s2));
        Collections.sort(student, (o1, o2) ->
                                         o1.name.compareTo(o2.name));

        System.out.println(student);


        /*
        List<Integer> num = new ArrayList<>();

        num.add(50);
        num.add(25);
        num.add(30);
        num.add(30);
        num.add(30);
        num.add(40);
        num.add(80);
        num.add(12);
        num.add(100);

            System.out.println(num);
        System.out.println("Min element : "+ Collections.min(num));
        System.out.println("Min element : "+ Collections.max(num));
        System.out.println("Frequency : "+Collections.frequency(num,30));

        // ********** sort ************

        Collections.sort(num);
        System.out.println(num);

        Collections.sort(num,Comparator.reverseOrder());
        System.out.println(num);

         */
    }

}
