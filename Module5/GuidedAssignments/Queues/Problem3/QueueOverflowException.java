package Module5.GuidedAssignments.Queues.Problem3;

public class QueueOverflowException extends RuntimeException{
    public QueueOverflowException() {
        super();
    }

    public QueueOverflowException(String message) {
        super(message);
    }
}