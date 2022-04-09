package ua.ithillel.tictactoe;

public class CoordinateValidator {

    private final int minRange;
    private final int maxRange;

    public CoordinateValidator(int minRange, int maxRange) {
        this.minRange = minRange;
        this.maxRange = maxRange;
    }

    public boolean valid(Coordinate coordinate) {
        if (coordinate == null) return false;
        return (coordinate.getH() >= minRange && coordinate.getH() <= maxRange)
                && (coordinate.getV() >= minRange && coordinate.getV() <= maxRange);
    }

    public boolean notValid(Coordinate coordinate) {
        return !valid(coordinate);
    }

}
