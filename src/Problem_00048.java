public class Problem_00048 {

    private static String solution(String line) {
        String[] array = line.split(",");
        int[] a = new int[array.length];
        int i = 0;
        for (String s : array) {
            a[i++] = Integer.parseInt(s);
        }
        int res = 0;
        for (i = 0; i < a.length; ++i) {
            for (int j = i + 1; j < a.length; ++j) {
                if (a[i] + a[j] == 10 || Math.abs(a[i] - a[j]) == 10) {
                    ++res;
                }
            }
        }
        return String.valueOf(res);
    }

    public static void main(String[] args) {
        Input.input(Problem_00048.class);
    }
}
