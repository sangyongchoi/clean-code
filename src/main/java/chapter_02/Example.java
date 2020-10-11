package chapter_02;

import java.util.ArrayList;
import java.util.List;

public class Example {
    int elapsedTimeDays;
    int daysSinceCreation;
    int daySinceModification;
    int fileAgeInDays;

    private List<int[]> theList = new ArrayList<>();
    private List<Cell> gameBoard = new ArrayList<>();
    private int STATUS_VALUE = 0;
    private int FLAGGED = 4;


    public List<int[]> getFlaggedCells() {
        List<int[]> flaggedCells = new ArrayList<>();

        for (int[] cell : theList) {
            if (cell[STATUS_VALUE] == FLAGGED) {
                flaggedCells.add(cell);
            }
        }

        return flaggedCells;
    }
    /*
    public List<Cell> getFlaggedCells() {
        List<Cell> flaggedCells = new ArrayList<>();

        for (Cell cell : gameBoard) {
            if (cell.isFlagged()) {
                flaggedCells.add(cell);
            }
        }

        return flaggedCells;
    }
     */
}
