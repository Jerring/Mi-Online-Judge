public class Problem_00009 {

    private static String solution(String line) {
        String[] array = line.split(" ");
        char[] a = array[0].toCharArray();
        int k = Integer.parseInt(array[1]);
        int t = k;
        boolean[] delete = new boolean[a.length];
        int i;
        while (t-- != 0) {
            int cur = -1;
            for (i = 0; i < a.length - 1; ++i) {
                if (!delete[i]) {
                    cur = i;
                    break;
                }
            }
            for (i = cur + 1; i < a.length; ++i) {
                if (!delete[i]) {
                    if (a[cur] > a[i]) {
                        delete[cur] = true;
                        break;
                    } else {
                        cur = i;
                    }
                }
            }
            if (i == a.length) {
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        int len = a.length - k;
        for (i = 0; i < a.length; ++i) {
            if (!delete[i]) {
                sb.append(a[i]);
                if (--len == 0) {
                    break;
                }
            }
        }
        // Integer.parseInt()去掉前导0
        return String.valueOf(Integer.parseInt(sb.toString()));
    }

    public static void main(String[] args) {
        Input.input(Problem_00009.class);
    }
}
