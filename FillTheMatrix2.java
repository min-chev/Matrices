import java.util.Scanner;

public class FillTheMatrix2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        int rows = Integer.parseInt(input[0]);
        int cols = rows;

        int[][] matrix = new int[rows][cols];
        if (input[1].equals("A")) {
            int num = 0;
            for (int col = 0; col < cols; col++) {
                for (int row = 0; row < rows; row++) {
                    num += 1;
                    matrix[row][col] = num;
                }

            }

        } else if (input[1].equals("B")) {
            int num = 0;
            for (int col = 0; col < cols; col++) {
                if (col % 2 == 0) {
                    for (int row = 0; row < rows; row++) {
                        num += 1;
                        matrix[row][col] = num;
                    }
                }else if(col % 2 == 1){
                    for (int row = rows-1; row >= 0; row--) {
                        num += 1;
                        matrix[row][col] = num;
                    }
                }

            }

        }

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }


    }
}
