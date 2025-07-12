package Module5.ProgrammingAssignments.Stacks.Problem4;

public class StackUnderflowException extends RuntimeException{
    public StackUnderflowException() {
        super();
    }

    public StackUnderflowException(String message) {
        super(message);
    }
}