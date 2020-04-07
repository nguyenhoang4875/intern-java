package oop;

public class StackNumber {
    private int[] stack;

    public StackNumber() {
        stack = new int[0];
    }

    public StackNumber(int[] array) {
        stack = new int[array.length];
        clone(array, stack);
    }

    public int push(int item) {
        int[] temp = new int[stack.length];
        clone(stack, temp);
        stack = new int[stack.length + 1];
        clone(temp, this.stack);
        stack[stack.length - 1] = item;
        return item;
    }

    public int pop() {
        int[] temp = new int[stack.length];
        clone(stack, temp);
        stack = new int[stack.length - 1];
        clone(temp, this.stack);
        return temp[stack.length];
    }

    public int peek() {
        return stack[stack.length - 1];
    }

    public int search(int item) {

        for (int i = 0; i < stack.length; i++) {
            if (item == stack[i]) {
                return i;
            }
        }
        return -1;
    }

    public boolean empty() {
        return stack.length == 0;
    }

    public int size() {
        return stack.length;
    }

    public void clone(int[] src, int[] des) {
        int lengthMin = src.length <= des.length ? src.length : des.length;

        for (int i = 0; i < lengthMin; i++) {
            des[i] = src[i];
        }
    }
}
