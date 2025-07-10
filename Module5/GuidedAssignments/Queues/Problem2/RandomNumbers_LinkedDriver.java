package Module5.GuidedAssignments.Queues.Problem2;

public class RandomNumbers_LinkedDriver {
    public static void main(String[] args) {
        QueueInterface<Integer> randomQueue;
        randomQueue = new RandomNumbers_Linked<Integer>();
        int number;

        for (int i = 1; i <= 20; i++) {
            number = (int)(Math.random() * 100 + 1);
            randomQueue.enqueue(number);
        }

        System.out.println("\nRandom numbers are:\n");
        while (!randomQueue.isEmpty()) {
            number = randomQueue.dequeue();
            System.out.println(number + ((number % 5 == 0) ? "\tis divisible by 5":""));
        }

        System.out.println();
    }
}
