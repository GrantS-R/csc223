package Module5.ProgrammingAssignments.Stacks.Problem3;

public interface StackInterface {
    void push(ExamPaper elemet);

    void pop() throws StackUnderflowException;

    ExamPaper top() throws StackUnderflowException;

    boolean isEmpty();

    boolean isFull();
}
