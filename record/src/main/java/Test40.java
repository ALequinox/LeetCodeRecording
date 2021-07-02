import java.util.Arrays;

public class Test40 {

    public static void main(String[] args) {
        int[] arr = {4,5,1,6,2,7,3,8};
        System.out.println(Arrays.toString(new Test40().getLeastNumbers(arr, 4)));
    }

    /*
    输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
    题解:
    https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof/solution/jian-zhi-offer-40-zui-xiao-de-k-ge-shu-j-9yze/

     */
    public int[] getLeastNumbers(int[] arr, int k) {
        /*Arrays.sort(arr);

        int[] news = new int[k];

        System.arraycopy(arr, 0, news, 0, k);
        return news;*/
        if(k >= arr.length) return arr;
        return quickSort(arr, k, 0 ,arr.length-1);
    }

    private int[] quickSort(int[] arr, int k, int l, int r) {
        int i = l;
        int j = r;
        while (i < j){
            while (i<j && arr[j] > arr[l]) j--;
            while (i<j && arr[i] < arr[l]) i++;
            swap(arr,i,j);
        }
        swap(arr,i,l);
        if(i > k) return quickSort(arr,k,l,i-1);
        if(i < k) return quickSort(arr,k,i+1,r);
        return Arrays.copyOf(arr,k);
    }

    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
