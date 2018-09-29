public class Problem_00110 {

    private static String solution(String line) {
        String[] array = line.split(" ");
        String N = array[0];
        int P = Integer.parseInt(array[1]);
        int Q = Integer.parseInt(array[2]);
        if (P == Q) {
            return N;
        }
        int t = 1;
        int num = 0;
        for (int i = N.length() - 1; i >= 0; --i) {
            char ch = N.charAt(i);
            if (ch <= '9') {
                num += (ch - '0') * t;
            } else {
                num += (ch - 'a' + 10) * t;
            }
            t *= P;
        }
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            int m = num % Q;
            if (m <= 9) {
                sb.append(m);
            } else {
                sb.append((char)('a' + m - 10));
            }
            num /= Q;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Input.input(Problem_00110.class);
    }
}
