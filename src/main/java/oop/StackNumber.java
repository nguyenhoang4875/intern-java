package oop;

public class StackNumber {
    private int[] stack;
    private int count;

    public StackNumber() {
        stack = new int[100];
    }

    public int push(int item) {
        stack[count] = item;
        count++;
        return item;
    }

    public int pop() {
        return stack[--count];
    }

    public int peek() {
        return stack[count-1];
    }

    public boolean empty() {
        return count == 0;
    }

    public int size() {
        return count;
    }
}
