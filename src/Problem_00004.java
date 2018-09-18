public class Problem_00004 {

    private static String solution(String line) {
        String[] array = line.split(",");
        int[] a = new int[array.length];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; ++i) {
            a[i] = Integer.parseInt(array[i]);
            min = Math.min(min, a[i]);
            max = Math.max(max, a[i]);
        }
        boolean[] bucket = new boolean[max - min + 1];
        for (int n : a) {
            bucket[n - min] = true;
        }
        int res = 1;
        int sum = 1;
        for (int i = 1; i < bucket.length; ++i) {
            if (bucket[i]) {
                if (bucket[i - 1]) {
                    ++sum;
                    if (sum > res) {
                        res = sum;
                    }
                } else {
                    sum = 1;
                }
            } else {
                sum = 0;
            }
        }
        return String.valueOf(res);
    }

    public static void main(String[] args) {
        String s1 = "100,4,200,1,3,2";
        String s2 = "54,55,300,12";
        String s3 = "1";
        String s4 = "5,4,3,2,1";
        String s5 = "1,2,3,4,5,6";
        String s6 = "54,55,300,12,56";
        System.out.println(solution(s1));
        System.out.println(solution(s2));
        System.out.println(solution(s3));
        System.out.println(solution(s4));
        System.out.println(solution(s5));
        System.out.println(solution(s6));
    }
}
