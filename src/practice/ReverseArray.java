package practice;

import java.util.Scanner;

public class ReverseArray {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter elements in the Array : ");
        for (int i=0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        reverseArray(arr, 0, arr.length-1);
        System.out.println("Reverse array is : ");
        for (int num : arr){
            System.out.print(" "+ num);
        }
        System.out.println();
        System.out.println("length : "+arr.length);
    }

    private static void reverseArray(int[] arr, int start, int end) {
       if (start>=end){
          return;
       }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
       reverseArray(arr,start+1, end-1); // Recursive call
    }
}
