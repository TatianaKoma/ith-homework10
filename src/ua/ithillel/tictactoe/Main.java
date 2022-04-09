package ua.ithillel.tictactoe;

public class Main {
    public static void main(String[] args) {
        Field field = new Field();
        FieldDrawer fieldDrawer = new FieldDrawer();
        fieldDrawer.draw(field);
        Coordinate coordinate = new StdoutCoordinateScanner().scan();
        field.setValue(coordinate.getH() - 1, coordinate.getV() - 1, 'X');
        fieldDrawer.draw(field);

        // AI here
        CoordinateValidator validator = new CoordinateValidator(0, 2);
        RandomCoordinateScanner randomCoordinateScanner = new RandomCoordinateScanner();

        Coordinate randomCoordinate;
        do {
            randomCoordinate = randomCoordinateScanner.scan();
            System.out.println(randomCoordinate);
        } while (validator.notValid(randomCoordinate));

        field.setValue(randomCoordinate.getH(), randomCoordinate.getV(), 'O');
        fieldDrawer.draw(field);

    }
}
