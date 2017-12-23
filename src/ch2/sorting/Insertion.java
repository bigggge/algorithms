package ch2.sorting;

/**
 * 插入排序
 * 在要排序的一组数中，假设前面(n-1) [n>=2] 个数已经是排
 * 好顺序的，现在要把第n个数插到前面的有序数中，使得这n个数
 * 也是排好顺序的。如此反复循环，直到全部排好顺序。
 */
public class Insertion {
    public static void sort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0 && (a[j] < a[j - 1]); j--) {
                int temp = a[j];
                a[j] = a[j - 1];
                a[j - 1] = temp;
                for (Integer num : a) {
                    System.out.print(num + ", ");
                }
                System.out.print("\n");
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {3, 2, 5, 7, -1, 10, 1};
        sort(a);
        for (Integer i : a) {
            System.out.print(i + ", ");
        }
    }
}
