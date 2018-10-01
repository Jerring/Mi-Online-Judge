public class Problem_00064 {

    private static String solution(String line) {
        String[] array = line.split(" ");
        int[] a = new int[array.length];
        int i = 0;
        for (String s : array) {
            a[i++] = Integer.parseInt(s);
        }
        int n = a.length - 1;
        if (a[0] >= n) {
            return "1";
        }
        int res = 0;
        int b = 0;
        while (true) {
            ++res;
            int max = 0;
            int t = 0;
            for (i = 1; i <= a[b]; ++i) {
                int pos = b + i;
                int tmp = pos + a[pos];
                if (tmp >= n) {
                    return String.valueOf(res + 1);
                }
                if (tmp > max) {
                    max = tmp;
                    t = pos;
                }
            }
            b = t;
        }
    }

    public static void main(String[] args) {
        Input.input(Problem_00064.class);
    }
}
