package oop;

public class Queue<T> {
    private T[] queue;
    private int head;
    private int tail;

    public Queue() {
        queue = (T[]) new Object[100];
    }

    public void offer(T item) {
        queue[tail++] = item;
    }

    public T poll() {
        return queue[head++];
    }

    public T peek() {
        return queue[head];
    }

    public boolean empty() {
        return (tail - head) == 0;
    }

    public int size() {
        return tail - head;
    }
}