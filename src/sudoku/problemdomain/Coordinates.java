package sudoku.problemdomain;

public class Coordinates {
    // final variables cannot be changed
    private final int row;
    private final int col;

    public Coordinates(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    // method in subclass is overriding method from superclass
    @Override
    public boolean equals(Object obj) {
        // this will allow to store the coords in a hashmap
        // since every object extends the Object class
        if (this == obj) { return true; }
        if (obj == null) { return false; }
        if (getClass() != obj.getClass()) { return false; }
        Coordinates other = (Coordinates) obj;
        return row == other.row && col == other.col;
    }

    @Override
    public int hashCode() {
        return Objects.hash(row, col);
    }

}