public class Problem_00089 {

    private static String solution(String line) {
        int n = Integer.parseInt(line);
        int res = 0;
        while (n != 0) {
            n /= 5;
            res += n;
        }
        return String.valueOf(res);
    }

    public static void main(String[] args) {
        Input.input(Problem_00089.class);
    }
}
