package practice;

import java.util.Scanner;

public class Practice_1 {

    public static void main(String []agrs){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size : ");
        int size = sc.nextInt();

        int[] arr  = new int[size];
        System.out.println("Enter element in array : ");
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 0;i<arr.length;i++){
            if (arr[i] > max){
                max = arr[i];
            }
            if (arr[i]< min){
                min = arr[i];
            }
        }
        System.out.println("Max element is : "+ max);
        System.out.println("Min element is : "+min);


        for (int i = 0; i < 6; i++) {
            if (i == 2) {
                continue;
            }
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
         /*

        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("Continue statement ->");

        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }

        int i=0;
        do{
            System.out.println("hello");
            i++;
        }
        while(i<10);



        int choice = 4;

        switch (choice){
            case 1 :
                System.out.println("You have ordered Tea !");
                break;
            case 2 :
                System.out.println("You have ordered pizza !");
                break;
            case 3 :
                System.out.println("You have ordered Water !");
                break;
            case 4 :
                System.out.println("You have ordered coffee !");
                break;
            default :
                System.out.println("Invalid choice !");
        }


        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println(str1.equals(str2));

         */
    }
}

/*
 toUpperCase() , toLowerCase() , equals() , indexOf ,charAt(i) , length(),

 trim() -> remove whitespace from the beginning and from the end of the String.
 concat() ,
 */
