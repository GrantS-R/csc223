package Module5.GuidedAssignments.Stacks.Problem1;

import java.util.Scanner;
import java.util.Stack;

public class ValetParking {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("How many cars can we park in the driveway: ");
        int numCars = scnr.nextInt();
        Stack<String> cars = new Stack<String>();
        while (numCars > 0) {
            System.out.print("Please give me your name. I will write it on the key tag: ");
            cars.push(scnr.next());
            numCars--;
        }
        System.out.println("All cars parked!");

        System.out.println("Please come and pick up your car, as your name is displayed");
        while (!cars.empty()) {
            System.out.println("Hello, " + cars.pop() + ", please come to your car");
            System.out.println();
        }
        scnr.close();
    }
}
