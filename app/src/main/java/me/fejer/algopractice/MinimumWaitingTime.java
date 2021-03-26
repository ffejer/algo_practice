package me.fejer.algopractice;

import java.util.Arrays;

public class MinimumWaitingTime {

    public static void main(String[] args) {
        minimumWaitingTime(new int[]{1, 2, 3, 4});
    }

    /*
     *  the main idea here is to sort in ascending order. that way the queries with the lower latency are in front
     *  thus the latter ones (the ones that are longer) wait less than if they were in the front.
     *
     * */
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
