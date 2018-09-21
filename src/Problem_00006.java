public class Problem_00006 {

    private static String solution(String line) {
        String[] array = line.split(",");
        String s1 = array[0];
        String s2 = array[1];
        String s3 = array[2];
        if (s1.length() + s2.length() != s3.length()) {
            return "false";
        }
        int i = 0, j = 0, k = 0;
        while (i < s1.length() && j < s2.length() && k < s3.length()) {
            char ch = s3.charAt(k);
            if (s2.charAt(j) == ch) {
                ++j;
                ++k;
            } else if (s1.charAt(i) == ch) {
                ++i;
                ++k;
            } else {
                return "false";
            }
        }
        while (i < s1.length()) {
            char ch = s3.charAt(k);
            if (s1.charAt(i) == ch) {
                ++i;
                ++k;
            } else {
                return "false";
            }
        }
        while (j < s2.length()) {
            char ch = s3.charAt(k);
            if (s2.charAt(j) == ch) {
                ++j;
                ++k;
            } else {
                return "false";
            }
        }
        return "true";
    }

    public static void main(String[] args) {
        Input.input(Problem_00006.class);
    }
}
