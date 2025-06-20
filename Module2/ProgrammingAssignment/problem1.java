package Module2.ProgrammingAssignment;

import Module2.ProgrammingAssignment.multiply;

public class problem1 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int product = multiply.multiply(a, b);
        System.out.println(a + " * " + b + " = " + product);
    }
}
