package ca.jrvs.challenge.other;

public class Fibonacci {

    /**
     * A recursive algorithm to find the nth
     * fibonacci number
     * O(n^n) runtime
     */
    public static int recusiveSolution(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return (recusiveSolution(n-1) + recusiveSolution(n-2));
    }

    /**
     * A dynamic programming algorithm to find
     * the nth fibonacci number
     * O(n) runtime
     */
    public static int dynamicSolution(int n) {
        int[] values = new int[Math.max(2,n+1)];
        values[0] = 0;
        values[1] = 1;

        for (int i = 2; i < n+1; i++) {
            values[i] = values[i-1] + values[i-2];
        }

        return values[n];
    }
}
