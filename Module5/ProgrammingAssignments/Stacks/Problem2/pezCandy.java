package Module5.ProgrammingAssignments.Stacks.Problem2;

public class pezCandy {
    private String[] stack;
    private int top;
    private int DEFCAP = 10;

    public pezCandy(int size) {
        stack = new String[size];
        top = -1;
    }

    public pezCandy() {
        stack = new String[DEFCAP];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stack.length - 1;
    }

    private void doubling() {
        String[] newStack = new String[stack.length * 2];
        for (int i = 0; i < stack.length; i++) {
            newStack[i] = stack[i];
        }
        stack = newStack;
    }

    public void push(String s) {
        if (this.isFull()) {
            this.doubling();
        }
        stack[++top] = s;
    }

    public String pop() {
        if (!isEmpty()) {
            return stack[top--];
        }
        return null;
    }

    public String peek() {
        if (!isEmpty()) {
            return stack[top];
        }
        return null;
    }

    public int size() {
        return top + 1;
    }

    public void printStack() {
        System.out.print("[");
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i]);
            if (i > 0) System.out.print(", ");
        }
        System.out.println("]");
    }
}
