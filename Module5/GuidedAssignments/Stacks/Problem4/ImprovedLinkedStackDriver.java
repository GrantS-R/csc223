package Module5.GuidedAssignments.Stacks.Problem4;

import java.util.Scanner;
public class ImprovedLinkedStackDriver {
    public static void main(String[] args) {
        ImprovedLinkedStack<String> myStack;
        myStack = new ImprovedLinkedStack<String>();
        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter a fruit, or type end, if you want to stop: ");
        String word = scnr.next();
        while (!word.equalsIgnoreCase("end")) {
            myStack.push(word);
            System.out.print("Enter a fruit, or type end, if you want to stop: ");
            word = scnr.next();
        }

        System.out.println(myStack);

        int stackSize = myStack.size();
        System.out.println("The size of the stack is: " + stackSize);

        myStack.popSome(3);
		System.out.println("Remaining elements are: ");
		System.out.println(myStack);

        myStack.swapStart();
		System.out.println("The stack after reversing the order of the top two elements is: ");
		System.out.println(myStack);

        String topFruit = myStack.popTop();
        System.out.println("Top element of the stack is: " + topFruit);
        scnr.close();
    }
}
