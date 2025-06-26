package Module3.GuidedAssignment;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MergeSort {
    public static void mergeSort(int[] arr) {
        mergeSortRec(arr, 0, arr.length - 1);
    }

    private static void mergeSortRec(int[] arr, int first, int last) {
        if (first < last) {
            int mid = (first + last) / 2;
            mergeSortRec(arr, first, mid);
            mergeSortRec(arr, mid + 1, last);
            merge(arr, first, mid, mid + 1, last);
        }
    }

    private static void merge(int[] arr, int leftFirst, int leftLast, int rightFirst, int rightLast) {
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
        int N = scnr.nextInt();
        int A = scnr.nextInt();
        int B = scnr.nextInt();
        int[] integers = new int[N];
        System.out.println("An int array of length " + N + " where each value is between " + A + " and " + B + " is created. That array is: ");
        for (int i = 0; i < N; i++) {
            integers[i] = ThreadLocalRandom.current().nextInt(A, B);
            if (i + 1 != N) {
                System.out.print(integers[i] + ", ");
            } else {
                System.out.println(integers[i]);
            }
        }
        boolean sorted = isSorted(integers);
        System.out.println("The array is being sorted...");
        long startTime = System.currentTimeMillis();
        while (!sorted) {
            mergeSort(integers);
            sorted = isSorted(integers);
        }
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        System.out.print("The sorted array is: ");
        for (int i = 0; i < N; i++) {
            if (i + 1 != N) {
                System.out.print(integers[i] + ", ");
            } else {
                System.out.println(integers[i]);
            }
        }
        System.out.println("That took " + totalTime + " milliseconds to sort.");
        scnr.close();
    }
}
