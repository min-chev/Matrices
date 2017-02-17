import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class TerroristsWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder inputText = new StringBuilder(scanner.nextLine());

        int currentPos = 0;
        while (true) {
            int firstpipeIndex = inputText.indexOf("|");

            if (firstpipeIndex != -1) {
                int secondpipeIndex = inputText.indexOf("|", firstpipeIndex + 1);

                String bombcontent = inputText.substring(firstpipeIndex+1, secondpipeIndex);
                int bombpower = getBombPower(bombcontent);

                int startindex = Math.max(0, firstpipeIndex - bombpower);
                int endindex = Math.min(inputText.length() - 1, secondpipeIndex + bombpower);

                while (startindex<=endindex){
                    inputText.setCharAt(startindex, '.');
                    startindex++;
                }

            } else {
                break;
            }
        }
        System.out.println(inputText);
    }

    private static int getBombPower(String bombcontent) {

        int ascisum = 0;
        for (Character o : bombcontent.toCharArray()) {
            ascisum += (int) o;
        }
        return ascisum % 10;
    }
}
