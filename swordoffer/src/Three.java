import java.util.Arrays;
import java.util.Objects;

/**
 * Author: Liuchong
 * Description:
 * date: 2020/6/14 21:30
 */
public class Three {
    public static String replaceSpace(String src) {
        if (Objects.isNull(src)) {
            return null;
        }
        char[] srcArrs = src.toCharArray();
        int count = 0;
        for (int i = 0; i < src.length(); i++) {
            if (' ' == srcArrs[i]) {
                count++;
            }
        }
        int length = srcArrs.length + count * 2;
        char[] des = Arrays.copyOf(srcArrs, length);
        int j = length - 1;
        int i = srcArrs.length - 1;
        while (i != j) {
            if (des[i] != ' ') {
                des[j] = des[i];
                j --;
            } else {
                des[j--] = '0';
                des[j--] = '2';
                des[j--] = '%';
            }
            i --;
        }
        return new String(des);
    }

    public static void main(String[] args) {
        System.out.println(replaceSpace(""));
    }

}
