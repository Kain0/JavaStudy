package codeforces_div4_971.C;

import java.util.Scanner;

import static java.lang.Math.*;

public class Main {
    private static final Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int t = s.nextInt();
        for (int i = 0; i < t; ++i) {
            task();
        }
    }


    public static void task() {
        int x = s.nextInt();
        int y = s.nextInt();
        int k = s.nextInt();
        int result = 0;
        if (x > y) {
            int steps_y = ((y + k - 1) / k);
            x = max(0, x - steps_y * k);
            int steps_x = (x + k - 1) / k;
            result = 2 * (steps_x + steps_y) - (x == 0 ? 0 : 1);
        } else {
            int steps_x = ((x + k - 1) / k);
            y = max(0, y - steps_x * k);
            int steps_y = (y + k - 1) / k;
            result = 2 * (steps_x + steps_y);
        }
        System.out.println(result);
    }
}
