package Module5.GuidedAssignments.Queues.Problem4;

import java.util.Scanner;

public class CircularQueueDriver {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        QueueInterface<String> fruit;
        fruit = new CircularQueue<String>(5);
        System.out.print("Enter the name of a fruit \"done\": ");
        String name = scnr.nextLine();
        while (!name.equalsIgnoreCase("done")) {
            fruit.enqueue(name);
            System.out.print("Enter the name of a fruit \"done\": ");
            name = scnr.nextLine();
        }

        int count = fruit.size();
        System.out.println("Number of elements in the queue: " + count);
        System.out.println("The content of the queue is: ");
        System.out.println(fruit);
        scnr.close();
    }
}
