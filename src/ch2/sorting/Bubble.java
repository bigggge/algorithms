package ch2.sorting;

/**
 * 冒泡排序
 * 在要排序的一组数中，对当前还未排好序的范围内的全部数，自上而下对相邻的两个数依次进行比较和调整，
 * 让较大的数往下沉，较小的往上冒。
 * 即每当两相邻的数比较后发现它们的排序与排序要求相反时，就将它们互换。
 */
public class Bubble {
    public static void sort(int[] a) {
        int length = a.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (a[j] < a[i]) {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                    for (Integer num : a) {
                        System.out.print(num + ", ");
                    }
                    System.out.print("\n");
                }
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
