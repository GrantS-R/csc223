package Module5.ProgrammingAssignments.Queues.Problem3;

public interface QueueInterface {
    void enqueue(int element) throws QueueOverflowException;
    int dequeue() throws QueueUnderflowException;
    boolean isFull();
    boolean isEmpty();
    int size();
}