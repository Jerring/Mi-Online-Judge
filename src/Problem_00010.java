public class Problem_00010 {

    private static String solution(String line) {
        int n = Integer.parseInt(line);
        if (n <= 2) {
            return String.valueOf(n);
        }
        long a = 1;
        long b = 2;
        long c = 0;
        for (int i = 3; i <= n; ++i) {
            c = a + b;
            a = b;
            b = c;
        }
        return String.valueOf(c);
    }

    public static void main(String[] args) {
        Input.input(Problem_00010.class);
    }
}
