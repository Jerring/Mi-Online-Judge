import java.util.LinkedList;

public class Problem_00062 {

    private static String solution(String line) {
        LinkedList<Character> stack = new LinkedList<>();
        for (int i = 0; i < line.length(); ++i) {
            char ch = line.charAt(i);
            if (ch == '}') {
                if (stack.isEmpty() || '{' != stack.pop()) {
                    return "0";
                }
            } else if (ch == ']') {
                if (stack.isEmpty() || '[' != stack.pop()) {
                    return "0";
                }
            } else if (ch == ')') {
                if (stack.isEmpty() || '(' != stack.pop()) {
                    return "0";
                }
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty() ? "1" : "0";
    }

    public static void main(String[] args) {
        Input.input(Problem_00062.class);
    }
}
