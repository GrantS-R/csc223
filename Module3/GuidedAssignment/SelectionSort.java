package Module3.GuidedAssignment;

import java.util.Scanner;
import java.util.ArrayList;

public class SelectionSort {
    public static void selectionSort(ArrayList<Integer> integers) {
        int length = integers.size();
        for (int i = 0; i < length - 1; i++) {
            int minimum = i;
            for (int j = i + 1; j < length; j++) {
                if (integers.get(j) < integers.get(minimum)) {
                    minimum = j;
                }
            }
            int temp = integers.get(minimum);
            integers.set(minimum, integers.get(i));
            integers.set(i, temp);
        }
    }

    public static void printArrayList(ArrayList<Integer> integers) {
        int length = integers.size();
        for (int i = 0; i < length; i++) {
            if (i + 1 != length) {
                System.out.print(integers.get(i) + ", ");
            } else {
                System.out.println(integers.get(i));
            }
        }
    }

    public static Boolean isSorted(ArrayList<Integer> arr) {
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < arr.get(i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        ArrayList<Integer> integers = new ArrayList<Integer>();
        int integer = scnr.nextInt();
        while (integer >= 0) {
            integers.add(integer);
            integer = scnr.nextInt();
        }
        System.out.println();
        System.out.print("You have created the array list ");
        printArrayList(integers);
        boolean sorted = isSorted(integers);
        int sorts = 0;
        System.out.println();
        System.out.println("Sorting...");
        System.out.println();
        while (!sorted) {
            ++sorts;
            System.out.println("Running sort number " + sorts);
            selectionSort(integers);
            System.out.print("The array list is now ");
            printArrayList(integers);
            System.out.println();
            sorted = isSorted(integers);
        }
        System.out.println();
        System.out.println("All sorts complete");
        scnr.close();
    }
}
