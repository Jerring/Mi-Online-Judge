public class Problem_00039 {

    private static String solution(String line) {
        String[] array = line.split(";");
        int m = array.length;
        int n = array[0].split(",").length;
        int[][] a = new int[m][n];
        for (int i = 0; i < m; ++i) {
            String[] s = array[i].split(",");
            for (int j = 0; j < n; ++j) {
                a[i][j] = Integer.parseInt(s[j]);
            }
        }
        int res = 0;
        for (int i = 0; i < m - 1; ++i) {
            for (int j = 0; j < n - 1; ++j) {
                res = Math.max(res, a[i][j] + a[i + 1][j + 1]);
            }
        }
        return String.valueOf(res);
    }

    public static void main(String[] args) {
        Input.input(Problem_00039.class);
    }
}
