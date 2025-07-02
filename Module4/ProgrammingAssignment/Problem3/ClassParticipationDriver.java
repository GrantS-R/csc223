package Module4.ProgrammingAssignment.Problem3;

import java.util.Scanner;

public class ClassParticipationDriver {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        ClassParticipation participation = new ClassParticipation();
        System.out.println("Enter the sudent names now");
        System.out.println("Type done when you are finished");
        String name = scnr.next();
        while (!name.equals("done")) {
            participation.add(name);
            name = scnr.next();
        }

        System.out.println("Report on the students seen:");
        System.out.println(participation.getReport());
        scnr.close();
    }
}
