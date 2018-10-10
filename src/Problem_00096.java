public class Problem_00096 {

    private static String solution(String line) {
        int n = Integer.parseInt(line);
        long[] ugly = new long[n];
        ugly[0] = 1;
        int index2 = 0;
        int index3 = 0;
        int index5 = 0;
        for (int i = 1; i < n; ++i) {
            long t2 = ugly[index2] * 2;
            long t3 = ugly[index3] * 3;
            long t5 = ugly[index5] * 5;
            long val = Math.min(t2, Math.min(t3, t5));
            if (val == t2) {
                ++index2;
            }
            if (val == t3) {
                ++index3;
            }
            if (val == t5) {
                ++index5;
            }
            ugly[i] = val;
        }
        return String.valueOf(ugly[n - 1]);
    }

    public static void main(String[] args) {
        Input.input(Problem_00096.class);
    }
}
