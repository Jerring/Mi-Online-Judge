public class Problem_00125 {

    /**
     * 当 n 为奇数，l 为奇数时：这种情况我们只需要将所有的亮的灯或者灭的灯全部按一遍即可
     * 当 n 为奇数，l 为偶数时：这种情况我们能把所有灯熄灭，所以不能全部变亮
     * 当 n 为偶数，l 为奇数时：这种情况我们所有的亮的灯全部按一遍即可
     * 当 n 为偶数，l 为偶数时：这种情况我们所有的灭的灯全部按一遍即可
     * @param line
     * @return
     */
    private static String solution(String line) {
        String[] array = line.split(" ");
        long n = Long.parseLong(array[0]);
        long l = Long.parseLong(array[1]);
        if ((n & 1) == 1) {
            if ((l & 1) == 1) {
                return String.valueOf(Math.min(n - l, l));
            } else {
                return "Impossible";
            }
        } else {
            if ((l & 1) == 1) {
                return String.valueOf(l);
            } else {
                return String.valueOf(n - l);
            }
        }
    }

    public static void main(String[] args) {
        Input.input(Problem_00125.class);
    }
}
