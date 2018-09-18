public class Problem_00003 {

    private static String solution(String line) {
        String[] array = line.split("-");
        char[] a = array[0].toCharArray();
        char[] b = array[1].toCharArray();
        int i = 0, ai, bi;
        // 模拟竖式计算
        for (; i < b.length; ++i) {
            ai = a.length - 1 - i;
            bi = b.length - 1 - i;
            if (a[ai] < b[bi]) {
                a[ai] += 10;
                a[ai - 1] -= 1;
            }
            a[ai] = (char)(a[ai] - b[bi] + '0');
        }
        for (; i < a.length; ++i) {
            ai = a.length - 1 - i;
            if (a[ai] < '0') {
                a[ai] += 10;
                a[ai - 1] -= 1;
            }
        }
        // 去掉前导0
        int begin = 0;
        while (begin < a.length && a[begin] == '0') {
            ++begin;
        }
        return begin == a.length ? "0" : new String(a, begin, a.length - begin);
    }

    public static void main(String[] args) {
        String s1 = "1231231237812739878951331231231237812739878951331231231237812739878951331231231237812739878951331231231237812739878951331231231237812739870-89513312312312378127398789513312312312378127398789513312312312378127398789513";
        String s2 = "1231231237812739878951331231231237812739878951331231231237812739878951331230000000000000000000000001-331231231237812739878951331231231";
        String s3 = "11111-11111";
        System.out.println(solution(s1));
        System.out.println(solution(s2));
        System.out.println(solution(s3));
    }
}
