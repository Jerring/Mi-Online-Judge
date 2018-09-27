import java.util.Arrays;

public class Problem_00098 {

    private static String solution(String line) {
        String[] array = line.split(" ");
        int[] a = new int[array.length];
        int i = 0;
        for (String s : array) {
            a[i++] = Integer.parseInt(s);
        }
        Arrays.sort(a);
        int res = 0;
        for (i = 0; i < a.length; ++i) {
            res = Math.max(res, a[i] * (a.length - i));
        }
        return String.valueOf(res);
    }

    public static void main(String[] args) {
        Input.input(Problem_00098.class);
    }
}
