/**
 * Created by Admin on 20.01.2017 г..
 */
public class CreateMatrice {

    public static void main(String[] args) {
        int[][] array = new int[3][4];
        for (int row = 0; row < array.length; row++)
            for (int col = 0; col < array[0].length; col++)
                array[row][col] = row + col;

        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt +" ");
            }
            System.out.println();
        }



    }
}
