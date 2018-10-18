import java.util.*;

public class Problem_00013 {

    private static class Data implements Comparable<Data> {

        int num;
        int count;

        public Data(int num, int count) {
            this.num = num;
            this.count = count;
        }

        @Override
        public int compareTo(Data o) {
            if (count != o.count) {
                return count - o.count;
            }
            return o.num - num;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "num=" + num +
                    ", count=" + count +
                    '}';
        }
    }

    private static String solution(String line) {
        String[] array = line.split(" ");
        String[] s1 = array[0].split(",");
        int k = Integer.parseInt(array[1]);
        int[] a = new int[array[0].length()];
        Map<Integer, Integer> map = new HashMap<>();
        for (String s : s1) {
            int num = Integer.parseInt(s);
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        Data[] data = new Data[map.size()];
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            data[i++] = new Data(entry.getKey(), entry.getValue());
        }
        Queue<Data> queue = new PriorityQueue<>();
        for (Data d : data) {
            queue.offer(d);
            if (queue.size() > k) {
                queue.poll();
            }
        }
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        LinkedList<Integer> stack = new LinkedList<>();
        while (!queue.isEmpty()) {
            stack.push(queue.poll().num);
        }
        while (!stack.isEmpty()) {
            int num = stack.pop();
            if (first) {
                sb.append(num);
                first = false;
            } else {
                sb.append(',').append(num);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Input.input(Problem_00013.class);
    }
}
