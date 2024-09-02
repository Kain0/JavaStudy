package org.example.basic;

import java.util.Arrays;

public class ExampleArrays {
    public static void main(String[] args) {
        int sum = 0;
        int x = 2;
        int y = 10;
        int[][] nums = new int[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                nums[i][j] = (i + 1) * (j + 1);
            }
        }


        for (var e : nums) {
            System.out.println(Arrays.toString(e));
        }

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                sum += nums[i][j];

            }
        }
        System.out.println(sum);
    }
}
