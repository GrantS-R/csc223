package Module5.ProgrammingAssignments.Queues.Problem2;

public class QueueUnderflowException extends RuntimeException{
    public QueueUnderflowException() {
        super();
    }

    public QueueUnderflowException(String message) {
        super(message);
    }
}
