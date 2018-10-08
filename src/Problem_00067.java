import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Problem_00067 {

    private static String solution(String line) {
        int n = Integer.parseInt(line);
        List<Integer> list = new LinkedList<>();
        for (int i = 1; i <= 500; ++i) {
            list.add(i);
        }
        int cnt = 0;
        while (!list.isEmpty()) {
            for (Iterator<Integer> it = list.iterator(); it.hasNext(); ) {
                int num = it.next();
                if (++cnt == 3) {
                    cnt = 0;
                    it.remove();
                    if (--n == 0) {
                        return String.valueOf(num);
                    }
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Input.input(Problem_00067.class);
    }
}
