package TestDome;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class MaxSum {
    public static int findMaxSum(List<Integer> list) {
        ArrayList<Integer> sortedList = new ArrayList(list);
        Collections.sort(sortedList);
        System.out.println(sortedList);
        int size = sortedList.size();
        return sortedList.get(size-1) + sortedList.get(size-2);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 9, 7, 11);
        // Should return 20, since 9 and 11 are the largest elements
        // and their sum is 20
        System.out.println(findMaxSum(list));
    }
}