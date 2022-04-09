package ua.ithillel.tictactoe;

public class Field {

    private static final char EMPTY_SYMBOL = '-';

    private final char[][] data = {
        {EMPTY_SYMBOL, EMPTY_SYMBOL, EMPTY_SYMBOL},
        {EMPTY_SYMBOL, EMPTY_SYMBOL, EMPTY_SYMBOL},
        {EMPTY_SYMBOL, EMPTY_SYMBOL, EMPTY_SYMBOL}
    };

    public char[][] getData() {
        return data;
    }

    public void setValue(int h, int v, char ch) {
        data[h][v] = ch;
    }

}
