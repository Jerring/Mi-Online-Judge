import java.util.Arrays;

public class Problem_00015 {

    private static int tuple(int[] a) {
        // 排序
        Arrays.sort(a);
        int ret = 0;
        for (int i = 0; i < a.length; ++i) {
            if (a[i] > 0) {
                break;
            }
            if (i > 0 && a[i] == a[i - 1]) {
                continue;
            }
            int l = i + 1, r = a.length - 1;
            while (l < r) {
                int sum = a[i] + a[l] + a[r];
                if (sum > 0) {          // 因为数组有序，说明右侧的数字过大，所以下标左移
                    --r;
                } else if (sum < 0) {   // 因为数组有序，说明左侧的数字过小，所以下标右移
                    ++l;
                } else {
                    ++ret;
                    ++l;
                    --r;
                    // 将两侧的下标向中间移动，直到不与之前取出的数字相同，避免出现重复的三元组
                    while (l < r && a[l] == a[l - 1]) {
                        ++l;
                    }
                    while (l < r && a[r] == a[r + 1]) {
                        --r;
                    }
                }
            }
        }
        return ret;
    }

    private static String solution(String line) {
        String[] array = line.split(",");
        int[] a = new int[array.length];
        int i = 0;
        for (String s : array) {
            a[i++] = Integer.parseInt(s);
        }
        return String.valueOf(tuple(a));
    }

    public static void main(String[] args) {
        Input.input(Problem_00015.class);
    }
}
