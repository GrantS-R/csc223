package Module5.GuidedAssignments.Stacks.Problem4;

public class ImprovedLinkedStack<T> implements StackInterface<T> {

    class LLNode<T> {
        T data;
        LLNode<T> next;

        public LLNode() {
            data = null;
            next = null;
        }

        public LLNode(T data) {
            this.data = data;
            next = null;
        }

        public LLNode(T data, LLNode<T> next) {
            this.data = data;
            this.next = next;
        }
    }

    protected LLNode<T> top;

    public ImprovedLinkedStack() {
        top = new LLNode<T>();
    }

    public void push(T element) {
        LLNode<T> newNode = new LLNode<T>(element);
        newNode.next = top;
        top = newNode;
    }

    public void pop() {
        if (this.isEmpty()) {
            throw new StackUnderflowException("Pop attempted on an empty stack.");
        } else {
            top = top.next;
        }
    }

    public T top() {
        if (this.isEmpty()) {
            throw new StackUnderflowException("Top attempted on an empty stack.");
        } else  {
            return top.data;
        }
    }

    public boolean isEmpty() {
        return top == null;
    }

    public boolean isFull() {
        return false;
    }

    @Override
    public String toString() {
        String returnVal = "Stack contains: \n";
        LLNode<T> current = top;
        while (current.next != null) {
            returnVal = returnVal + current.data + "\n";
            current = current.next;
        }
        return returnVal;
    }

    public int size() {
        int count = 0;
        LLNode<T> current = top;
        while (current.next != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void popSome(int count) throws StackUnderflowException{
        if (count > this.size()) {
            throw new StackUnderflowException("More pops attempted than number of elements in stack");
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
            LLNode<T> tempVal = top;
            top = top.next;
            tempVal.next = top.next;
            top.next = tempVal;
            return true;
        }
    }

    public T popTop() throws StackUnderflowException{
        if (this.isEmpty()) {
            throw new StackUnderflowException("PopTop attempted on an empty stack.");
        } else {
            T returnVal = top.data;
            top = top.next;
            return returnVal;
        }
    }
}
