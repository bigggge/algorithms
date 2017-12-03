package ch1.fundamentals;

public abstract class UnionFind {
    protected int[] id; // 分量id
    protected int count; // 分量数量

    public UnionFind(int n) {
        // 初始化分量id数组
        count = n;
        id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    public int count() {
        return count;
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    public abstract int find(int p);

    public abstract void union(int p, int q);
}
