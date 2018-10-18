public class Problem_00022 {

    private static double MIN = 1e-6;
    private static char[] res = "2123456789876543".toCharArray();

    private static long get(long n) {
        long l = 1, h = 10000000000L;
        while (true) {
            long m = (l + h) >> 1;
            double sum = m * 1.0 * (m + 1) / 2;
            if (Math.abs(sum - n) < MIN) {
                return m;
            }
            if (sum < n) {
                l = m + 1;
            } else {
                double preSum = (m - 1) * 1.0 * m / 2;
                if (preSum < n) {
                    return m;
                }
                h = m - 1;
            }
        }
    }

    private static String solution(String line) {
        long n = Long.parseLong(line);
        long l = get(n);
        n -= l * (l - 1) / 2;
        n %= 16;
        return String.valueOf(res[(int) n]);
    }

    public static void main(String[] args) {
        Input.input(Problem_00022.class);
    }
}
