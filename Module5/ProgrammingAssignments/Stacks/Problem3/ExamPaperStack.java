package Module5.ProgrammingAssignments.Stacks.Problem3;

public class ExamPaperStack implements StackInterface {
    class LLNode {
        ExamPaper data;
        LLNode next;

        public LLNode() {
            data = null;
            next = null;
        }

        public LLNode(ExamPaper data) {
            this.data = data;
            next = null;
        }

        public LLNode(ExamPaper data, LLNode next) {
            this.data = data;
            this.next = next;
        }
    }

    protected LLNode top;

    public ExamPaperStack() {
        top = new LLNode();
    }

    public void push(ExamPaper element) {
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

    public ExamPaper top() {
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
        LLNode current = top;
        while (current.next != null) {
            returnVal = returnVal + current.data.toString() + "\n";
            current = current.next;
        }
        return returnVal;
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

    public ExamPaper popTop() throws StackUnderflowException{
        if (this.isEmpty()) {
            throw new StackUnderflowException("PopTop attempted on an empty stack.");
        } else {
            ExamPaper returnVal = top.data;
            top = top.next;
            return returnVal;
        }
    }

    public double average() {
        double returnVal = 0;
        LLNode current = top;
        while (current.next != null) {
            returnVal += current.data.getScore();
            current = current.next;
        }
        returnVal /= this.size();
        return returnVal;
    }

    public ExamPaperStack scoresAbove(double benchmark) {
        ExamPaperStack returnStack = new ExamPaperStack();
        LLNode current = top;
        while (current.next != null) {
            if (current.data.getScore() >= benchmark) {
                returnStack.push(current.data);
            }
            current = current.next;
        }
        return returnStack;
    }

    public ExamPaperStack scoresBelow(double benchmark) {
        ExamPaperStack returnStack = new ExamPaperStack();
        LLNode current = top;
        while (current.next != null) {
            if (current.data.getScore() <= benchmark) {
                returnStack.push(current.data);
            }
            current = current.next;
        }
        return returnStack;
    }
}
