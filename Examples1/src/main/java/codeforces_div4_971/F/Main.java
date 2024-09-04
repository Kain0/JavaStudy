package codeforces_div4_971.F;

import java.util.Scanner;

public class Main {
    private static final Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int t = s.nextInt();
        for (int i = 0; i < t; ++i) {
            solution();
        }
    }


    public static void solution() {
        int n = s.nextInt();
        int q = s.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; ++i) {
            a[i] = s.nextLong();
        }
        long[] cnt = new long[n];
        cnt[0] = a[0];
        for (int i = 1; i < n; ++i) {
            cnt[i] = cnt[i - 1] + a[i];
        }

        for (int i = 0; i < q; ++i) {
            request(n, cnt);
        }


    }

    public static void request(int n, long[] cnt) {
        //System.out.println("ready");
        long l = s.nextLong() - 1;
        long r = s.nextLong() - 1;
        int c1 = (int) (l / n);
        int c2 = (int) (r / n);
        int i = (int) (l % n);
        int j = (int) (r % n);

        //System.out.println(c1 + " " + c2 + " " + i + " " + j);

        if (c1 == c2) {
            System.out.println(requestIfC1EqualsC2(c1, i, j, n, cnt));
        } else {
            System.out.println(requestIfC1NotEqualsC2(c1, c2, i, j, n, cnt));
        }

    }

    public static long requestIfC1EqualsC2(int c, int i, int j, int n, long[] cnt) {
        long initial = requestIfC1NotEqualsC2(c, c, i, j, n, cnt) + cnt[n - 1];
        i -= 1;
        j += 1;
        int starting = (n - c) % n;

        long c2Sum = 0;
        if (i >= 0) {
            if (i < starting) {
                c2Sum += cnt[n - starting + i] - cnt[c - 1];
            } else {
                c2Sum += cnt[n - 1] - cnt[n - 1 - starting] + cnt[i - starting];
            }
        }

        long c1Sum = 0;
        if (j < n) {
            if (j <= starting) {
                c1Sum += cnt[n - 1] - cnt[n - 1 - starting + j];
                if (c == 0) {
                    c1Sum += cnt[n - 1];
                } else {
                    c1Sum += cnt[c - 1];
                }
            } else {
                if (c == 0) {
                    c1Sum += cnt[n - 1] - cnt[j - starting - 1];
                } else {
                    c1Sum += cnt[c - 1] - cnt[j - starting - 1];
                }
            }
        }
        return (initial - c1Sum - c2Sum) / 2;

    }

    public static long requestIfC1NotEqualsC2(int c1, int c2, int i, int j, int n, long[] cnt) {
        long c1Sum = 0;
        int starting = (n - c1) % n;
        if (i <= starting) {
            c1Sum += cnt[n - 1] - cnt[n - 1 - starting + i];
            if (c1 == 0) {
                c1Sum += cnt[n - 1];
            } else {
                c1Sum += cnt[c1 - 1];
            }
        } else {
            if (c1 == 0) {
                c1Sum += cnt[n - 1] - cnt[i - starting - 1];
            } else {
                c1Sum += cnt[c1 - 1] - cnt[i - starting - 1];
            }
        }
        long c2Sum = 0;
        starting = (n - c2) % n;
        if (j < starting) {
            c2Sum += cnt[n - starting + j] - cnt[c2 - 1];
        } else {
            c2Sum += cnt[n - 1] - cnt[n - 1 - starting] + cnt[j - starting];
        }
        return c1Sum + c2Sum + (c2 - c1 - 1) * cnt[n - 1];
    }
}
