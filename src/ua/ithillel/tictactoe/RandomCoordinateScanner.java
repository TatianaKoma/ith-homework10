package ua.ithillel.tictactoe;

import java.util.Random;

public class RandomCoordinateScanner implements CoordinateScanner {

    private final Random random = new Random();

    @Override
    public Coordinate scan() {
        return new Coordinate(random.nextInt(3), random.nextInt(3));
    }

}
