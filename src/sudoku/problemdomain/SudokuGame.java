package sudoku.problemdomain;
import java.io.Serializable;

/* Serializable will convert an object into byte stream so it can
read and written to a file, sent over a network or otherwise persisted
or transferred. Deserialization will reverse the process in that it converts
the byte stream back into a copy of the object
*/

public class SudokuGame implements Serializable {
    public final GameState gameState;
    private final int[][] gridState;

    public static final int GRID_BOUNDARY = 9;

    public SudokuGame(GameState gameState, int[][] gridState) {
        this.gameState = gameState;
        this.gridState = gridState;
    }

    public GameState getGameState() {
        return gameState;
    }

    public int[][] getGridStateCopy() {
        // prevent the grid object to be modified
        return SudokuUtilities.copyToNewArray(gridState);
    }
}