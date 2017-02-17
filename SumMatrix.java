import java.util.Scanner;

public class SumMatrix {
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


        System.out.println(matrix.length);
        System.out.println(matrix[0].length);

        int sum = 0;
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                sum += anInt;
            }
        }
        System.out.println(sum);
    }

}
