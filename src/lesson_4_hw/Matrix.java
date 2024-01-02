package lesson_4_hw;

public class Matrix {

    public static int[][] create(int length, int height, int value) {
        int[][] matrix = new int[length][height];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = value;
            }
        }
        return matrix;
    }

    public static void print(int[][] matrix) {
        System.out.println("----MATRIX:----");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("----END----");
    }

    public static void addLeftDiagonal(int[][] matrix, int value) {
        if (isSquare(matrix)) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (i == j) {
                        matrix[i][j] = value;
                    }
                }
            }
        }
    }

    public static void addRightDiagonal(int[][] matrix, int value) {
        if (isSquare(matrix)) {
            for (int i = matrix.length - 1; i >= 0; i--) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (j + i == matrix.length - 1) {
                        matrix[i][j] = value;
                    }
                }
            }
        }
    }

    private static boolean isSquare(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix.length != matrix[i].length) {
                    System.out.println("Matrix is not square");
                    return false;
                }
            }
        }
        return true;
    }

    public static void addBothDiagonals(int[][] matrix, int value) {
        addLeftDiagonal(matrix, value);
        addRightDiagonal(matrix, value);
    }
}
