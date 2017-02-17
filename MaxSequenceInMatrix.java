import java.util.*;

public class MaxSequenceInMatrix {

    private static int seqCount = 0;
    private static String seqSymbol = null;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        scanner.nextLine();

        String[][] matrix = new String[rows][cols];
        for (int i = 0; i < rows; i++) {
            matrix[i] = scanner.nextLine().split(" ");
        }

        List<String> seq = new ArrayList<>();

        //row

        for (int i = 0; i < rows; i++) {
            seq.addAll(Arrays.asList(matrix[i]));
            checkforSequence(seq);
        }

        //col

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                seq.add(matrix[j][i]);
            }
            checkforSequence(seq);
        }

        //diag

        int diagsize = Math.min(rows, cols);

        for (int i = 0; i < diagsize; i++) {
            seq.add(matrix[i][i]);
        }

        checkforSequence(seq);


        for (int i = 0; i < seqCount; i++) {
            System.out.print(seqSymbol + ", ");
        }


    }

    private static void checkforSequence(List<String> seq) {
        for (int startpos = 0; startpos < seq.size() - 1; startpos++) {
            int counter = 1;
            String symbol = seq.get(startpos);
            int currPos = startpos + 1;

            while (symbol.equals(seq.get(currPos))) {
                counter++;
                if (counter >= seqCount) {
                    seqCount = counter;
                    seqSymbol = symbol;
                }
                currPos++;
                if (currPos >= seq.size()) {
                    break;
                }

            }
        }
        seq.clear();

    }
}


