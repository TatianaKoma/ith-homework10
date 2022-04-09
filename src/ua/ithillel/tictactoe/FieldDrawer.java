package ua.ithillel.tictactoe;

public class FieldDrawer {
    public void draw(Field field) {
        char[][] data = field.getData();

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                System.out.printf(data[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}
