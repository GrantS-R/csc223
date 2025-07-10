package Module5.GuidedAssignments.Queues.Problem3;

public class DequeueDriver {
    public static void main(String[] args) {
        Dequeue dq = new Dequeue<Integer>();
        int value;

        for (int i = 0; i < 3; i++) {
            value = (int)(Math.random() * 100 + 1);
            dq.enqueueFront(value);
            value = (int)(Math.random() * 100 + 1);
            dq.enqueueRear(value);
        }
        System.out.println();
        System.out.println("Dequeue after inserting elements at front and at rear three times is: ");
        dq.display();

        System.out.println();
        System.out.println(dq.dequeueFront() + " removed from front of queue");
		System.out.println("New queue is: ");
        dq.display();

        System.out.println();
        System.out.println(dq.dequeueRear() + " removed from rear of queue");
        System.out.println("New queue is:");
        dq.display();

        System.out.println();
        System.out.println("Element at front is: " + dq.peekAtFront());
        System.out.println();
        System.out.println("Element at rear is: " + dq.peekAtRear());
        System.out.println();
        System.out.println("Size of dequeue is: " + dq.size());
        System.out.println();
        System.out.println("Dequeue is an empty queue is a " + dq.isEmpty() + " statement!");
        System.out.println();
        dq.clear();
        System.out.println("Dequeue has just been cleared!");
        System.out.println();
        dq.display();
    }
}
