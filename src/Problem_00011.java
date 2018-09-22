public class Problem_00011 {

    private static String solution(String line) {
        String[] array = line.split(" ");
        int[] count = new int[26];
        for (int i = 0; i < array[1].length(); ++i) {
            ++count[array[1].charAt(i) - 'a'];
        }
        for (int i = 0; i < array[0].length(); ++i) {
            if (--count[array[0].charAt(i) - 'a'] < 0) {
                return "false";
            }
        }
        return "true";
    }

    public static void main(String[] args) {
        Input.input(Problem_00011.class);
    }
}
