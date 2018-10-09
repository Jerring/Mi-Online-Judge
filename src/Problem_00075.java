public class Problem_00075 {

    private static String solution(String line) {
        String[] array = line.split(",");
        int[] a = new int[array.length];
        int i = 0;
        for (String s : array) {
            a[i++] = Integer.parseInt(s);
        }
        int[] cnt = new int[a.length];
        cnt[0] = 1;
        for (i = 1; i < cnt.length; ++i) {
            if (a[i] > a[i - 1]) {
                cnt[i] = cnt[i - 1] + 1;
            } else {
                cnt[i] = 1;
            }
        }
        for (i = cnt.length - 2; i >= 0; --i) {
            if (a[i] > a[i + 1] && cnt[i] <= cnt[i + 1]) {
                cnt[i] = cnt[i + 1] + 1;
            }
        }
        int res = 0;
        for (int num : cnt) {
            res += num;
        }
        return String.valueOf(res);
    }

    public static void main(String[] args) {
        Input.input(Problem_00075.class);
    }
}
