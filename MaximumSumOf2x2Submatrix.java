import java.util.Scanner;

public class MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] size = scanner.nextLine().split(", ");

        int rows = Integer.parseInt(size[0]);
        int cols = Integer.parseInt(size[1]);

        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            String[] givenrow = scanner.nextLine().split(", ");
            for (int column = 0; column < cols; column++) {
                matrix[row][column] = Integer.parseInt(givenrow[column]);

            }
        }

        int maxsum = Integer.MIN_VALUE;
        int startcol = 0;
        int startrow = 0;

        for (int row = 0; row < matrix.length-1; row++) {
             for (int column = 0; column < matrix[0].length-1; column++) {
             int numsum = matrix[row][column] +
                        matrix[row][column+1] +
                        matrix[row +1][column]  +
                        matrix[row +1][column+1];
                 if (numsum>maxsum){
                     maxsum = numsum;
                     startrow = row;
                     startcol = column;

                 }

            }
        }

        System.out.println(matrix[startrow][startcol] + " " + matrix[startrow][startcol+1] );
        System.out.println(matrix[startrow+1][startcol] + " " + matrix[startrow+1][startcol+1] );
        System.out.println(maxsum);
    }
}
