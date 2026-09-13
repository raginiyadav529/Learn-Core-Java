package practice;

import java.util.Scanner;

import static practice.Student.hello;

public class Main {

    int marks;
    String subject ;

    private Main(int m1 , String sub){
        marks = m1;
        subject = sub;
    }
    public void display(){
        System.out.println("marks : "+marks);
        System.out.println("subject : "+subject);
    }


    public static void main(String[]args){

        Student s1 = new Student(102,"Ragini Yadav");
//        s1.setData();
        s1.display();
        hello();
        Main m1 = new Main(89,"Math");
        m1.display();
        System.out.println(m1.marks);

    }

    public static class PracticeProject {

        public static void main(String[]args){

            double sum=0;
            Scanner sc= new Scanner(System.in);

            System.out.println("Enter size :");
            int size = sc.nextInt();
            double[] arr =new double[size];

            System.out.println("enter marks : ");

            for (int i=0;i <arr.length;i++){
                System.out.println("enter grade : "+i);
                arr[i] = sc.nextInt();
            }

            for (int i =0; i<arr.length;i++){

                sum = sum + arr[i];
            }
            System.out.println("sum : "+sum);
            double average = sum/ arr.length;

            System.out.println("Average is : "+average);
            System.out.println("Grade is : "+grade(average));
        }

        public static char grade(double avg) {

            if(avg>=80){
                return 'A';
        }
            else if (avg>=70) {
                return 'B';
            }
            else if(avg>=60){
                return 'C';
            }
            else if(avg>=50){
                return 'D';
            }
            else if(avg>=40){
                return 'E';
            }
            else {
                return 'F';
            }
        }
    }
}
