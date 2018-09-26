public class Problem_00043 {

    private static String solution(String line) {
        int n = Integer.parseInt(line);
        boolean[] vis = new boolean[649];   // 9 * 9 * 8 + 1
        while (n != 1) {
            int sum = 0;
            while (n != 0) {
                int t = n % 10;
                sum += t * t;
                n /= 10;
            }
            if (vis[sum]) {
                return "false";
            }
            n = sum;
            vis[n] = true;
        }
        return "true";
    }

    public static void main(String[] args) {
        Input.input(Problem_00043.class);
    }
}
