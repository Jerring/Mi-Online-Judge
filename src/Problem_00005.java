import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem_00005 {

    private static String solution(String line) {
        String[] array = line.split(",");
        int[] a = new int[array.length];
        int i = 0;
        for (String s : array) {
            a[i++] = Integer.parseInt(s);
        }
        int halflen = a.length / 2;
        int llen = 1;
        for (i = 1; i < a.length; ++i) {
            if (a[i] > a[i - 1]) {
                ++llen;
            } else {
                int rlen = a.length - llen;
                if (llen > rlen) {
                    return String.valueOf(a[halflen - rlen]);
                } else {
                    return String.valueOf(a[halflen + llen]);
                }
            }
        }
        return String.valueOf(a[halflen]);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new FileInputStream("input.txt"))) {
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                System.out.println(solution(line));
            }
        } catch (FileNotFoundException e) {
            System.out.println("The file 'input.txt' does not exist!");
        }
    }
}
