import java.util.Arrays;
import java.util.Objects;

/**
 * Author: Liuchong
 * Description:
 * date: 2020/6/14 21:47
 */
public class Three_2 {
    private static Integer[] mergeTwoArray(Integer[] arr1, Integer[] arr2) {
        if (Objects.isNull(arr2)) {
            return arr1;
        }
        int len1 = 0 ;
        while (arr1[len1] != null) {
            len1 ++;
        }
        len1--;
        int indexEnd = len1 + arr2.length;
        int len2 = arr2.length - 1;
        while (len1 >= 0 && len2 >= 0) {
            if (arr1[len1] > arr2[len2]) {
                arr1[indexEnd] = arr1[len1];
                len1 --;
            } else if (arr1[len1] < arr2[len2]){
                arr1[indexEnd] = arr2[len2];
                len2 --;
            } else {
                arr1[indexEnd--] = arr1[len1];
                arr1[indexEnd] = arr2[len2];
                len1--;
                len2--;
            }
            indexEnd --;
        }
        if (len1 < 0) {
            while (len2 != 0) {
                arr1[len2] = arr2[len2];
                len2 --;
            }
        }
        return arr1;
    }
    public static void main(String[] args) {
        Integer[] arr1 = new Integer[13];
        Integer[] des = new Integer[]{1, 2, 5, 6, 7, 10};
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 5;
        arr1[3] = 6;
        arr1[4] = 7;
        arr1[5] = 10;
        System.out.println(Arrays.toString(mergeTwoArray(arr1, new Integer[]{2,4,6,8,9,12})));
    }
}
