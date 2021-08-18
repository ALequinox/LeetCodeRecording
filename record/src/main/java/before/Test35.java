package before;

public class Test35 {
    /*
    剑指 Offer 51. 数组中的逆序对
    在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。输入一个数组，求出这个数组中的逆序对的总数。



    示例 1:

    输入: [7,5,6,4]
    输出: 5

    题解:
        https://leetcode-cn.com/problems/shu-zu-zhong-de-ni-xu-dui-lcof/solution/shu-zu-zhong-de-ni-xu-dui-by-leetcode-solution/
     */

    public static void main(String[] args) {
        int[] a = {8,7,22,8,18,1,13,0};
        System.out.println(new Test35().reversePairs(a));
    }

    public int reversePairs(int[] nums) {
        int len = nums.length;
        if (len < 2) {
            return 0;
        }

        int[] copy = new int[len];
        for (int i = 0; i < nums.length; i++) {
            copy[i] = nums[i];
        }

        int[] temp = new int[len];
        return reversePairs(copy, 0, len - 1, temp);
    }

    private int reversePairs(int[] copy, int left, int right, int[] temp) {
        if (right == left) return 0;

        int mid = left + (right - left) / 2;
        int leftReversePairs = reversePairs(copy, left, mid, temp);
        int rightReversePairs = reversePairs(copy, mid + 1, right, temp);

        if (copy[mid] <= copy[mid + 1]) {
            return leftReversePairs + rightReversePairs;
        }

        int crossPairs = mergeAndCount(copy, left, mid, right, temp);
        return crossPairs + leftReversePairs + rightReversePairs;
    }

    private int mergeAndCount(int[] copy, int left, int mid, int right, int[] temp) {
        for (int i = left; i <= right; i++) {
            temp[i] = copy[i];
        }

        int i = left;
        int j = mid + 1;

        int count = 0;
        for (int k = left; k <= right; k++) {

            if (i == mid + 1) {
                copy[k] = temp[j];
                j++;
            } else if (j == right + 1) {
                copy[k] = temp[i];
                i++;
            } else if (temp[i] <= temp[j]) {
                copy[k] = temp[i];
                i++;
            } else {
                copy[k] = temp[j];
                j++;
                count += (mid - i + 1);
            }
        }

        return count;
    }


}
