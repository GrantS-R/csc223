package Module5.GuidedAssignments.Stacks.Problem2;

import java.util.Scanner;

public class LibraryHelperDriver {
    public static void main(String[] args) {
        StackInterface<String> libraryStack;
        libraryStack = new LibraryHelper<String>(10);
        Scanner scnr = new Scanner(System.in);
        String bookCode = "";

        while (!bookCode.equalsIgnoreCase("end")) {
            System.out.print("Enter the book code, or type end, if you want to stop: ");
            bookCode = scnr.next();
            if (!bookCode.equalsIgnoreCase("end")) {
                libraryStack.push(bookCode);
            }
        }
        System.out.println("Retrieve the books, identify type, and put them in shelves.");

        int refNo = 0;
        int fictionNo = 0;

        while (!libraryStack.isEmpty()) {
            bookCode = libraryStack.pop();
            System.out.println("Book code is: " + bookCode);
            if (bookCode.charAt(0) == 'R' || bookCode.charAt(0) == 'r') {
                refNo++;
            } else if (bookCode.charAt(0) == 'F' || bookCode.charAt(0) == 'f') {
                fictionNo++;
            } else {
                System.out.println("Book with code " + bookCode + " is not classified!");
            }
        }

        System.out.println("We received " + refNo + " reference books!");
        System.out.println("We received " + fictionNo + " fiction books!");
        scnr.close();
    }
}
