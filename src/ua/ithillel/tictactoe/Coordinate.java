package ua.ithillel.tictactoe;

public class Coordinate {

    private final int h;
    private final int v;

    public Coordinate(int h, int v) {
        this.h = h;
        this.v = v;
    }

    public int getH() {
        return h;
    }

    public int getV() {
        return v;
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "h=" + h +
                ", v=" + v +
                '}';
    }
}
