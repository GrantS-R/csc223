package Module5.GuidedAssignments.Queues.Problem4;

public class QueueUnderflowException extends RuntimeException{
    public QueueUnderflowException() {
        super();
    }

    public QueueUnderflowException(String message) {
        super(message);
    }
}
