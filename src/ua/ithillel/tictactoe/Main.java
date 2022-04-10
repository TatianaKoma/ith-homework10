package ua.ithillel.tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        do {
            playGame();
            int input = getUserInput();
            if (input == 2) {
                System.out.println("Bye");
                break;
            }
        } while (true);
    }

    private static void playStep(Field field, FieldDrawer fieldDrawer) {
        CoordinateValidator validator = new CoordinateValidator(0, 2);
        Coordinate coordinate;
        CoordinateChecker coordinateChecker;
        do {
            coordinate = new StdoutCoordinateScanner().scan();
            coordinateChecker = new CoordinateChecker(field, coordinate);
        } while (validator.notValid(coordinate) || !coordinateChecker.check());
        field.setValue(coordinate.getH(), coordinate.getV(), 'X');
        fieldDrawer.draw(field);

        RandomCoordinateScanner randomCoordinateScanner = new RandomCoordinateScanner();
        Coordinate randomCoordinate;
        do {
            randomCoordinate = randomCoordinateScanner.scan();
            coordinateChecker = new CoordinateChecker(field, randomCoordinate);
            System.out.println(randomCoordinate);
        } while (!coordinateChecker.check());
        field.setValue(randomCoordinate.getH(), randomCoordinate.getV(), 'O');
        fieldDrawer.draw(field);
    }

    private static void playGame() {
        Field field = new Field();
        FieldDrawer fieldDrawer = new FieldDrawer();
        fieldDrawer.draw(field);
        WinChecker winCheckerX = new WinChecker(field, 'X');
        WinChecker winCheckerO = new WinChecker(field, 'O');
        DrawChecker drawChecker = new DrawChecker(field);
        do {
            playStep(field, fieldDrawer);
        } while (!winCheckerX.check() && !winCheckerO.check() &&
                !drawChecker.check());
        if (winCheckerX.check()) {
            System.out.println("X wins");
        } else if (winCheckerO.check()) {
            System.out.println("O wins");
        } else {
            System.out.println("Draw");
        }
    }

    private static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        int input;
        do {
            System.out.println("Please input 1 - play again, 2 - game over");
            while (!scanner.hasNextInt()) {
                System.out.println("This isn't a number. Try again.");
                scanner.next();
            }
            input = scanner.nextInt();
        } while (input != 1 && input != 2);
        return input;
    }
}
