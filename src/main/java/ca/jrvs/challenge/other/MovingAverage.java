package ca.jrvs.challenge.other;

import java.util.Arrays;

public class MovingAverage {

    /**
     * Calculates an average from a data stream of numbers
     * (has issues if sum or length overflows)
     */
    public static double solution(double[] stream) {
        Double sum = 0.0;
        Integer length = 0;

        for(double d : stream) {
            sum += d;
            length++;
        }

        return sum/length;
    }
}
