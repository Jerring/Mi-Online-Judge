public class Problem_00117 {

    private static String solution(String line) {
        String[] array = line.split(" ");
        int num1 = Integer.parseInt(array[0]);
        int num2 = Integer.parseInt(array[1]);
        int[] sg = getSG(Math.max(num1, num2));
        return (sg[num1] ^ sg[num2]) != 0 ? "Xiaoai Win" : "Xiaobing Win";
    }

    private static int[] getSG(int n) {
        // 可能改变的方式
        int[] f = new int[] {1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597,2584,4181,6765,10946};
        // SG(x) 函数
        int[] sg = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            // 状态数组
            boolean[] vis = new boolean[n + 1];
            for (int j = 0; i >= f[j]; ++j) {
                vis[sg[i - f[j]]] = true;
            }
            // 搜索未被标记值的最小值，赋值给 SG(x)
            int j = 0;
            while (vis[j]) {
                ++j;
            }
            sg[i] = j;
        }
        return sg;
    }

    public static void main(String[] args) {
        Input.input(Problem_00117.class);
    }
}
