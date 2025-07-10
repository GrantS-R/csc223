package Module5.GuidedAssignments.Queues.Problem4;

public class CircularQueue<T> implements QueueInterface<T> {
    protected final int DEFCAP = 100;
    protected T[] queue;
    protected int numElements;
    protected int front;
    protected int rear;

    public CircularQueue(int maxSize) {
        numElements = 0;
        front = 0;
        rear = 0;
        queue = (T[]) new Object[maxSize];
    }

    public void enqueue(T element) {
        if (this.isFull()) {
            this.expandCapacity();
        }
        queue[rear] = element;
        rear++;
        numElements++;
    }

    private void expandCapacity() {
        T[] newQueue = (T[]) new Object[queue.length * 2];
        for (int i = 0; i < queue.length; i++) {
            newQueue[i] = queue[i];
        }
        queue = newQueue;
    }

    public T dequeue() {
        if (this.isEmpty()) {
            throw new QueueUnderflowException();
        } else {
            T returnVal = queue[front];
            queue[front] = null;
            front++;
            numElements--;
            return returnVal;
        }
    }

    public T first() throws QueueUnderflowException {
        if (this.isEmpty()) {
            throw new QueueUnderflowException();
        } else {
            return queue[front];
        }
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public boolean isFull() {
        return rear == queue.length;
    }

    public int size() {
        return rear - front;
    }

    public String toString() {
        String result = "";
        int index = front;
        for (int scan = 0; scan < numElements; scan++) {
            result = result + "\n" + queue[index];
            index = (index + 1) % queue.length;
        }
        return result;
    }
}
