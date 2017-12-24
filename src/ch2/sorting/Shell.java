package ch2.sorting;

/**
 * 希尔排序
 */
public class Shell {
    public static void sort(int[] a) {
        int length = a.length;
        int h = 1;
        while (h < length / 3) {
            h = 3 * h + 1;
        }
        System.out.println(h);
        while (h >= 1) {
            System.out.println(h);
            for (int i = h; i < length; i++) {
                for (int j = i; j >= h && a[j] < a[j - h]; j -= h) {
                    int temp = a[j];
                    a[j] = a[j - h];
                    a[j - h] = temp;
                    for (Integer num : a) {
                        System.out.print(num + ", ");
                    }
                    System.out.print("\n");
                }
            }
            h = h / 3;
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
