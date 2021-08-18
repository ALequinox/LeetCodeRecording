package before;

import java.util.Arrays;

/**
 * 题解：
 * https://leetcode-cn.com/problems/diao-zheng-shu-zu-shun-xu-shi-qi-shu-wei-yu-ou-shu-qian-mian-lcof/solution/ti-jie-shou-wei-shuang-zhi-zhen-kuai-man-shuang-zh/
 */
public class Test19 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        System.out.println(Arrays.toString(exchange(a)));
    }


    private static int[] exchange(int[] nums) {
        int hi = nums.length-1,low = 0;
        int len = nums.length;
        while (hi>low){
            if(nums[low] % 2 != 0 ){
               low++;
               continue;
            }
            if(nums[hi] % 2 == 0 ) {
                hi--;
                continue;
            }
            int temp = nums[hi];
            nums[hi--] = nums[low];
            nums[low++] = temp;
        }

        return nums;
    }
}
