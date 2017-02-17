import java.util.Scanner;

public class MatricesPalidromes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] inp = scanner.nextLine().split(" ");

        int rows = Integer.parseInt(inp[0]);
        int cols = Integer.parseInt(inp[1]);

        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        String [][] array = new String[rows][cols];
        for (int row = 0; row < array.length; row++)
            for (int col = 0; col < array[0].length; col++)
                array[row][col] = String.valueOf(alphabet[row])+String.valueOf(alphabet[col+row])+String.valueOf(alphabet[row]);



        for (String[] ints : array) {
            for (String  anInt : ints) {
                System.out.print(anInt +" ");
            }
            System.out.println();
        }


    }
}
