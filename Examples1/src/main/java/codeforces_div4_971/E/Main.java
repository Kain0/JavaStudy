package codeforces_div4_971.E;
import java.util.Scanner;

public class Main {
    private static final Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        int t = s.nextInt();
        for (int i = 0; i < t; ++i) {
            long n = s.nextLong();
            long k = s.nextLong();
            solution2(n, k);
        }
    }

    public static void solution1(long n, long k) {
        // equation = i * i + (2 * k - 1) * i + n * (1 - n - 2 * k) / 2

        long d = 2 * (k - 1 - n * (1 - n - 2 * k));
        double i = ((1 - 2 * k) + Math.sqrt(d)) / 2;
        // second root is always negative so does not suit for index i

        long i1 = (long) Math.ceil(i);
        long i2 = (long) Math.floor(i);
        long x1 = Math.abs(equation(i1, k, n));
        long x2 = Math.abs(equation(i2, k, n));
        System.out.println(Math.min(x1, x2));

    }

    public static void solution2(long n, long k) {

        long l = -1;
        long r = n - 1;
        while (r - l > 1) {
            long m = (r + l) / 2;
            long e = equation(m, k, n);
            if (e < 0) {
                l = m;
            } else if (e > 0) {
                r = m;
            } else {
                r = m;
                break;
            }
        }
        long x1 = Math.abs(equation(r, k, n));
        long x2 = x1;
        if (r != 0) {
            x2 = Math.abs(equation(r - 1, k, n));
        }
        System.out.println(Math.min(x1, x2));
    }

    public static long equation(long i, long k, long n) {
        return i * i + (2 * k - 1) * i + n * (1 - n - 2 * k) / 2;
    }

}