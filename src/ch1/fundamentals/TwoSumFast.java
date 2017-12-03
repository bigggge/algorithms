package ch1.fundamentals;

import java.util.Arrays;

/**
 * TwoSumFast O(N*logN)
 */
public class TwoSumFast {
    public static int count(int[] a) {
        Arrays.sort(a);
        int length = a.length;
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (BinarySearch.rank(-a[i], a) > i) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = {-3, -1, 0, 1, 2, 3};
        System.out.println(count(a));
    }
}
