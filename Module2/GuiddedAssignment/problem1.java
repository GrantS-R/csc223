package Module2.GuiddedAssignment;

import java.util.Scanner;

public class problem1 {
    public static int multiplication(int a, int b) {
        if (a > 0) {
            return b + multiplication(a - 1, b);
        } else {
            return a;
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Input the first number to be multiplied: ");
        int int1 = scnr.nextInt();
        System.out.println();
        System.out.print("Input the second number to be multiplied: ");
        int int2 = scnr.nextInt();
        System.out.println();
        System.out.println(int1 + " * " + int2 + " = " + multiplication(int1, int2));
    }
}
