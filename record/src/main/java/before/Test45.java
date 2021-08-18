package before;

public class Test45 {


    public static void main(String[] args) {
        int[] a = {1,2,3,0};
        System.out.println(new Test45().minNumber(a));
    }
    /*
    剑指 Offer 45. 把数组排成最小的数
    输入一个非负整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
     */
    public String minNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }
        quickSort(strs, 0, strs.length - 1);
        StringBuilder str = new StringBuilder();
        for (String s : strs) {
            str.append(s);
        }

        return str.toString();
    }

    private void quickSort(String[] strs, int l, int r) {
        if (l >= r) return;
        int i = l;
        int j = r;
        while (i < j) {
            while ((strs[j]+strs[l]).compareTo(strs[l]+strs[j])>=0 && i<j) j--;
            while ((strs[i]+strs[l]).compareTo(strs[l]+strs[i])<=0 && i<j) i++;
            swap(strs,i,j);
        }
        swap(strs,i,l);
        quickSort(strs,l,i-1);
        quickSort(strs,i+1,r);

    }

    private void swap(String[] strs, int i, int j) {
        String tmp = strs[i];
        strs[i] = strs[j];
        strs[j] = tmp;
    }
}
