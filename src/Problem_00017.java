public class Problem_00017 {

    private static final String UNIT[] = {"万", "仟", "佰", "拾", "亿", "仟", "佰", "拾", "万", "仟", "佰", "拾", "元", "角", "分"};
    private static final String NUM[] = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};

    public static String digitUppercase(double money) {
        long money1 = Math.round(money * 100);
        if (money1 == 0) {
            return "零元整";
        }
        String strMoney = String.valueOf(money1);
        int numIndex = 0;
        int unitIndex = UNIT.length - strMoney.length();
        boolean isZero = false;
        String result = "";
        for (; numIndex < strMoney.length(); numIndex++, unitIndex++) {
            char num = strMoney.charAt(numIndex);
            if (num == '0') {
                isZero = true;
                if (UNIT[unitIndex].equals("亿")  || UNIT[unitIndex].equals("万") || UNIT[unitIndex].equals("元")) {
                    result = result + UNIT[unitIndex];
                    isZero = false;
                }
            } else {
                if (isZero) {
                    result = result + "零";
                    isZero = false;
                }
                result = result + NUM[Integer.parseInt(String.valueOf(num))] + UNIT[unitIndex];
            }
        }
        if (!result.endsWith("角") && !result.endsWith("分")) {
            result = result + "整";
        }
        result = result.replaceAll("亿万", "亿");
        return result;
    }


    private static String solution(String line) {
        long n = Long.parseLong(line);
        return digitUppercase(n);
    }

    public static void main(String[] args) {
        Input.input(Problem_00017.class);
    }
}
