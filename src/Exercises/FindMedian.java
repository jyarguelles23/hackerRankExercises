package Exercises;

import java.util.Arrays;
import java.util.List;

public class FindMedian {

    public static int findMedian(List<Integer> arr) {
        // Write your code here
        Integer [] arr3 = arr.toArray(new Integer[arr.size()]);
        Arrays.sort(arr3);

        return arr3[arr3.length/2];
    }
}
