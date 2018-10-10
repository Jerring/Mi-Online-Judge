public class Problem_00012 {

    private static int getAnswer(int[] a, int n) {
        int sum = 0;
        for (int num : a) {
            if (n == num) {
                ++sum;
                break;
            }
            if (n > num) {
                sum += getAnswer(a, n - num);
            } else {
                break;
            }
        }
        return sum;
    }

    private static String solution(String line) {
        String[] array = line.split(" ");
        String[] array1 = array[0].split(",");
        int n = Integer.parseInt(array[1]);
        int[] a = new int[array1.length];
        int i = 0;
        for (String s : array1) {
            a[i++] = Integer.parseInt(s);
        }
        int res = getAnswer(a, n);
        return String.valueOf(res);
    }

    public static void main(String[] args) {
        Input.input(Problem_00012.class);
    }
}
