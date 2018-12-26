public class Problem_00119 {

    private static String solution(String line) {
        String[] array = line.split(" ");
        if (array.length <= 1) {
            return "true";
        }
        int[] a = new int[array.length];
        int i = 0;
        for (String s : array) {
            a[i++] = Integer.parseInt(s);
        }
        i = 0;
        while (a[i] > 0) {
            int max = -1;
            for (int j = 1; j <= a[i]; ++j) {
                max = Math.max(max, i + j + a[i + j]);
            }
            if (max >= a.length - 1) {
                return "true";
            }
            i = max;
        }
        return "false";
    }

    public static void main(String[] args) {
        Input.input(Problem_00119.class);
    }
}
