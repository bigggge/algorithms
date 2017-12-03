package ch1.fundamentals;

import java.util.Arrays;

/**
 * ThreeSumFast O(N^2*logN)
 */
public class ThreeSumFast {
    public static int count(int[] a) {
        Arrays.sort(a);
        int length = a.length;
        int count = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (BinarySearch.rank(-a[i] - a[j], a) > j) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = {-3, -1, 0, 1, 2, 3};
        System.out.println(count(a));
    }

}
