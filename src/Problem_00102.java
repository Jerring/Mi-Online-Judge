public class Problem_00102 {

    private static String solution(String line) {
        StringBuilder sb = new StringBuilder();
        int mCount = 0; // 模拟栈中m的个数
        for (int i = 0; i < line.length(); ++i) {
            char ch = line.charAt(i);
            if (ch == 'm') {
                ++mCount;
            } else if (ch == 'i') {
                if (mCount > 0) {
                    --mCount;
                } else {
                    sb.append('i');
                }
            } else {
                while (mCount-- != 0) {
                    sb.append('m');
                }
                mCount = 0;
                sb.append(ch);
            }
        }
        while (mCount-- != 0) {
            sb.append('m');
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Input.input(Problem_00102.class);
    }
}
