package ch2.sorting;

/**
 * 快速排序
 * 选择一个基准元素
 * 将比这个数大的数全放到它的右边，小于或等于它的数全放到它的左边。
 * 此时基准元素在其排好序后的正确位置,然后再用同样的方法递归地排序划分的两部分。
 */
public class Quick {
    public static void quick(int[] a, int low, int high) {
        if (low < high) {
            int i = low, j = high, pivot = a[low];
            while (i < j) {
                // 从右向左找第一个小于 pivot 的数
                while (i < j && a[j] >= pivot)
                    j--;
                if (i < j)
                    a[i++] = a[j];

                // 从左向右找第一个大于等于 pivot 的数
                while (i < j && a[i] < pivot)
                    i++;
                if (i < j)
                    a[j--] = a[i];
            }
            a[i] = pivot;
            quick(a, low, i - 1); // 递归调用
            quick(a, i + 1, high);
        }
    }

    //            0     1     2     3    4    5
    // Step 1     3,    2,   -1,   10,   1,   2
    // Step 2   [2],    2,   -1,   10,   1,   2           从右向左找第一个小于 pivot 的数 填a[0]的坑 a[0]=a[5]=2
    // Step 3     2,    2,   -1,   10,   1,   [10]        从左向右找第一个大于等于 pivot 的数 填a[5]的坑 a[5]=a[3]=10
    // Step 4     2,    2,   -1,  [1],   1,   10           a[3]=a[4]=10
    // Step 5     2,    2,   -1,    1, [3],   10          a[4]=pivot=3
    // Step 6   [1],    2,   -1,    1,   3,   10          pivot=2 开始递归左侧 a[0]=a[3]=1
    // Step 7     1,    2,   -1,  [2],   3,   10          a[3]=a[1]=2
    // Step 8     1, [-1],   -1,    2,   3,   10          a[1]=a[2]=-1
    // Step 9     1,   -1,  [2],    2,   3,   10          a[2]=pivot=2
    // Step 10 [-1],   -1,    2,    2,   3,   10          开始递归左侧 pivot = 1 a[0]=a[1]=-1
    // Step 11   -1,   [1],   2,    2,   3,   10          a[1]=pivot=1
    // Step 12   -1,    1 ,   2,    2,   3,   10          开始递归右侧，右侧排序完成
    public static void main(String[] args) {
        int[] a = {3, 2, -1, 10, 1, 2};
        quick(a, 0, a.length - 1);
        for (Integer i : a) {
            System.out.print(i + ", ");
        }
    }
}
