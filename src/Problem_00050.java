public class Problem_00050 {

    private static String solution(String line) {
        String[] array = line.split(",");
        int[] a = new int[array.length];
        int i = 0;
        for (String s : array) {
            a[i++] = Integer.parseInt(s);
        }
        int res = 0;
        for (i = 0; i < a.length; ++i) {
            int h = a[i];
            for (int j = i; j < a.length; ++j) {
                h = Math.min(h, a[j]);
                res = Math.max(res, h * (j - i + 1));
            }
        }
        return String.valueOf(res);
    }

    public static void main(String[] args) {
        Input.input(Problem_00050.class);
    }
}
