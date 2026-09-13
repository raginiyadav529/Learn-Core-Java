package oops;

public class MethodHiding {

    public static void main(String [] args){
        Parent p1 = new Parent();
        p1.display();    // Outputs: Static method in Parent class
        Child c1 = new Child();
        c1.display();    // Outputs: Static method in Child class


        // Method hiding behavior: reference type dictates the call
        Parent p2 = new Child();
        p2.display();

    }
}

class Parent{
    public static void display(){
        System.out.println("Parent method invoked !");
    }
}
class Child extends  Parent{
    // This hides the static method from Parent

    public static void display(){
        System.out.println("Child method invoked !");
    }
}
