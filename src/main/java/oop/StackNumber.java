package oop;

public class StackNumber {
    private int[] stack;
    private int count;

    public StackNumber() {
        stack = new int[100];
    }

    public StackNumber(int[] array) {
        stack = new int[100];
        count = array.length - 1;
        clone(array, stack);
    }

    public int push(int item) {
        stack[++count] = item;
        return item;
    }

    public int pop() {
        int temp = stack[count];
        stack[count] = 0;
        return temp;
    }

    public int peek() {
        return stack[count];
    }

    public int search(int item) {

        for (int i = 0; i <= count; i++) {
            if (item == stack[i]) {
                return i;
            }
        }
        return -1;
    }

    public boolean empty() {
        return count == 0;
    }

    public int size() {
        return count == 0 ? 0 : ++count;
    }

    public void clone(int[] src, int[] des) {

        for (int i = 0; i < src.length; i++) {
            des[i] = src[i];
        }
    }
}
