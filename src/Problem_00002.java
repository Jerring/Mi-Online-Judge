public class Problem_00002 {

    private static String solution(String line) {
        String[] array = line.split(" ");
        int res = 0;
        for (String s : array) {
            res ^= Integer.parseInt(s);
        }
        return String.valueOf(res);
    }
}
