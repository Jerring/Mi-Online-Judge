public class Problem_00085 {

    private static String solution(String line) {
        String[] array = line.split(",");
        int n = array.length;
        int[] a = new int[n + 1];
        int i = 1;
        for (String s : array) {
            a[i++] = Integer.parseInt(s);
        }
        int[] dp = new int[n + 1];
        dp[1] = a[1];
        for (i = 2; i < a.length; ++i) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + a[i]);
        }
        return String.valueOf(dp[n]);
    }

    public static void main(String[] args) {
        Input.input(Problem_00085.class);
    }
}
