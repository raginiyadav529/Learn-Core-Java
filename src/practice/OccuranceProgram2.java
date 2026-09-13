package practice;

public class OccuranceProgram2 {

    public static void main(String[] args) {

        int[] arr = {12, 34, 12, 23};
        int digit = 23;
        System.out.println("Value is : " + countIndex(arr, digit));
    }
    public static int countIndex(int[] arr, int digit){

        for (int i = 0; i < arr.length; i++) {
            if (digit == arr[i]) {
                return i;
            }
        }
        return digit;
    }

}
