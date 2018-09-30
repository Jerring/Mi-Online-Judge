public class Problem_00057 {

    private static String solution(String line) {
        String[] array = line.split(" ");
        String s = array[0];
        String t = array[1];
        if (s.equals(t)) {
            return "1";
        }
        if (s.length() >= t.length()) {
            return "0";
        }
        while (t.length() > s.length()) {
            int len = t.length();
            if (t.charAt(len - 1) == 'A') {
                t = t.substring(0, len - 1);
            } else {
                StringBuilder sb = new StringBuilder();
                for (int i = len - 2; i >= 0; --i) {
                    sb.append(t.charAt(i));
                }
                t = sb.toString();
            }
            if (s.equals(t)) {
                return "1";
            }
        }
        return "0";
    }

    public static void main(String[] args) {
        Input.input(Problem_00057.class);
    }
}
