package Module5.ProgrammingAssignments.Stacks.Problem3;

public class StackOverflowException extends RuntimeException{
    public StackOverflowException() {
        super();
    }

    public StackOverflowException(String message) {
        super(message);
    }
}