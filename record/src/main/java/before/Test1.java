package before;

public class Test1 {

    /*
    剑指 Offer 03. 数组中重复的数字
    找出数组中重复的数字。


    在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。

    示例 1：

    输入：
    [2, 3, 1, 0, 2, 5, 3]
    输出：2 或 3

    解题:
    https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/solution/mian-shi-ti-03-shu-zu-zhong-zhong-fu-de-shu-zi-b-4/
     */
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 2, 5, 3};
        System.out.println(findRepeatNumber(nums));
    }


   private static int findRepeatNumber(int[] nums) {

       for (int i = 0; i < nums.length; i++) {
           int p = nums[i];
           for(int j = i+1; j < nums.length; j++){
               if( p == nums[j]){
                   return p;
               }
           }
       }

        return nums[0];
    }

}
