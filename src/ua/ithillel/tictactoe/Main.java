package ua.ithillel.tictactoe;

public class Main {
    public static void main(String[] args) {
        Field field = new Field();
        FieldDrawer fieldDrawer = new FieldDrawer();
        fieldDrawer.draw(field);
        WinChecker winChecker = new WinChecker();
        DrawChecker drawChecker = new DrawChecker();
        do {
            playStep(field, fieldDrawer);
        } while (!winChecker.isWinner(field, 'X') && !winChecker.isWinner(field, 'O') &&
                !drawChecker.isDraw(field));
        if (winChecker.isWinner(field, 'X')) {
            System.out.println("X wins");
        } else if (winChecker.isWinner(field, 'O')) {
            System.out.println("O wins");
        } else {
            System.out.println("Draw");
        }
    }

    private static void playStep(Field field, FieldDrawer fieldDrawer) {
        CoordinateValidator validator = new CoordinateValidator(0, 2);
        Coordinate coordinate;
        CoordinateChecker coordinateChecker = new CoordinateChecker();
        do {
            coordinate = new StdoutCoordinateScanner().scan();
        } while (validator.notValid(coordinate) || !coordinateChecker.isEmpty(coordinate, field));
        field.setValue(coordinate.getH(), coordinate.getV(), 'X');
        fieldDrawer.draw(field);

        RandomCoordinateScanner randomCoordinateScanner = new RandomCoordinateScanner();
        Coordinate randomCoordinate;
        do {
            randomCoordinate = randomCoordinateScanner.scan();
            System.out.println(randomCoordinate);
        } while (!coordinateChecker.isEmpty(randomCoordinate, field));
        field.setValue(randomCoordinate.getH(), randomCoordinate.getV(), 'O');
        fieldDrawer.draw(field);
    }
}
