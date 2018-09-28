public class Problem_00019 {

    private static String solution(String line) {
        int pos = line.indexOf('<');
        if (pos != -1) {
            String[] array = line.split("<");
            if (array[0].length() != array[1].length()) {
                return array[0].length() < array[1].length() ? "Y" : "N";
            }
            return array[0].compareTo(array[1]) < 0 ? "Y" : "N";
        }
        pos = line.indexOf('>');
        if (pos != -1) {
            String[] array = line.split(">");
            if (array[0].length() != array[1].length()) {
                return array[0].length() > array[1].length() ? "Y" : "N";
            }
            return array[0].compareTo(array[1]) > 0 ? "Y" : "N";
        }
        String[] array = line.split("\\+");
        int[] a = new int[array[0].length() + 1];
        int[] b = new int[array[1].length() + 1];
        int k = 0;
        for (int i = array[0].length() - 1; i >= 0; --i) {
            a[k++] = array[0].charAt(i) - '0';
        }
        k = 0;
        for (int i = array[1].length() - 1; i >= 0; --i) {
            b[k++] = array[1].charAt(i) - '0';
        }
        if (a.length >= b.length) {
            for (int i = 0; i < array[1].length(); ++i) {
                a[i] += b[i];
            }
            for (int i = 0; i < array[0].length(); ++i) {
                if (a[i] >= 10) {
                    a[i] -= 10;
                    ++a[i + 1];
                }
            }
            StringBuilder sb = new StringBuilder();
            if (a[a.length - 1] != 0) {
                sb.append(a[a.length - 1]);
            }
            for (int i = a.length - 2; i >= 0; --i) {
                sb.append(a[i]);
            }
            return sb.toString();
        } else {
            for (int i = 0; i < array[0].length(); ++i) {
                b[i] += a[i];
            }
            for (int i = 0; i < array[1].length(); ++i) {
                if (b[i] >= 10) {
                    b[i] -= 10;
                    ++b[i + 1];
                }
            }
            StringBuilder sb = new StringBuilder();
            if (b[b.length - 1] != 0) {
                sb.append(b[b.length - 1]);
            }
            for (int i = b.length - 2; i >= 0; --i) {
                sb.append(b[i]);
            }
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        Input.input(Problem_00019.class);
    }
}
