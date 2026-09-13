package practice;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramProgram {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter words of 1st String : ");
        String str = sc.nextLine();

        System.out.println("Enter words of 2nd String : ");
        String str1 = sc.nextLine();
        if (isAnagram(str,str1)){
            System.out.println("Strings are Anagram ");
        }
        else {
            System.out.println("Strings are not Anagram ");
        }
        sc.close();
    }

    public static boolean isAnagram(String str , String str1 ){

        if(str.length() != str1.length()){
            System.out.println("Cannot be Anagrams !");

        }
        char [] arr = str.toCharArray();
        char [] arr1 = str1.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);
        return Arrays.equals(arr,arr1);
    }
}
