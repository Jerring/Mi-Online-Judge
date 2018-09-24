public class Problem_00027 {

    private static String solution(String line) {
        String[] array = line.split(";");
        int bag = Integer.parseInt(array[0]);
        String[] s1 = array[1].split(",");
        String[] s2 = array[2].split(",");
        int[] w = new int[s1.length + 1];
        int[] v = new int[s2.length + 1];
        int i = 1;
        for (String s : s1) {
            w[i++] = Integer.parseInt(s);
        }
        i = 1;
        for (String s : s2) {
            v[i++] = Integer.parseInt(s);
        }
        // 01背包
        int[][] dp = new int[s1.length + 1][];
        for (i = 0; i <= s1.length; ++i) {
            dp[i] = new int[bag + 1];
        }
        for (i = 1; i <= s1.length; ++i) {
            for (int j = 0; j <= bag; ++j) {
                if (j < w[i]) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - w[i]] + v[i]);
                }
            }
        }
        return String.valueOf(dp[s1.length][bag]);
    }

    public static void main(String[] args) {
        Input.input(Problem_00027.class);
    }
}
