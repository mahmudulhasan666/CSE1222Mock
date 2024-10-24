package q2;

import java.util.ArrayList;

public class Runner2 {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(3, 3);
        matrix.set(0, 0, "A");
        matrix.set(1, 1, "B");
        matrix.set(2, 2, "C");

        ArrayList<Matrix.Cell> describedCells = matrix.getDescribedCells();
        for (Matrix.Cell cell : describedCells) {
            System.out.println(cell);
        }
    }
}
