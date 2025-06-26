package Module3.ProgrammingAssignment;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

// The instructions said selection sor, despite this being a merge sort. I followed the instructions for the naming of the file and method.
public class SelectionSortPA {
    public static void selectionSort(int[] arr) {
        selectionSortRec(arr, 0, arr.length - 1);
    }

    private static void selectionSortRec(int[] arr, int first, int last) {
        if (first < last) {
            int mid = (first + last) / 2;
            selectionSortRec(arr, first, mid);
            selectionSortRec(arr, mid + 1, last);
            select(arr, first, mid, mid + 1, last);
        }
    }

    private static void select(int[] arr, int leftFirst, int leftLast, int rightFirst, int rightLast) {
        int[] aux = new int[arr.length];
        int index = leftFirst;
        int saveFirst = leftFirst;

        while (leftFirst <= leftLast && rightFirst <= rightLast) {
            if (arr[leftFirst] <= arr[rightFirst]) {
                aux[index++] = arr[leftFirst++];
            } else {
                aux[index++] = arr[rightFirst++];
            }
        }

        while (leftFirst <= leftLast) {
            aux[index++] = arr[leftFirst++];
        }

        while  (rightFirst <= rightLast) {
            aux[index++] = arr[rightFirst++];
        }

        for (index = saveFirst; index <= rightLast; index++) {
            arr[index] = aux[index];
        }

        printArray(arr);
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
    
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i + 1 != arr.length) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int N = scnr.nextInt();
        int[] integers = new int[N];
        for (int i = 0; i < N; i++) {
            integers[i] = ThreadLocalRandom.current().nextInt(0, Integer.MAX_VALUE);
        }
        System.out.println("Array with length " + N + " has been created. It is:");
        printArray(integers);
        System.out.println();

        boolean sorted = isSorted(integers);
        System.out.println("Is the array sorted? " + sorted);
        System.out.println();

        while (!sorted) {
            selectionSort(integers);
            sorted = isSorted(integers);
        }
        System.out.println();

        System.out.println("The array is sorted after calling Selection Sort");
        printArray(integers);
        scnr.close();
    }
}
