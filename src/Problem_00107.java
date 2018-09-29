public class Problem_00107 {

    private static long quickpow(long x, int y, int MOD) {
        long ret = 1;
        while (y != 0) {
            if ((y & 1) != 0) {
                ret = ret * x % MOD;
            }
            x = x * x % MOD;
            y >>= 1;
        }
        return ret;
    }

    private static String solution(String line) {
        int n = Integer.parseInt(line);
        int MOD = 1000000007;
        long a = quickpow(3, n + 1, MOD) - 1;
        if (a < 0) {
            a += MOD;
        }
        long b = quickpow(2, MOD - 2, MOD);
        return String.valueOf(a * b % MOD);
    }

    public static void main(String[] args) {
        Input.input(Problem_00107.class);
    }
}
