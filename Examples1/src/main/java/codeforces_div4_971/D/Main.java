package codeforces_div4_971.D;

import java.util.*;


public class Main {
    private static final Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int t = s.nextInt();
        for (int i = 0; i < t; ++i) {
            task();
        }
    }

    private static void task() {
        int n = s.nextInt();
        HashSet<IntPair> pointsSet = new HashSet<>();
        ArrayList<IntPair> pointArray0 = new ArrayList<>();
        ArrayList<IntPair> pointArray1 = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            int x = s.nextInt();
            int y = s.nextInt();
            IntPair p = new IntPair(x, y);
            if (p.y() == 0) {
                pointArray0.add(p);
            } else {
                pointArray1.add(p);
            }
            pointsSet.add(p);

        }
        pointArray0.sort((p1, p2) -> Integer.compare(p1.x(), p2.x()));
        pointArray1.sort((p1, p2) -> Integer.compare(p1.x(), p2.x()));
        long totalCount = getTotalCount(pointArray1, pointsSet, pointArray0);
        System.out.println(totalCount);
    }

    private static long getTotalCount(ArrayList<IntPair> pointArray1, HashSet<IntPair> pointsSet, ArrayList<IntPair> pointArray0) {
        long totalCount = 0;
        //case 1
        for (IntPair p : pointArray1) {
            //sub case 1
            IntPair toFind1 = new IntPair(p.x() - 1, 0);
            IntPair toFind2 = new IntPair(p.x() + 1, 0);
            if (pointsSet.contains(toFind1) && pointsSet.contains(toFind2)) {
                ++totalCount;
            }

            //sub case 2
            IntPair toFind3 = new IntPair(p.x(), 0);
            if (pointsSet.contains(toFind3)) {
                totalCount += pointArray0.size() - 1;
            }
        }
        //case 2
        for (IntPair p : pointArray0) {
            //sub case 1
            IntPair toFind1 = new IntPair(p.x() - 1, 1);
            IntPair toFind2 = new IntPair(p.x() + 1, 1);
            if (pointsSet.contains(toFind1) && pointsSet.contains(toFind2)) {
                ++totalCount;
            }

            //sub case 2
            IntPair toFind3 = new IntPair(p.x(), 1);
            if (pointsSet.contains(toFind3)) {
                totalCount += pointArray1.size() - 1;
            }
        }
        return totalCount;
    }

    public record IntPair(int x, int y) {

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            IntPair that = (IntPair) o;
            return x == that.x() && y == that.y();
        }

        @Override
        public int hashCode() {
            return 17 * Integer.hashCode(x) + Integer.hashCode(y);
        }

        @Override
        public String toString() {
            return '(' + x() + ", " + y() + ')';
        }
    }
}
