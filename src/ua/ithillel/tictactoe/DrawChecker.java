package ua.ithillel.tictactoe;

public class DrawChecker {
    public boolean isAnyEmptyCell(Field field) {
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

    public boolean isDraw(Field field) {
        boolean isWinX = new WinChecker().isWinner(field, 'X');
        boolean isWinO = new WinChecker().isWinner(field, 'O');
        return !isWinX && !isWinO && !isAnyEmptyCell(field);
    }
}
