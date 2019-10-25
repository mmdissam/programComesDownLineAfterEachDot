import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\HP\\Desktop\\readText.txt");
        Scanner scanner = new Scanner(file);
        StringBuilder s = new StringBuilder();
        while (scanner.hasNextLine())
            s.append(String.format("%s ", scanner.next()));
        char[] charOfArr = s.toString().toCharArray();
        printEachLineIndividually(charOfArr);
    }
    private static void printEachLineIndividually(char[] charOfArr) {
        for (int i = 0; i < charOfArr.length; i++) {
            if (charOfArr[i] == '.' && charOfArr[i +1] == ' ') {
                System.out.println('.');
                i++;
            }
            else
                System.out.print(charOfArr[i]);
        }
    }
}
