package ca.jrvs.challenge.bit;

public class Even {

    /**
     * Checks if a given integer is divisible by two
     */
    public static boolean solutionBit(int n) {
        return ((n & 00000000000000000000000000000001) == 0);
    }

    /**
     * Checks if a given integer is divisible by two
     */
    public static boolean solutionMod(int n) {
        return ((n % 2) == 0);
    }
}
