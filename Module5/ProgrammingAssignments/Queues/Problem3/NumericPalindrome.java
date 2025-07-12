package Module5.ProgrammingAssignments.Queues.Problem3;

public class NumericPalindrome implements QueueInterface {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;
    protected int defcap = 10;

    public NumericPalindrome(int capacity) {
        queue = new int[capacity];
        front = -1;
        rear = 0;
        size = 0;
        this.capacity = capacity;
    }

    public NumericPalindrome() {
        queue = new int[defcap];
        front = -1;
        rear = 0;
        size = 0;
        capacity = defcap;
    }

    public void enqueue(int element) {
        if (this.isFull()) {
            this.doubling();
        }
        front++;
        queue[front] = element;
        size++;
    }

    public int dequeue() {
        if (this.isEmpty()) {
            throw new QueueUnderflowException("dequeue attempted on an empty queue");
        } else {
            int returnVal = queue[rear];
            queue[rear] = 0;
            rear++;
            size--;
            return returnVal;
        }
    }

    public boolean isEmpty() {
        return rear == front + 1;
    }

    public boolean isFull() {
        return front == capacity - 1;
    }

    public int size() {
        return size;
    }

    public boolean isPalindrome(int n) {
        this.purge();
        String s = Integer.toString(n);
        for (int i = 0; i < s.length(); i++) {
            enqueue(s.charAt(i) + '0');
        }

        for (int i = 0; i < s.length() / 2; i++) {
            int left = queue[rear + i];
            int right = queue[front - i];
            if (left != right) {
                return false;
            }
        }
        return true;
    }

    private void doubling() {
        capacity *= 2;
        int[] tempQueue = new int[capacity];
        for (int i = 0; i < queue.length; i++) {
            tempQueue[i] = queue[i];
        }
        queue = tempQueue;
    }

    private void purge() {
        for (int i = 0; i < queue.length; i++) {
            queue[i] = 0;
        }
        front = -1;
        rear = 0;
        size = 0;
    }
}
