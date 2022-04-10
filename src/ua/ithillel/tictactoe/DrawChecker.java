package ua.ithillel.tictactoe;

public class DrawChecker extends Checker {
    public DrawChecker(Field field) {
        super(field);
    }

    @Override
    public boolean check() {
        boolean isWinX =new WinChecker(field,'X').check();
        boolean isWinO =new WinChecker(field,'O').check();
        return !isWinX && !isWinO && !isAnyEmptyCell();
    }

    private boolean isAnyEmptyCell() {
        char[][] data = field.getData();
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if (data[i][j] == '-') {
                    count++;
                }
            }
        }
        return count > 0;
    }
}
