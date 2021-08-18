package before;

import java.util.PriorityQueue;
/*
如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。
题解：
https://leetcode-cn.com/problems/shu-ju-liu-zhong-de-zhong-wei-shu-lcof/solution/mian-shi-ti-41-shu-ju-liu-zhong-de-zhong-wei-shu-y/
 */
public class MedianFinder {
    private int m;
    private int n;
    private PriorityQueue<Integer> hi;
    private PriorityQueue<Integer> lo;

    /** initialize your data structure here. */
    public MedianFinder() {
        m = 0;
        n = 0;
        hi = new PriorityQueue<>((x,y)->(y-x));
        lo = new PriorityQueue<>();
    }

    public void addNum(int num) {
        if(m!=n){
            hi.add(num);
            lo.add(hi.poll());
            m++;
        }else{
            lo.add(num);
            hi.add(lo.poll());
            n++;
        }
    }


    public double findMedian() {
        return m != n ? hi.peek() : (lo.peek()+hi.peek())/2.0;
    }

    public static void main(String[] args) {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(1);
        System.out.println(medianFinder.findMedian());
        medianFinder.addNum(2);
        medianFinder.addNum(3);
        medianFinder.addNum(4);
        System.out.println(medianFinder.findMedian());

    }
}
