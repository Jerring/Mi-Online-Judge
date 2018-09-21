public class Problem_00007 {

    private static String solution(String line) {
        String[] array = line.split(",");
        int[] a = new int[array.length];
        int max = 0;
        for (int i = 0; i < a.length; ++i) {
            a[i] = Integer.parseInt(array[i]);
            max = Math.max(max, a[i]);
        }
        if (max == 0) {
            return "1";
        }
        boolean[] flag = new boolean[max + 1];
        for (int num : a) {
            if (num > 0) {
                flag[num] = true;
            }
        }
        for (int i = 1; i < flag.length; ++i) {
            if (!flag[i]) {
                return String.valueOf(i);
            }
        }
        return String.valueOf(max + 1);
    }

    public static void main(String[] args) {
        Input.input(Problem_00007.class);
    }
}
