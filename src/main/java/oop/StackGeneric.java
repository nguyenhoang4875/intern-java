package oop;

public class StackGeneric {
    private Object[] stack;

    public StackGeneric() {
        stack = new Object[0];
    }

    public StackGeneric(Object[] array) {
        stack = new Object[array.length];
        clone(array, stack);
    }

    public Object push(Object item) {
        Object[] temp = new Object[stack.length];
        clone(stack, temp);
        stack = new Object[stack.length + 1];
        clone(temp, this.stack);
        stack[stack.length - 1] = item;
        return item;
    }

    public Object pop() {
        Object[] temp = new Object[stack.length];
        clone(stack, temp);
        stack = new Object[stack.length - 1];
        clone(temp, this.stack);
        return temp[stack.length];
    }

    public Object peek() {
        return stack[stack.length - 1];
    }

    public Object search(Object item) {

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

    public void clone(Object[] src, Object[] des) {
        int lengthMin = src.length <= des.length ? src.length : des.length;

        for (int i = 0; i < lengthMin; i++) {
            des[i] = src[i];
        }
    }
}