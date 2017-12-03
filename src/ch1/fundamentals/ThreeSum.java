package ch1.fundamentals;

/**
 * ThreeSum 在N个数中找出三个和为0的整数元组的数量 O(N^3)
 */
public class ThreeSum {
    public static int count(int[] a) {
        int length = a.length;
        int count = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                for (int k = j + 1; k < length; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        count++;
                    }
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
