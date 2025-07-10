package Module5.GuidedAssignments.Queues.Problem1;

public class AdvisingSchedule_Array<T> implements QueueInterface<T> {
    protected final int DEFCAP = 10;
    protected T[] elements;
    protected int numElements = 0;
    protected int front = 0;
    protected int rear;

    public AdvisingSchedule_Array() {
        elements = (T[]) new Object[DEFCAP];
        rear = DEFCAP - 1;
    }

    public AdvisingSchedule_Array(int maxSize) {
        elements = (T[]) new Object[maxSize];
        rear = maxSize - 1;
    }

    public void enqueue(T element) {
        if (this.isFull()) {
            throw new QueueOverflowException();
        } else {
            elements[numElements] = element;
            numElements++;
        }
    }

    public T dequeue() {
        if (this.isEmpty()) {
            throw new QueueUnderflowException();
        } else {
            T returnVal = elements[front];
            elements[front] = null;
            front++;
            numElements--;
            return returnVal;
        }
    }

    public boolean isEmpty() {
        if (front == rear + 1) {
            return true;
        }
        return elements[front] == null;
    }

    public boolean isFull() {
        return elements[rear] != null;
    }

    public int size() {
        return numElements;
    }
}
