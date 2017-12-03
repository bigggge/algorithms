package ch1.fundamentals;

/**
 * 二分查找 O(logN)
 */
public class BinarySearch {
    public static int rank(int key, int[] a) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (key < a[mid])
                high = mid - 1;
            else if (key > a[mid])
                low = mid + 1;
            else if (key == a[mid])
                return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int key = 9;
        int[] list = {1, 2, 3, 5, 8, 9, 1};
        int result = rank(key, list);
        System.out.println(result);
    }
}

