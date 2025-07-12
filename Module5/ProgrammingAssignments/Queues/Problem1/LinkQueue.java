package Module5.ProgrammingAssignments.Queues.Problem1;

public class LinkQueue<T> implements QueueInterface<T> {
    private static class node<T> {
        T data;
        node<T> next;
        node(T data) {
            this.data = data;
            next = null;
        }
    }

    private node<T> front;
    private node<T> rear;

    public LinkQueue() {
        front = null;
        rear = null;
    }

    public void enqueue(T element) {
        if (this.isEmpty()) {
            front = new node<T>(element);
            rear = front;
        } else {
            rear.next = new node<T>(element);
            rear = rear.next;
        }
    }

    public T dequeue() {
        if (this.isEmpty()) {
            throw new QueueUnderflowException("Dequeue attempted on an empty queue");
        } else {
            T returnVal = front.data;
            front = front.next;
            return returnVal;
        }
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return false;
    }

    public int size() {
        int count = 0;
        node<T> current = front;
        while (current.next != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}
