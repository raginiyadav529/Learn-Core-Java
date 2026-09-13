package practice;

import java.util.Scanner;

public class OccuranceDigit {

    public static int countDigit(int number , int digit) {
        int count = 0;
        while (number > 0) {

            if (number % 10 == digit) {
                count++;
            }
            number = number / 10;
        }
        return count;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : "); // 626238
        int num = sc.nextInt();
        System.out.println("Enter digit to be count : ");
        int digit = sc.nextInt();
        System.out.println(countDigit(num , digit));

    }

}
