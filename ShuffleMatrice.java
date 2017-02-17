import java.util.Scanner;


public class ShuffleMatrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        String[][] matrix = new String[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = scanner.next();

        scanner.nextLine();
        String comm = scanner.nextLine();
        while (!comm.equals("END")) {
            String[] command = comm.split(" ");

            if (!command[0].equals("swap")) {
                System.out.println("Invalid input!");
            } else if (command.length > 5) {
                System.out.println("Invalid input!");
            } else {
                try{
                    String temp = matrix[Integer.parseInt(command[1])][Integer.parseInt(command[2])];
                    matrix[Integer.parseInt(command[1])][Integer.parseInt(command[2])] = matrix[Integer.parseInt(command[3])][Integer.parseInt(command[4])];
                    matrix[Integer.parseInt(command[3])][Integer.parseInt(command[4])] = temp;

                    for (String[] strings : matrix) {
                        for (String string : strings) {
                            System.out.print(string + " ");
                        }
                        System.out.println();
                    }

                }catch (Exception e){
                    System.out.println("Invalid input!");

                }
            }
            comm = scanner.nextLine();
            System.out.println();
        }


    }


}
