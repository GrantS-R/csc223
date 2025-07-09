package Module5.GuidedAssignments.Stacks.Problem2;

public class LibraryHelper<T> implements StackInterface<T> {
    protected final int DEFCAP = 100;
    protected T[] elements;
    protected int topIndex = -1;

    public LibraryHelper() {
        elements = (T[]) new Object[DEFCAP];
    }

    public LibraryHelper(int maxSize) {
        elements = (T[]) new Object[maxSize];
    }

    public void push(T element) throws StackOverflowException {
        if (this.isFull()) {
            throw new StackOverflowException();
        }
        topIndex++;
        elements[topIndex] = element;
    }

    public T pop() throws StackUndeflowException {
        if (this.isEmpty()) {
            throw new StackUndeflowException();
        }
        T returnVal = elements[topIndex];
        elements[topIndex] = null;
        topIndex--;
        return returnVal;
    }

    public T top() throws StackUndeflowException {
        if (this.isEmpty()) {
            throw new StackUndeflowException();
        }
        return elements[topIndex];
    }

    public boolean isEmpty() {
        return topIndex == -1;
    }

    public boolean isFull() {
        return topIndex == elements.length - 1;
    }
}
