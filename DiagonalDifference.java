import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        int[][] matrix = new int[n][n];

        for (int rows = 0; rows < n; rows++)
            for (int cols = 0; cols < n; cols++)
                matrix[rows][cols] = scanner.nextInt();

        int primsum = 0;
        int secsum = 0;

        for (int i = 0; i < n; i++) {
            primsum += matrix[i][i];
            secsum += matrix[i][n-1-i];
        }

int diff = Math.abs(primsum - secsum);

        System.out.println(diff);

    }
}
