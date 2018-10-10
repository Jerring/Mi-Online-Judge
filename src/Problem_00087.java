public class Problem_00087 {

    private static String solution(String line) {
        if (line.length() <= 4) {
            return "YES";
        }
        int[] count = new int[26];
        for (int i = 0; i < line.length(); ++i) {
            char ch = line.charAt(i);
            ++count[ch - 'a'];
        }
        int a = -1;
        for (int i = 0; i < count.length; ++i) {
            if (count[i] != 0) {
                a = i;
                break;
            }
        }
        int b = -1;
        for (int i = a + 1; i < count.length; ++i) {
            if (count[i] != 0 && count[i] != count[a]) {
                b = i;
                break;
            }
        }
        if (b == -1) {
            return "YES";
        }
        if (Math.abs(count[a] - count[b]) != 1) {
            return "NO";
        }
        boolean flag1 = true;
        for (int i = b + 1; i < count.length; ++i) {
            if (count[i] != 0 && count[i] != count[a]) {
                flag1 = false;
                break;
            }
        }
        if (flag1) {
            return "YES";
        }
        boolean flag2 = true;
        for (int i = b + 1; i < count.length; ++i) {
            if (count[i] != 0 && count[i] != count[b]) {
                flag2 = false;
                break;
            }
        }
        return flag2 ? "YES" : "NO";
    }

    public static void main(String[] args) {
        Input.input(Problem_00087.class);
    }
}
