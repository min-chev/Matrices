import java.util.Scanner;

public class SquaresMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        scanner.nextLine();

        String[][] matrix = new String[rows][cols];
        for (int row = 0; row < rows; row ++)
            for (int col = 0; col < cols; col ++)
        matrix[row][col] = scanner.next();


        int equals = 0;
        for (int i = 0; i < rows-1 ; i++) {
            for (int j = 0; j < cols-1 ; j++) {
               if (matrix[i][j].equals(matrix[i][j+1]) && matrix[i][j].equals(matrix[i+1][j])&& matrix[i][j].equals(matrix[i+1][j+1])){
                   equals++;
               }
            }
        }
        System.out.println(equals);



    }
}
