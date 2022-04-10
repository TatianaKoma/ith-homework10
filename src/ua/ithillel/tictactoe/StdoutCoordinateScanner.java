package ua.ithillel.tictactoe;

import java.util.Scanner;

public class StdoutCoordinateScanner implements CoordinateScanner {

    private final Scanner scanner = new Scanner(System.in);

    public Coordinate scan() {
        String[] coordinates;
        do {
            System.out.println("Please enter coordinates: `hor,vert`. For instance `1,2` ...");
            coordinates = scanner.nextLine().split(",");
        } while (!isValid(coordinates));
        int h = Integer.parseInt(coordinates[0]) - 1;
        int v = Integer.parseInt(coordinates[1]) - 1;
        return new Coordinate(h, v);
    }

    private boolean isValid(String[] coordinates) {
        if (coordinates.length != 2) {
            return false;
        }
        return coordinates[0].matches("\\d") && coordinates[1].matches("\\d");
    }
}
