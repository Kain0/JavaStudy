package codeforces_div4_971.B;

import java.util.Scanner;

public class Main {
    private static final Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        int t = s.nextInt();
        for (int i = 0; i < t; ++i) {
            task();
        }
    }

    public static void task() {
        int n = s.nextInt();
        s.nextLine();
        String[] answer = new String[n];
        for (int i = 0; i < n; ++i) {
            String l = s.nextLine();
            answer[n - i - 1] = String.valueOf(l.indexOf('#') + 1);
        }
        String result = String.join(" ", answer);
        System.out.println(result);
    }
}
