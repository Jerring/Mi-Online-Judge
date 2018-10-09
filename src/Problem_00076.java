public class Problem_00076 {

    // 尺取法
    private static int ruler(int[] a, int s) {
        // 初始化左右指针
        int l = 0, r = 0;
        int sum = 0;
        int res = Integer.MAX_VALUE;
        while (true) {
            // 不断移动右指针，直到满足条件
            while (r < a.length && sum < s) {
                sum += a[r++];
            }
            // 条件无法满足，终止
            if (sum < s) {
                break;
            }
            // 更新结果，相应区间为[l, r)
            res = Math.min(res, r - l);
            // 移动左指针
            sum -= a[l++];
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }

    private static String solution(String line) {
        String[] array = line.split(";");
        int s = Integer.parseInt(array[0]);
        String[] array2 = array[1].split(",");
        int[] a = new int[array2.length];
        int i = 0;
        for (String str : array2) {
            a[i++] = Integer.parseInt(str);
        }
        int res = ruler(a, s);
        return String.valueOf(res);
    }

    public static void main(String[] args) {
        Input.input(Problem_00076.class);
    }
}
