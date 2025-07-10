package Module5.GuidedAssignments.Queues.Problem1;

import java.util.Scanner;

public class AdvisingSchedule_ArrayDriver {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        QueueInterface<String> nameQueue;
        nameQueue = new AdvisingSchedule_Array<String>(5);

        System.out.print("Enter student name. If you want to finish enter \"done\": ");
        String name = scnr.nextLine();
        while (!name.equalsIgnoreCase("done")) {
            nameQueue.enqueue(name);
            if (nameQueue.isFull()) {
                name = "done";
                System.out.println("There is no more spot available for advising!");
            } else {
                System.out.print("Enter student name. If you want to finish enter \"done\": ");
                name = scnr.nextLine();
            }
        }

        int noStudents = nameQueue.size();
        System.out.println("Number of students asking for advising: " + noStudents);

        System.out.println("\nScheduled students:\n");
        while (!nameQueue.isEmpty()) {
            name = nameQueue.dequeue();
            System.out.println(name);
        }
        scnr.close();
    }
}
