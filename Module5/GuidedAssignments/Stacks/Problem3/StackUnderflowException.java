package Module5.GuidedAssignments.Stacks.Problem3;

public class StackUnderflowException extends RuntimeException{
    public StackUnderflowException() {
        super();
    }

    public StackUnderflowException(String message) {
        super(message);
    }
}
