import java.util.LinkedList;

public class Problem_00016 {

    private static String solution(String line) {
        String[] array = line.split(" ");
        LinkedList<Integer> numStack = new LinkedList<>();
        LinkedList<String> opStack = new LinkedList<>();
        numStack.push(Integer.valueOf(array[0]));
        for (int i = 1; i < array.length; ++i) {
            if ("+".equals(array[i]) || "-".equals(array[i])) {
                String op = opStack.peek();
                if (op != null) {
                    int b = numStack.pop();
                    int a = numStack.pop();
                    opStack.pop();
                    if ("+".equals(op)) {
                        numStack.push(a + b);
                    } else {
                        numStack.push(a - b);
                    }
                }
                opStack.push(array[i]);
                numStack.push(Integer.valueOf(array[++i]));
            } else if ("*".equals(array[i])) {
                int a = numStack.pop();
                int b = Integer.parseInt(array[++i]);
                numStack.push(a * b);
            } else {
                int a = numStack.pop();
                int b = Integer.parseInt(array[++i]);
                if (b == 0) {
                    return "err";
                }
                numStack.push(a / b);
            }
        }
        while (!opStack.isEmpty()) {
            int b = numStack.pop();
            int a = numStack.pop();
            String op = opStack.pop();
            if ("+".equals(op)) {
                numStack.push(a + b);
            } else {
                numStack.push(a - b);
            }
        }
        return String.valueOf(numStack.pop());
    }

    public static void main(String[] args) {
        Input.input(Problem_00016.class);
    }
}
