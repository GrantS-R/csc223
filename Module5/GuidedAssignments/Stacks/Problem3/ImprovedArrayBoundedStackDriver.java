package Module5.GuidedAssignments.Stacks.Problem3;

import java.util.Scanner;

public class ImprovedArrayBoundedStackDriver {
    public static void main(String[] args) {
        ImprovedArrayBoundedStack<String> myStack;
        myStack = new ImprovedArrayBoundedStack<String>(10);
        Scanner scnr = new Scanner(System.in);
		String word = "";
        while (!word.equalsIgnoreCase("end")) {
            System.out.print("Enter a fruit, or type end, if you want to stop: ");
            word = scnr.next();
            if (!word.equalsIgnoreCase("end")) {
                myStack.push(word);
            }
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

        String topFruit = myStack.poptop();
		System.out.println("Top element of the stack is: " + topFruit);
        scnr.close();
    }
}
