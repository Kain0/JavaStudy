package codeforces_div4_971.D;

public class IntPair {
    private int x = 0;
    private int y = 0;

    public IntPair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntPair that = (IntPair) o;
        return x == that.x && y == that.y;
    }

    @Override
    public int hashCode() {
        return 17 * Integer.hashCode(x) + Integer.hashCode(y);
    }

    @Override
    public String toString() {
        return '(' + Integer.toString(getX()) + ", " + Integer.toString(getY()) + ')';
    }
}
