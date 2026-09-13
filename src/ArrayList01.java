import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {


     /* List <String> student =new LinkedList<>();

        student.add("Ragini Yadav ");
        System.out.println(student);

      */


        List<Integer> list =new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);

        /*
        list.add(1,90);
        System.out.println(list);

       List<Integer> newList =new ArrayList<>();
       newList.add(110);
       newList.add(120);
       list.addAll(newList);
        System.out.println(list);
        System.out.println(list.get(6)); // used to get the element at index i from list

       */

       /*
        list.remove(1);  //This will remove the element
        System.out.println(list);

        list.remove(Integer.valueOf(40));
        System.out.println(list);  // This will remove the value of element

        list.clear(); // This will remove all the element from the list
        System.out.println(list);
        */

//        list.set(2,1000);  // This will set the element at index 2 with value = 1000
//        System.out.println(list);

//        System.out.println(list.contains(1000));  // check whether particular element is present or not.

//        System.out.println(list.size()); // gives the current size of list or size of total element


        //  *********** iterate() ***********

        for (int i = 0; i < list.size(); i++) {
            System.out.println("The element is : "+ list.get(i));

        }

        for (Integer element: list){
            System.out.println( "foreach : "+element);
        }

        Iterator<Integer> it =list.iterator();
        while(it.hasNext()){
            System.out.println("Iterator : "+ it.next() );
        }
    }
}