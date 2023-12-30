package lesson_4_hw;

public class Main {
    public static void main(String[] args) {
        int[][] m = Matrix.create(4, 5, 7);
        Matrix.print(m);
        Matrix.addLeftDiagonal(m, 0);
        Matrix.print(m);
    }
}
