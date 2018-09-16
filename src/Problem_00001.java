public class Problem_00001 {

    private static String solution(String line) {
        String[] array = line.split(" ");
        int sum = 0;
        for (String s : array) {
            sum += Integer.parseInt(s);
        }
        return String.valueOf(sum);
    }
}
