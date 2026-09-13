import java.util.Arrays;

public class LearnArraysClass {
    public static void main(String[]args){

        /*
        int[] arr = {10,20,30,40,50,60};

        int index = Arrays.binarySearch(arr,30);
        System.out.println("index : "+ index);

         */


        int[] numbers = {20,40,12,10,15,50,90,70,80};
         Arrays.sort(numbers);
         Arrays.fill(numbers,15);
         for (int arr : numbers) {

             System.out.print(arr+" ");
         }





    }


}
