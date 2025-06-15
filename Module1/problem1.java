package Module1;
import java.util.Random;
import java.util.Scanner;
import java.util.prefs.PreferenceChangeEvent;

public class problem1{
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] array;
        int arraySize;
        int upperLimit;
        int lowerLimit;
        Random numberGen = new Random();
        int i;
        problem1 arrayThings = new problem1();

        System.out.println("Please enter the size of the array: ");
        arraySize = scnr.nextInt();
        array = new int[arraySize];

        System.out.println("Please enter the lower limit of the range for data: ");
        lowerLimit = scnr.nextInt();
        System.out.println("Please enter the upper limit of the range for data: ");
        upperLimit = scnr.nextInt();

        for (i = 0; i < arraySize; ++i) {
            array[i] = numberGen.nextInt((upperLimit - lowerLimit) + 1) + lowerLimit;
        }

        System.out.println();
        System.out.println("The original array is:");
        System.out.println(arrayThings.getArrayAsString(array));
        System.out.println();
        System.out.println("The average value for the array is: " + arrayThings.getArrayAverage(array));
        System.out.println();
        System.out.println("The number of odd values in the array is: " + arrayThings.getOddsInArray(array));
        System.out.println();
        System.out.println("The second maximum value in the array is: " + arrayThings.getSecondHighest(array));
        System.out.println();
        System.out.println("The number of peaks in the array is: " + arrayThings.getPeaks(array));
        System.out.println();
        System.out.println("The array contating squares of values in the original array is:");
        System.out.println(arrayThings.getArrayAsString(arrayThings.getSquareArray(array)));
    }

    public String getArrayAsString(int[] array) {
        String arrayAsString = "";
        int i;
        int arraySize = array.length;
        for (i = 0; i < arraySize; ++i) {
            arrayAsString = arrayAsString + array[i] + "  ";
        }
        return arrayAsString;
    }

    public double getArrayAverage(int[] array) {
        double average = 0;
        int i;
        int arraySize = array.length;
        for (i = 0; i < arraySize; ++i) {
            average += array[i];
            if (i + 1 == arraySize) {
                average /= i + 1;
            }
        }
        return average;
    }

    public int getOddsInArray(int[] array) {
        int odds = 0;
        int i;
        int arraySize = array.length;
        for (i = 0; i < arraySize; ++i) {
            if (array[i] % 2 == 1) {
                ++odds;
            }
        }
        return odds;
    }

    public int getSecondHighest(int[] array) {
        int highest = 0;
        int secondHighest = 0;
        int i;
        int arraySize = array.length;
        for (i = 0; i < arraySize; ++i) {
            if (array[i] > highest) {
                highest = array[i];
            }
            if (array[i] > secondHighest && array[i] < highest) {
                secondHighest = array[i];
            }
        }
        return secondHighest;
    }

    public int[] getSquareArray(int[] array) {
        int[] squares;
        int i;
        int arraySize = array.length;
        squares = new int[arraySize];
        for (i = 0; i < arraySize; ++i) {
            squares[i] = array[i] * array[i];
        }
        return squares;
    }

    public int getPeaks(int[] array) {
        int peaks = 0;
        int i;
        int arraySize = array.length;
        for (i = 0; i < arraySize; ++i) {
            if (i > 0 && i < arraySize - 1) {
                if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                    ++peaks;
                }
            }
        }
        return peaks;
    }
}