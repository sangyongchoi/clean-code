package chapter_02;

public class Cell {
    int[] cells;
    private int STATUS_VALUE = 0;
    private int FLAGGED = 4;

    public Cell(int[] cells) {
        this.cells = cells;
    }

    public boolean isFlagged() {
        if (cells[STATUS_VALUE] == FLAGGED) {
            return true;
        }

        return false;
    }
}
