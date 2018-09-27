import java.util.Arrays;

public class Problem_00113 {

    private static String solution(String line) {
        String[] array = line.split(" ");
        int[] a = new int[array.length];
        int i = 0;
        for (String s : array) {
            a[i++] = Integer.parseInt(s);
        }
        Arrays.sort(a);
        int res = 0;
        boolean flag = false;
        for (i = 0; i < a.length; ) {
            if (a[i] > 0) {
                int num = (a[i] + 1) / 2;
                res += num;
                a[i] = 0;
                for (int j = i + 1; j < a.length; ++j) {
                    a[j] -= 2 * num;
                }
            }
            while (i < a.length && a[i] <= 0) {
                ++i;
            }
            for (int j = i; j < a.length; ++j) {
                a[j] -= 2;
            }
        }
        return String.valueOf(res);
    }

    public static void main(String[] args) {
        Input.input(Problem_00113.class);
    }
}
