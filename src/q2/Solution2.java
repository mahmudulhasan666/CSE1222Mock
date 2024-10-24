package q2;

import java.util.ArrayList;

class Matrix {
    private String[][] grid;
    private int rows, cols;

    public Matrix(int numRows, int numColumns) {
        this.rows = numRows;
        this.cols = numColumns;
        grid = new String[numRows][numColumns];
    }

    public void set(int row, int column, String description) {
        grid[row][column] = description;
    }

    public String get(int row, int column) {
        return grid[row][column];
    }

    public ArrayList<Cell> getDescribedCells() {
        ArrayList<Cell> describedCells = new ArrayList<>();
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (grid[row][col] != null) {
                    describedCells.add(new Cell(row, col));
                }
            }
        }
        return describedCells;
    }

    class Cell {
        private int row, col;

        public Cell(int row, int col) {
            this.row = row;
            this.col = col;
        }

        @Override
        public String toString() {
            return "Cell at (" + row + ", " + col + ") contains: " + get(row, col);
        }
    }
}
