public class Problem_00086 {

    // x是2的幂满足 (x & (x - 1)) == 0
    private static String solution(String line) {
        long m = Long.parseLong(line);
        if (m == 0 || m == 1) {
            return "Bad";
        }
        if (m == 2) {
            return "Good";
        }
        boolean rule1 = ((m - 1) & (m - 2)) == 0;
        boolean rule2 = ((m + 1) & m) == 0;
        if (rule1) {
            if (rule2) {
                return "Very Good";
            } else {
                return "Good";
            }
        } else {
            if (rule2) {
                return "Bad";
            } else {
                return "Normal";
            }
        }
    }

    public static void main(String[] args) {
        Input.input(Problem_00086.class);
    }
}
