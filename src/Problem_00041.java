public class Problem_00041 {

    private static String solution(String line) {
        int countA = 0;
        int countB = 0;
        int countC = 0;
        for (int i = 0; i < line.length(); ++i) {
            char ch = line.charAt(i);
            if (ch == 'a') {
                ++countA;
            } else if (ch == 'b') {
                ++countB;
            } else {
                ++countC;
            }
        }
        StringBuilder sb = new StringBuilder();
        while (countA-- != 0) {
            sb.append('a');
        }
        while (countB-- != 0) {
            sb.append('b');
        }
        while (countC-- != 0) {
            sb.append('c');
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Input.input(Problem_00041.class);
    }
}
