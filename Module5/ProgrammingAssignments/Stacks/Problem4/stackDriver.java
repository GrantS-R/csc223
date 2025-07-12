package Module5.ProgrammingAssignments.Stacks.Problem4;

import java.util.Random;
import java.util.Scanner;

public class stackDriver {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("How many values in the stack? ");
        int numVals = scnr.nextInt();
        Random rand = new Random();
        stack stack = new stack();
        while (numVals > 0) {
            stack.push(rand.nextInt(1000) + 1);
            numVals--;
        }

        System.out.println("The numbers in the stack are:");
        System.out.println(stack);
        System.out.println("Minimum value in stack: " + stack.minimum());
        System.out.println("Maximum value in stack: " + stack.maximum());
        System.out.println("Average value of numbers in the stack: " + stack.average());
        System.out.println("Number of odd numbers in the stack: " + stack.odds());
        scnr.close();
    }
}
