package Module5.ProgrammingAssignments.Stacks.Problem4;

public class StackOverflowException extends RuntimeException{
    public StackOverflowException() {
        super();
    }

    public StackOverflowException(String message) {
        super(message);
    }
}