import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Learn_Stack {
    public static void main(String[] args){


        Stack<String> animals = new Stack<>();   // STACK -->LIFO(Last in first out)
        animals.push("Lion");
        animals.push("Cat");
        animals.push("Dog");
        animals.push("Elephant");
        System.out.println("Animal : "+animals);

        System.out.println("Peek element : "+ animals.peek());

         String pop =animals.pop();
         System.out.println("Pop animal : "+pop);





    }
}
