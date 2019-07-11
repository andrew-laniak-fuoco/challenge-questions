package ca.jrvs.challenge.bit;

public class PowTwo {

    /**
     * Write an algorithm to check if a
     * given integer is a power of two
     */
    public static boolean solution(int n) {
        if (n < 0) {
            n *= -1;    // make sure n is positive;
        }
        while (n > 1) {
            if ((n & 00000000000000000000000000000001) == 1) {
                return false;
            }
            n = n >> 1;
        }

        return true;
    }
}
