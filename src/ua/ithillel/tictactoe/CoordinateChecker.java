package ua.ithillel.tictactoe;

public class CoordinateChecker {
    public boolean isEmpty(Coordinate coordinate, Field field) {
        char[][] data = field.getData();

        return data[coordinate.getH()][coordinate.getV()] == '-';
    }
}
