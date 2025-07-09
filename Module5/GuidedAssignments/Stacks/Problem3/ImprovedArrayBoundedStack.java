package Module5.GuidedAssignments.Stacks.Problem3;

public class ImprovedArrayBoundedStack<T> implements StackInterface<T> {
    protected final int DEFCAP = 100;
    protected T[] elements;
    protected int topIndex = -1;

    public ImprovedArrayBoundedStack() {
        elements = (T[]) new Object[DEFCAP];
    }

    public ImprovedArrayBoundedStack(int maxSize) {
        elements = (T[]) new Object[maxSize];
    }

    public void push(T element) {
        if (this.isFull()) {
            throw new StackOverflowException("Push attempted on a full stack.");
        } else {
            topIndex++;
            elements[topIndex] = element;
        }
    }

    public void pop() {
        if (isEmpty()) {
            throw new StackUnderflowException("Pop attempted on an empty stack.");
        } else {
            elements[topIndex] = null;
            topIndex--;
        }
    }

    public T top() {
        if (isEmpty()) {
            throw new StackUnderflowException("Top attempted on an empty stack.");
        } else {
            return elements[topIndex];
        }
    }

    public boolean isEmpty() {
        return topIndex == -1;
    }

    public boolean isFull() {
        return topIndex == elements.length - 1;
    }

    @Override
    public String toString() {
        String returnVal = "The stack contains: \n";
        for (int i = this.size() - 1; i > -1; i--) {
            returnVal = returnVal + elements[i] + "\n";
        }
        return returnVal;
    }

    public int size() {
        return topIndex + 1;
    }

    public void popSome(int count) throws StackUnderflowException {
        if (count > this.size()) {
            throw new StackUnderflowException();
        } else {
            while (count > 0) {
                this.pop();
                count--;
            }
        }
    }

    public boolean swapStart() {
        if (this.size() < 2) {
            return false;
        } else {
            T heldVal = elements[topIndex];
            elements[topIndex] = elements[topIndex - 1];
            elements[topIndex - 1] = heldVal;
            return true;
        }
    }

    public T poptop() throws StackOverflowException{
        if (isEmpty()) {
            throw new StackUnderflowException("Pop attempted on an empty stack.");
        } else {
            T returnVal = elements[topIndex];
            elements[topIndex] = null;
            topIndex--;
            return returnVal;
        }
    }
}
