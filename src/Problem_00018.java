import java.util.*;

public class Problem_00018 {

    private static class Student implements Comparable<Student> {

        int h;
        int k;

        public Student(int h, int k) {
            this.h = h;
            this.k = k;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "h=" + h +
                    ", k=" + k +
                    '}';
        }

        @Override
        public int compareTo(Student o) {
            if (k != o.k) {
                return k - o.k;
            }
            return h - o.h;
        }
    }

    private static String solution(String line) {
        String[] array = line.split(" ");
        int n = Integer.parseInt(array[0]);
        List<Student> list = new LinkedList<>();
        for (int i = 1; i < array.length; ) {
            int h = Integer.parseInt(array[i++]);
            int k = Integer.parseInt(array[i++]);
            list.add(new Student(h, k));
        }
        Collections.sort(list);
        Iterator<Student> iterator = list.iterator();
        Student[] res = new Student[n];
        int size = 0;
        while (iterator.hasNext()) {
            for (iterator = list.iterator(); iterator.hasNext(); ) {
                Student student = iterator.next();
                int cnt = 0;
                int i = 0;
                for (; i < size; ++i) {
                    if (res[i].h >= student.h) {
                        ++cnt;
                        if (cnt == student.k) {
                            int begin = i + 1;
                            while (begin < size && res[begin].h < student.h) {
                                ++begin;
                            }
                            for (int j = size - 1; j >= begin; --j) {
                                res[j + 1] = res[j];
                            }
                            res[begin] = student;
                            iterator.remove();
                            ++size;
                            break;
                        }
                    }
                }
                if (i == size) {
                    res[size++] = student;
                    iterator.remove();
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for (Student student : res) {
            if (first) {
                sb.append(student.h).append(' ').append(student.k);
                first = false;
            } else {
                sb.append(' ').append(student.h).append(' ').append(student.k);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Input.input(Problem_00018.class);
    }
}
