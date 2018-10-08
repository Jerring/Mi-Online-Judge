public class Problem_00061 {

    private static String solution(String line) {
        String[] array = line.split(";");
        char[][] a = new char[array.length][array[0].length()];
        int i = 0;
        for (String s : array) {
            String[] ss = s.split(",");
            int j = 0;
            for (String sss : ss) {
                a[i][j++] = sss.charAt(0);
            }
            ++i;
        }
        for (i = 0; i < a.length; ++i) {
            for (int j = i + 1; j < a.length; ++j) {
                boolean flag = true;
                for (int k = 0; k < a[i].length; ++k) {
                    if (a[i][k] != a[j][k]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    return (i + 1) + "," + (j + 1);
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Input.input(Problem_00061.class);
    }
}
