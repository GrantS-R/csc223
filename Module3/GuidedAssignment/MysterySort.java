package Module3.GuidedAssignment;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MysterySort {
    public static void mysterySort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr.length - i - 1; k++) {
                if (arr[k] > arr[k + 1]) {
                    int hold = arr[k + 1];
                    arr[k + 1] = arr[k];
                    arr[k] = hold;
                }
            }
        }
    }

    public static Boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int size = scnr.nextInt();
        int[] integers = new int[size];
        for (int i = 0; i < size; i++) {
            integers[i] = ThreadLocalRandom.current().nextInt(0, Integer.MAX_VALUE);
        }
        Boolean sorted = isSorted(integers);
        System.out.println("A list of length " + size + " of random numbers from 0 to " + Integer.MAX_VALUE + " has been generated. That list is: ");
        for (int i = 0; i < size; i++) {
            if (i + 1 == size) {
                System.out.println(integers[i]);
            } else {
                System.out.print(integers[i] + ", ");
            }
        }
        if (sorted) {
            System.out.println("This array is sorted");
        } else {
            System.out.println("Sorting array...");
            while (!sorted) {
                mysterySort(integers);
                sorted = isSorted(integers);
            }
            System.out.println("The array has been sorted.");
            System.out.print("The new array is: ");
            for (int i = 0; i < size; i++) {
                if (i + 1 == size) {
                    System.out.println(integers[i]);
                } else {
                    System.out.print(integers[i] + ", ");
                }
            }
        }
        scnr.close();
    }
}
