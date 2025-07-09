package Module5.GuidedAssignments.Stacks.Problem2;

public class StackUndeflowException extends RuntimeException{
    public StackUndeflowException() {
        super();
    }

    public StackUndeflowException(String message) {
        super(message);
    }
}
