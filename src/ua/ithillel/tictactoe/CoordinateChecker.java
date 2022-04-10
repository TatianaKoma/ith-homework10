package ua.ithillel.tictactoe;

public class CoordinateChecker extends Checker {
    private Coordinate coordinate;

    public CoordinateChecker(Field field, Coordinate coordinate) {
        super(field);
        this.coordinate = coordinate;
    }
    @Override
    public boolean check() {
        char[][] data = field.getData();

        return data[coordinate.getH()][coordinate.getV()] == '-';
    }
}
