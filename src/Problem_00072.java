import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Problem_00072 {

    private static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void reverse(int[]a, int i, int j) {
        while (i < j) {
            swap(a, i++, j--);
        }
    }

    /**
     * 序列的全排列过程
     * @param a 待排列序列
     * @return 原序列a是否存在下一次排列
     */
    private static boolean nextPermutation(int[] a) {
        int i;
        // 1、从后往前找到第一组位置，满足a[i] < a[i + 1]
        for (i = a.length - 2; i >= 0 && a[i] >= a[i + 1]; --i) {
        }
        if (i >= 0) {
            int j;
            // 2、从后往前找到第一个位置，满足a[j] > a[i]
            for (j = a.length - 1; j >= 0 && a[j] <= a[i]; --j) {
            }
            // 3、交换i、j两处位置的值
            swap(a, i, j);
            // 4、反转从位置i + 1开始到末尾的序列
            reverse(a, i + 1, a.length - 1);
            return true;
        }
        // 步骤1不满足直接返回false
        return false;
    }

    private static String solution(String line) {
        String[] array = line.split(",");
        int[] a = new int[array.length];
        int i = 0;
        for (String s : array) {
            a[i++] = Integer.parseInt(s);
        }
        Arrays.sort(a);
        List<String> list = new LinkedList<>();
        do {
            StringBuilder sb = new StringBuilder();
            sb.append(a[0]);
            for (i = 1; i < a.length; ++i) {
                sb.append(',').append(a[i]);
            }
            list.add(sb.toString());
        } while (nextPermutation(a));
        //return String.join(";", list);  // @since 1.8
        // 评测机为 OpenJDK 1.7.0
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for (String s : list) {
            if (first) {
                sb.append(s);
                first = false;
            } else {
                sb.append(';').append(s);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Input.input(Problem_00072.class);
    }
}
