public class Problem_00030 {

    private static String solution(String line) {
        long a = Long.parseLong(line);
        long res = 0;
        for (int i = 0; i < 32; ++i) {
            res = (res << 1) + (a & 1);
            a >>= 1;
        }
        return String.valueOf(res);
    }

    public static void main(String[] args) {
        Input.input(Problem_00030.class);
    }
}
