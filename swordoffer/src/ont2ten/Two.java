package ont2ten;

/**
 * Author: Liuchong
 * Description:
 * date: 2020/6/10 10:45
 */
public class Two {
    public static Integer getRepeatNum(Integer[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length - i - 1; j++) {

                if (nums[i].equals(nums[j])) {
                    return nums[i];
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Integer[] integers = {2, 3, 5, 4, 3, 2, 6, 7};
        System.out.println(getRepeatNum(integers));
    }
}
