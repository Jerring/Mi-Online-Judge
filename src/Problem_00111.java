public class Problem_00111 {

    private static int[][] maxn = new int[100010][20];

    private static void init(int[] a, int n) {
        for (int i = 1; i <= n; ++i) {
            maxn[i][0] = a[i];
        }
        for (int j = 1; (1 << j) <= n; ++j) {
            for (int i = 1; i + (1 << j) - 1 <= n; ++i) {
                maxn[i][j] = Math.max(maxn[i][j - 1], maxn[i + (1 << (j - 1))][j - 1]);
            }
        }
    }

    private static int rmq(int l, int r) {
        int k = (int) (Math.log(r - l + 1) / Math.log(2));
        return Math.max(maxn[l][k], maxn[r - (1 << k) +1][k]);
    }

    private static String solution(String line) {
        String[] array = line.split(";");
        String[] array1 = array[0].split(" ");
        String[] array2 = array[1].split(" ");
        String[] array3 = array[2].split(" ");
        int n = Integer.parseInt(array1[0]);
        int m = Integer.parseInt(array1[1]);
        int r = Integer.parseInt(array1[2]);
        int[] a = new int[n + 1];
        int i = 1;
        for (String s : array2) {
            a[i++] = Integer.parseInt(s);
        }
        init(a, n);
        boolean first = true;
        StringBuilder sb = new StringBuilder();
        for (String s : array3) {
            int q = Integer.parseInt(s);
            int res = rmq(Math.max(1, q - r), Math.min(n, q + r));
            if (first) {
                sb.append(res);
                first = false;
            } else {
                sb.append(" ").append(res);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Input.input(Problem_00111.class);
    }
}
