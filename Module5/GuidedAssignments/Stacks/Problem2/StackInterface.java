package Module5.GuidedAssignments.Stacks.Problem2;

public interface StackInterface<T> {
    void push(T elemet) throws StackOverflowException;

    T pop() throws StackOverflowException;

    T top() throws StackUndeflowException;

    boolean isEmpty();

    boolean isFull();
}
