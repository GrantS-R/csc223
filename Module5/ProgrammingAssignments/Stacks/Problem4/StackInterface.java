package Module5.ProgrammingAssignments.Stacks.Problem4;

public interface StackInterface {
    void push(int elemet);

    void pop() throws StackUnderflowException;

    int top() throws StackUnderflowException;

    boolean isEmpty();

    boolean isFull();
}
