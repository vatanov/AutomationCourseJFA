package lesson_4_hw;

public class Main {
    public static void main(String[] args) {
        // Positive:
        int[][] m1 = Matrix.create(5, 5, 7);
        Matrix.print(m1);
        Matrix.addLeftDiagonal(m1, 0);
        Matrix.print(m1);

        int[][] m2 = Matrix.create(4, 4, 0);
        Matrix.print(m2);
        Matrix.addRightDiagonal(m2, 1);
        Matrix.print(m2);

        int[][] m3 = Matrix.create(6, 6, 3);
        Matrix.print(m3);
        Matrix.addBothDiagonals(m3, 7);
        Matrix.print(m3);

        // Nagative:
        int[][] m4 = Matrix.create(4, 6, 0);
        Matrix.print(m4);
        Matrix.addRightDiagonal(m4, 1);
        Matrix.print(m4);
    }
}
