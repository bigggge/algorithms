package ch2.sorting;

/**
 * 选择排序
 * 首先，找到数组中最小的那个元素，其次，将它和数组第一个元素交换位置，
 * 然后在剩下的元素中找到最小的元素，将它和数组的第二个元素交换位置。
 * 如此往复，直到整个数组排序
 */
public class Selection {
    public static void sort(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (less(a[j], a[min])) min = j;
            }
            exch(a, i, min);
        }
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Object[] a, int i, int j) {
        Object swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    public static void main(String[] args) {
        Integer[] a = {2, 3, 5, 7, 6, 10, 1};
        sort(a);
        for (Integer i : a) {
            System.out.print(i + ", ");
        }
    }
}
