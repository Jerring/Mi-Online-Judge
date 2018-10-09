public class Problem_00078 {

    private static String solution(String line) {
        char[] a = line.toCharArray();
        for (int i = 1; i < a.length; ++i) {
            if (a[i] == '?') {
                if (a[i - 1] == 'a') {
                    a[i] = 'b';
                } else if (a[i - 1] == 'b') {
                    a[i] = 'a';
                }
            }
        }
        for (int i = a.length - 2; i >= 0; --i) {
            if (a[i] == '?') {
                if (a[i + 1] == 'a') {
                    a[i] = 'b';
                } else if (a[i + 1] == 'b') {
                    a[i] = 'a';
                }
            }
        }
        if (a[0] == '?') {
            return "0";
        }
        int res = 0;
        for (int i = 1; i < a.length; ++i) {
            if (a[i] == a[i - 1]) {
                ++res;
            }
        }
        return String.valueOf(res);
    }

    public static void main(String[] args) {
        Input.input(Problem_00078.class);
    }
}
