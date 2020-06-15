package ont2ten;

/**
 * Author: Liuchong
 * Description: 把字符串每个空格替换成%
 * date: 2020/6/11 16:34
 */
public class ThreeMyself {
    public static String changeWhiteSpace(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
//            if (Character.isWhitespace(str.charAt(i))) {
            if (str.charAt(i) == 32) {
                sb.append("%20");
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(changeWhiteSpace("2020 06 11"));
    }
}
