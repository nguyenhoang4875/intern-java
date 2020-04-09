
package oop;

public class Stack<T> {
    private T[] stack;
    private int count;

    public Stack() {
        stack = (T[]) new Object[100];
    }

    public T push(T item) {
        stack[count] = item;
        count++;
        return item;
    }

    public T pop() {
        return stack[--count];
    }

    public T peek() {
        return stack[count - 1];
    }

    public boolean empty() {
        return count == 0;
    }

    public int size() {
        return count;
    }
}