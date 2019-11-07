package l9arrays;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Arrays;
import java.util.Scanner;

public class Ex16 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] matrix = new int[3][2];

        newMatrix(matrix);
        for (int i = 0 ; i<matrix.length;i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                System.out.printf("%6d", matrix[i][j]);
            }
            System.out.println();
        }


    }

    public static void newMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("matrix[%d][%d]: ", i, j);
                matrix[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
    }
}
