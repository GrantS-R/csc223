package Module5.ProgrammingAssignments.Stacks.Problem3;

import java.util.Scanner;

public class ExamPaperOrganizer {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        ExamPaperStack stack = new ExamPaperStack();
        System.out.print("Enter the name of the student or type end, if you want to stop: ");
        String studentName = scnr.nextLine();
        int score;
        while (!studentName.equalsIgnoreCase("end")) {
            System.out.print("Enter the exam score for " + studentName +": ");
            score = scnr.nextInt();
            scnr.nextLine();
            stack.push(new ExamPaper(studentName, score));
            System.out.print("Enter the name of the student or type end, if you want to stop: ");
            studentName = scnr.nextLine();
        }

        System.out.print(stack);
        System.out.println("The number of exam grades: " + stack.size());
        double average = stack.average();
        System.out.println("Average score for the exam is: " + average);
        System.out.println();

        ExamPaperStack aboveStack = stack.scoresAbove(average);
        ExamPaperStack belowStack = stack.scoresBelow(average);

        System.out.println("Papers that have an average score or above:");
        System.out.print(aboveStack);
        System.out.println("There are " + aboveStack.size() + " papers with a score above average");
        System.out.println();

        System.out.println("Papers that have score under the average:");
        System.out.print(belowStack);
        System.out.println("There are " + belowStack.size() + " papers with a score below average");
        scnr.close();
    }
}
