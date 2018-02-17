import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {
    private WeightedQuickUnionUF unionUF;
    
    public Percolation(int n) {
        WeightedQuickUnionUF unionFind =  new WeightedQuickUnionUF(n*n);
    }

    public boolean isOpen(int row, int col) {
        return true;
    }

    public boolean isFull(int row, int col) {
        return true;
    }

    public int numberOfOpenSites() {
        return 0;
    }

    public void open(int row, int col) {
    }

    public boolean percolates() {
        return true;
    }

    public static void main(String[] args) {
        
    }
}
