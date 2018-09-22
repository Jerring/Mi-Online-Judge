import java.util.Arrays;

public class Problem_00014 {

    private static String solution(String line) {
        String[] array = line.split(" ");
        String[] strings = array[0].split(",");
        if (strings.length == 1) {
            return strings[0].equals(array[1]) ? "0" : "-1";
        }
        int[] a = new int[strings.length];
        int i = 0;
        for (String s : strings) {
            a[i++] = Integer.parseInt(s);
        }
        int num = Integer.parseInt(array[1]);
        if (a[0] < a[a.length - 1]) {
            int ret = Arrays.binarySearch(a, num);
            if (ret < 0) {
                ret = -1;
            }
            return String.valueOf(ret);
        }
        for (i = 0; i < a.length; ++i) {
            if (a[i] == num) {
                return String.valueOf(i);
            }
            if (a[i] > a[i + 1]) {
                int ret = Arrays.binarySearch(a, i + 1, a.length, num);
                if (ret < 0) {
                    ret = -1;
                }
                return String.valueOf(ret);
            }
        }
        return "-1";
    }

    public static void main(String[] args) {
        Input.input(Problem_00014.class);
    }
}
