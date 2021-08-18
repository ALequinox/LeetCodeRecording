package before;

import java.util.Arrays;


public class Test39 {


    public static void main(String[] args) {

        int[] a = {8,9,8,9,8};
        System.out.println(new Test39().majorityElement(a));
    }

    /*
        数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
        你可以假设数组是非空的，并且给定的数组总是存在多数元素。
        题解:
        https://leetcode-cn.com/problems/shu-zu-zhong-chu-xian-ci-shu-chao-guo-yi-ban-de-shu-zi-lcof/solution/mian-shi-ti-39-shu-zu-zhong-chu-xian-ci-shu-chao-3/
     */
    public int majorityElement(int[] nums) {
        int maxNum = nums[0];
        int maxFreq = 0;
        boolean[] copy = new boolean[nums.length];
        Arrays.fill(copy, true);
        for (int i = 0; i < nums.length; i++) {
            int freq = 0;
            if (copy[i]){
                for (int j = 0; j < nums.length; j++) {
                    if (nums[i] == nums[j]){
                        freq++;
                        copy[j] = false;
                    }
                }
                if (freq > maxFreq){
                    maxNum = nums[i];
                    maxFreq = freq;
                }
            }
        }

        return maxNum;
    }
}
