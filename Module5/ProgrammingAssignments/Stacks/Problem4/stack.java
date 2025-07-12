package Module5.ProgrammingAssignments.Stacks.Problem4;

public class stack implements StackInterface {
    class LLNode {
        int data;
        LLNode next;

        public LLNode() {
            data = 0;
            next = null;
        }

        public LLNode(int data) {
            this.data = data;
            next = null;
        }

        public LLNode(int data, LLNode next) {
            this.data = data;
            this.next = next;
        }
    }

    protected LLNode top;

    public stack() {
        top = new LLNode();
    }

    public void push(int element) {
        LLNode newNode = new LLNode(element);
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

    public int top() {
        if (this.isEmpty()) {
            throw new StackUnderflowException("Top attempted on an empty stack.");
        } else {
            return top.data;
        }
    }

    public boolean isEmpty() {
        return top == null;
    }

    public boolean isFull() {
        return false;
    }

    public int maximum() {
        LLNode current = top;
        int max = current.data;
        while (current.next != null) {
            if (current.data > max) {
                max = current.data;
            }
            current = current.next;
        }
        return max;
    }

    public int minimum() {
        LLNode current = top;
        int min = current.data;
        while (current.next != null) {
            if (current.data < min) {
                min = current.data;
            }
            current = current.next;
        }
        return min;
    }

    public int size() {
        int count = 0;
        LLNode current = top;
        while (current.next != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public double average() {
        double average = 0;
        LLNode current = top;
        while (current.next != null) {
            average += current.data;
            current = current.next;
        }
        average /= this.size();
        return average;
    }

    public int odds() {
        int count = 0;
        LLNode current = top;
        while (current.next != null) {
            if (current.data % 2 == 1) {
                count++;
            }
            current = current.next;
        }
        return count;
    }

    @Override
    public String toString() {
        String returnVal = "[";
        LLNode current = top;
        while (current.next != null) {
            returnVal = returnVal + current.data + ", ";
            current = current.next;
        }
        returnVal = returnVal.substring(0, returnVal.length() - 3) + "]";
        return returnVal;
    }
}
