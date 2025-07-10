package Module5.GuidedAssignments.Queues.Problem3;

public interface DequeueInterface<T> {
    void enqueueFront(T element) throws QueueOverflowException;
    void enqueueRear(T element) throws QueueOverflowException;
    T dequeueFront() throws QueueUnderflowException;
    T dequeueRear() throws QueueUnderflowException;
    boolean isFull();
    boolean isEmpty();
    int size();
}
