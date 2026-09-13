package practice;

public class Student {

    int rollNo ;
    String name ;

   Student(int roll, String myName){
        rollNo = roll;
        name   = myName;
    }

   void display(){

        System.out.println("RollNo : "+rollNo);
        System.out.println("Name : "+name);
   }
//     void setData(){
//        rollNo = 101;
//        name = "Ragini";
//     }
     static void hello(){
        System.out.println("Hello !");
   }
}
