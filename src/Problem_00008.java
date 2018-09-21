public class Problem_00008 {

    private static String solution(String line) {
        String[] array = line.split(",");
        int[] a = new int[array.length];
        for (int i = 0; i < a.length; ++i) {
            a[i] = Integer.parseInt(array[i]);
        }
        int res = 0;
        for (int i = 1; i < a.length; ++i) {
            for (int j = 0; j < i; ++j) {
                if (a[j] > a[i]) {
                    ++res;
                }
            }
        }
        return String.valueOf(res);
    }

    public static void main(String[] args) {
        Input.input(Problem_00008.class);
    }
}
