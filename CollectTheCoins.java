import java.util.Scanner;

public class CollectTheCoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Character[][] jagged = new Character[4][];

        for (int i = 0; i < jagged.length; i++) {
            String input = scanner.nextLine();
            jagged[i] = new Character[input.length()];

            for (int j = 0; j < jagged[i].length; j++) {
                jagged[i][j] = input.charAt(j);
            }
        }


        String command = scanner.nextLine();


        int coins = 0;
        int wallsHit = 0;
        int x = 0;
        int y = 0;
        for (int i = 0; i < command.length(); i++) {

            try {
                switch (command.charAt(i)) {
                    case 'V':
                        x++;
                        if(jagged[x][y].equals('$')){
                        coins++;
                    }
                    break;

                    case '^':
                        x--;
                        if(jagged[x][y].equals('$')){
                            coins++;
                        }
                        break;

                    case '>':
                        y++;
                        if(jagged[x][y].equals('$')){
                            coins++;
                        }
                        break;

                    case '<':
                        y--;
                        if(jagged[x][y].equals('$')){
                            coins++;
                        }
                        break;

                }

            } catch (Exception e) {
                switch (command.charAt(i)) {
                    case 'V':
                        x--;

                        break;

                    case '^':
                        x++;

                        break;

                    case '>':
                        y--;

                        break;

                    case '<':
                        y++;

                        break;

                }
                wallsHit++;
            }

        }


        System.out.println("Coins collected: " + coins);
        System.out.println("Walls hit: " + wallsHit);

    }
}
