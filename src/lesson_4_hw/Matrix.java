package lesson_4_hw;

public class Matrix {

    public static int[][] create(int length, int height, int value){
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
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix.length != matrix[i].length) {
                    System.out.println("Matrix is not square");
                    return;
                } else {
                    if (i == j) {
                        matrix[i][j] = value;
                    }
                }
            }
        }
    }
}
