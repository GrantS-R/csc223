package Module5.ProgrammingAssignments.Queues.Problem4;

public interface QueueInterface {
    void enqueue(Stock element) throws QueueOverflowException;
    Stock dequeue() throws QueueUnderflowException;
    boolean isFull();
    boolean isEmpty();
    int size();
}