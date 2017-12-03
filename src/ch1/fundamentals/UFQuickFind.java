package ch1.fundamentals;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * union-find 算法实现之 quick-find
 */
public class UFQuickFind extends UnionFind {
    public UFQuickFind(int n) {
        super(n);
    }

    @Override
    public int find(int p) {
        return id[p];
    }

    @Override
    public void union(int p, int q) {
        int pID = find(p);
        int qID = find(q);
        System.out.println("pID:" + pID + " qID:" + qID);

        if (pID == qID) return;

        for (int i = 0; i < id.length; i++) {
            if (id[i] == pID) id[i] = qID;
        }
        System.out.println(Arrays.toString(id));
        count--;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("res/tinyUF.txt"));
        int N = scanner.nextInt();
        UnionFind uf = new UFQuickFind(N);
        while (scanner.hasNext()) {
            int p = scanner.nextInt();
            int q = scanner.nextInt();
            System.out.println("index: " + p + " " + q);
            if (uf.connected(p, q)) continue;
            uf.union(p, q);
        }
        System.out.println("连通分量数：" + uf.count);
        scanner.close();
    }
}
