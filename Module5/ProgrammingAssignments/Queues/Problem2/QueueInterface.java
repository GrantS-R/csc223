package Module5.ProgrammingAssignments.Queues.Problem2;

public interface QueueInterface<T> {
    void enqueue(T element) throws QueueOverflowException;
    T dequeue() throws QueueUnderflowException;
    boolean isFull();
    boolean isEmpty();
    int size();
}