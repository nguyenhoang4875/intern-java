package oop;

public class QueueNumber {
    private int[] queue;
    private int head;
    private int tail;

    public QueueNumber() {
        queue = new int[100];
    }

    public int offer(int item) {
        queue[tail] = item;
        tail++;
        return item;
    }

    public int poll() {
        return queue[head++];
    }

    public int peek() {
        return queue[head];
    }

    public boolean empty() {
        return (tail - head) == 0;
    }

    public int size() {
        return tail - head;
    }
}