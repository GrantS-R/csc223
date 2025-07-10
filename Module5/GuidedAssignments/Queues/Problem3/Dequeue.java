package Module5.GuidedAssignments.Queues.Problem3;

public class Dequeue<T> implements DequeueInterface<T> {
    protected LLNode<T> front;
    protected LLNode<T> rear;
    protected int size = 0;

    public Dequeue() {
        front = null;
        rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return false;
    }

    public int size() {
        return size;
    }

    public void clear() {
        front = null;
        rear = null;
        size = 0;
    }

    public void enqueueFront(T element) {
        LLNode<T> temp = new LLNode(element);
        temp.setLink(front);
        front = temp;
        if (this.size() == 0) {
            rear = front;
        }
        size++;
    }

    public void enqueueRear(T element) {
        rear.setLink(new LLNode(element));
        rear = rear.getLink();
        size++;
    }

    public T dequeueFront() {
        if (this.isEmpty()) {
            throw new QueueUnderflowException();
        } else {
            T returnVal = front.getInfo();
            front = front.getLink();
            size--;
            return returnVal;
        }
    }

    public T dequeueRear() {
        if (this.isEmpty()) {
            throw new QueueUnderflowException();
        } else {
            T returnVal = rear.getInfo();
            LLNode<T> newRear = front;
            while (newRear.getLink().getLink() != null) {
                newRear = newRear.getLink();
            }
            rear = newRear;
            rear.setLink(null);
            size--;
            return returnVal;
        }
    }

    public T peekAtFront() throws QueueUnderflowException {
        if (this.isEmpty()) {
            throw new QueueUnderflowException();
        } else {
            return front.getInfo();
        }
    }

    public T peekAtRear() throws QueueUnderflowException {
        if (this.isEmpty()) {
            throw new QueueUnderflowException();
        } else {
            return rear.getInfo();
        }
    }

    public void display() {
        LLNode<T> val = front;
        while (val != null) {
            System.out.println(val.getInfo());
            val = val.getLink();
        }
    }
}
