package oop;

public class Stack {
    private Object[] stack;
    private int count;

    public Stack() {
        stack = new Object[100];
    }

    public Stack(Object[] array) {
        stack = new Object[100];
        count = array.length - 1;
        clone(array, stack);
    }

    public Object push(int item) {
        stack[++count] = item;
        return item;
    }

    public Object pop() {
        Object temp = stack[count];
        stack[count] = 0;
        return temp;
    }

    public Object peek() {
        return stack[count];
    }

    public Object search(Object item) {

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

    public Object size() {
        return count == 0 ? 0 : ++count;
    }

    public void clone(Object[] src, Object[] des) {

        for (int i = 0; i < src.length; i++) {
            des[i] = src[i];
        }
    }
}
