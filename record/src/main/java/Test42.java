public class Test42 {

    /*
    输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
    要求时间复杂度为O(n)。
    示例1:
    输入: nums = [-2,1,-3,4,-1,2,1,-5,4]
    输出: 6
    解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。

    题解:
    https://leetcode-cn.com/problems/lian-xu-zi-shu-zu-de-zui-da-he-lcof/solution/mian-shi-ti-42-lian-xu-zi-shu-zu-de-zui-da-he-do-2/
     */
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int front = 0;
        int cur = 0;
        for (int num : nums) {
            cur = num;
            cur = Math.max(front+cur,cur);
            front = cur;
            res = Math.max(res,cur);
        }
        return res;
    }
}
