package before;

import java.util.Arrays;

public class MinStack {
    /**
     * initialize your data structure here.
     */
    /*
    题解：
    https://leetcode-cn.com/problems/bao-han-minhan-shu-de-zhan-lcof/solution/mian-shi-ti-30-bao-han-minhan-shu-de-zhan-fu-zhu-z/
     */
    private int[] content;
    private int index;
    private int length = 10;

    public MinStack() {
        content = new int[length];
        index = 0;
    }

    public void push(int x) {
        if (index >= length) {
            content = Arrays.copyOf(content, length + 10);
            length += 10;
        }
        content[index++] = x;
    }

    public void pop() {
        content[--index] = 0;
    }

    public int top() {
        return content[index-1];
    }

    public int min() {
        int min = content[index-1];
        for (int i = 0; i < index; i++) {
            if (min > content[i]) min = content[i];
        }
        return min;
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.min());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.min());

    }
}
