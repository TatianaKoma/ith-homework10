package ua.ithillel.tictactoe;

public abstract class Checker {
   protected Field field;

    public Checker(Field field) {
        this.field = field;
    }

    public abstract boolean check();
}
