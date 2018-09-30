public class Problem_00055 {

    private static boolean in(int x, int y, int i, int j) {
        return i >= 0 && i < x && j >= 0 && j < y;
    }

    private static void dfs(char[][] a, int i, int j, boolean[][] vis) {
        vis[i][j] = true;
        if (in(a.length, a[i].length, i - 1, j) && !vis[i - 1][j] && a[i - 1][j] == '1') {
            dfs(a, i - 1, j, vis);
        }
        if (in(a.length, a[i].length, i + 1, j) && !vis[i + 1][j] && a[i + 1][j] == '1') {
            dfs(a, i + 1, j, vis);
        }
        if (in(a.length, a[i].length, i, j - 1) && !vis[i][j - 1] && a[i][j - 1] == '1') {
            dfs(a, i, j - 1, vis);
        }
        if (in(a.length, a[i].length, i, j + 1) && !vis[i][j + 1] && a[i][j + 1] == '1') {
            dfs(a, i, j + 1, vis);
        }
    }

    private static String solution(String line) {
        String[] array = line.split(" ");
        char[][] a = new char[array.length][];
        int i = 0, j;
        for (String s : array) {
            String[] ss = s.split(",");
            a[i] = new char[ss.length];
            j = 0;
            for (String s1 : ss) {
                a[i][j++] = s1.charAt(0);
            }
            ++i;
        }
        int x = a.length;
        int y = a[0].length;
        boolean[][] vis = new boolean[x][y];
        int res = 0;
        for (i = 0; i < x; ++i) {
            for (j = 0; j < y; ++j) {
                if (a[i][j] == '1' && !vis[i][j]) {
                    ++res;
                    dfs(a, i, j, vis);
                }
            }
        }
        return String.valueOf(res);
    }

    public static void main(String[] args) {
        Input.input(Problem_00055.class);
    }
}
