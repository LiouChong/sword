import java.util.*;

/**
 * Author: Liuchong
 * Description:
 * date: 2020/6/10 9:47
 */
public class One {
    public static Integer[] getRepeatNumWithHashMap(Integer[] arr) {
        Map<Integer, Integer> numAndTimesMap = new HashMap<>();

        for (int value : arr) {
            int j;
            if ((j = numAndTimesMap.getOrDefault(value, 0)) == 0) {
                numAndTimesMap.put(value, 1);
            } else {
                numAndTimesMap.put(value, ++j);
            }
        }

        List<Integer> resultList = new LinkedList<>();
        numAndTimesMap.forEach((k, v) -> {
            if (v > 1) {
                resultList.add(k);
            }
        });
        return resultList.toArray(new Integer[0]);
    }

    private static Integer[] getRepeatNumWithSort(Integer[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i -  1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // 排好序的数组搜索重复的
        List<Integer> linkedList = new LinkedList<>();
        int i = 0;
        while (i < arr.length - 1) {
            if (arr[i].equals(arr[i + 1])) {
                linkedList.add(arr[i]);
                while (i < arr.length - 1 & arr[i].equals(arr[++i])){

                }
                continue;
            }
            i ++;
        }

        return linkedList.toArray(new Integer[0]);
    }

    public static void main(String[] args) {
        Integer[] param = new Integer[]{2,3,1,0,2,5,3,3};
        System.out.println(Arrays.toString(getRepeatNumWithSort(param)));
    }
}
