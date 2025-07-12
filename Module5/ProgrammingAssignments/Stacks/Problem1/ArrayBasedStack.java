package Module5.ProgrammingAssignments.Stacks.Problem1;

public class ArrayBasedStack {
    int DEFCAP = 10;
    char[] stack;
    int top;

    public ArrayBasedStack() {
        stack = new char[DEFCAP];
        top = -1;
    }

    public ArrayBasedStack(int length) {
        stack = new char[length];
        top = -1;
    }

    public void push(char c) {
        if (this.isFull()) {
            this.doubling();
        }
        stack[++top] = c;
    }

    public char pop() {
        if (!isEmpty()) {
            return stack[top--];
        }
        return '\0';
    }

    private void doubling() {
        char[] tempStack = new char[stack.length * 2];
        for (int i = 0; i < stack.length; i++) {
            tempStack[i] = stack[i];
        }
        stack = tempStack;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stack.length - 1;
    }
}
