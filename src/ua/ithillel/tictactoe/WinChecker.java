package ua.ithillel.tictactoe;

public class WinChecker extends Checker {
    public final Coordinate[][] WIN_COMBINATION = {
            {new Coordinate(0, 0), new Coordinate(0, 1), new Coordinate(0, 2)},
            {new Coordinate(1, 0), new Coordinate(1, 1), new Coordinate(1, 2)},
            {new Coordinate(2, 0), new Coordinate(2, 1), new Coordinate(2, 2)},
            {new Coordinate(0, 0), new Coordinate(1, 0), new Coordinate(2, 0)},
            {new Coordinate(0, 1), new Coordinate(1, 1), new Coordinate(2, 1)},
            {new Coordinate(0, 2), new Coordinate(1, 2), new Coordinate(2, 2)},
            {new Coordinate(0, 0), new Coordinate(1, 1), new Coordinate(2, 2)},
            {new Coordinate(2, 0), new Coordinate(1, 1), new Coordinate(0, 2)}};
    private char symbol;

    public WinChecker(Field field, char symbol) {
        super(field);
        this.symbol = symbol;
    }

    @Override
    public boolean check() {
        char[][] data = field.getData();

        for (int i = 0; i < WIN_COMBINATION.length; i++) {
            int h1 = WIN_COMBINATION[i][0].getH();
            int v1 = WIN_COMBINATION[i][0].getV();
            char fieldValue1 = data[h1][v1];
            int h2 = WIN_COMBINATION[i][1].getH();
            int v2 = WIN_COMBINATION[i][1].getV();
            char fieldValue2 = data[h2][v2];
            int h3 = WIN_COMBINATION[i][2].getH();
            int v3 = WIN_COMBINATION[i][2].getV();
            char fieldValue3 = data[h3][v3];

            if (fieldValue1 == symbol && fieldValue2 == symbol && fieldValue3 == symbol) {
                return true;
            }
        }
        return false;
    }
}
