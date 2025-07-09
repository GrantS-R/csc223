package Module5.GuidedAssignments.Stacks.Problem4;

public interface StackInterface<T> {
    void push(T elemet);

    void pop() throws StackUnderflowException;

    T top() throws StackUnderflowException;

    boolean isEmpty();

    boolean isFull();
}
