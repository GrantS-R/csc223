package Module5.GuidedAssignments.Stacks.Problem3;

public interface StackInterface<T> {
    void push(T elemet) throws StackOverflowException;

    void pop() throws StackOverflowException;

    T top() throws StackUnderflowException;

    boolean isEmpty();

    boolean isFull();
}
