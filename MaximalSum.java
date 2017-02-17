import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        scanner.nextLine();

        Integer[][] matrix = new Integer[rows][cols];
        for (int row = 0; row < rows; row ++)
            for (int col = 0; col < cols; col ++)
                matrix[row][col] = scanner.nextInt();


        int maxvalue = Integer.MIN_VALUE;
        Integer[][] maxmatrix = new Integer[3][3];

        for (int i = 0; i < rows-2 ; i++) {
            for (int j = 0; j < cols-2 ; j++) {
                int currentvalue = matrix[i][j]+matrix[i][j+1]+matrix[i][j+2]+matrix[i+1][j]+matrix[i+1][j+1]+matrix[i+1][j+2]+matrix[i+2][j]+matrix[i+2][j+1]+matrix[i+2][j+2];
                if (currentvalue>maxvalue){
                    maxvalue = currentvalue ;
                    for (int k = 0; k < 3 ; k++)
                        for (int l = 0; l < 3 ; l++)
                            maxmatrix[k][l] = matrix[i+k][j+l];

                }
            }
        }
        System.out.println("Sum = " + maxvalue);
        for (Integer[] integers : maxmatrix) {
            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }



    }
}
