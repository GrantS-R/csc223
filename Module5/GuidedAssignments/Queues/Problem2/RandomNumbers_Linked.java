package Module5.GuidedAssignments.Queues.Problem2;

public class RandomNumbers_Linked<T> implements QueueInterface<T> {
    protected LLNode<T> front;
    protected LLNode<T> rear;
    protected int numElements = 0;

    public RandomNumbers_Linked() {
        front = null;
        rear = null;
    }

    public void enqueue(T element) {
        if (this.isEmpty()) {
            front = new LLNode<T>(element);
            rear = front;
            numElements++;
        } else if (this.size() == 1) {
            rear = new LLNode<T>(element);
            front.setLink(rear);
            numElements++;
        } else {
            rear.setLink(new LLNode<T>(element));
            rear = rear.getLink();
            numElements++;
        }
    }

    public T dequeue() {
        if (this.isEmpty()) {
            throw new QueueUnderflowException();
        } else {
            T returnVal = front.getInfo();
            front = front.getLink();
            numElements--;
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
        return numElements;
    }
}
