
package oop;

public class Stack {
    private Object[] stack;
    private int count;

    public Stack() {
        stack = new Object[100];
    }

    public Object push(Object item) {
        stack[++count] = item;
        return item;
    }

    public Object pop() {
        return stack[count--];
    }

    public Object peek() {
        return stack[count];
    }

    public boolean empty() {
        return count == 0;
    }

    public int size() {
        return count == 0 ? 0 : ++count;
    }
}