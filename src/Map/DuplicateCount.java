package Map;

import java.util.Map;
import java.util.TreeMap;

public class DuplicateCount {
                                                    // Duplicate Count using TreeMap
    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 4, 5, 5, 6, 7, 8, 8};
        // 1=3 ,2=2, 3=4 , 4=2 ,5=2, 6=1 , 7=1, 8=2
        Map<Integer, Integer> result = new TreeMap<>();

        for (int num : arr) {

            result.put(num, result.getOrDefault(num, 0) + 1);
        }
        System.out.println(result);
    }
}