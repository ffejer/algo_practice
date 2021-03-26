package me.fejer.algopractice;

import java.util.Arrays;

public class MinimumWaitingTime {

    public static void main(String[] args) {
        minimumWaitingTime(new int[]{1, 2, 3, 4});
    }

    public static int minimumWaitingTime(int[] queries) {
        Arrays.sort(queries);
        int runningSum = 0;
        int total = 0;
        for (int i = 1; i < queries.length; i++) {
            runningSum += queries[i - 1];
            total += runningSum;
        }
        return total;
    }
}
