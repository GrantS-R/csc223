package Module3.DiscussionBoard;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class EvaluateGCFAlgorithm {
    public static int gcf1(int a, int b) {
        if (Math.abs(a) == Math.abs(b)) {
            return Math.abs(a);
        } 
        if (a * b == 0) {
            return Math.abs(a + b);
        }
        return gcf1(a % b, b % a);
    }

    public static int gcf2(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        int temp = a;
        if (a == b) {
            return a;
        }
        if (a * b == 0) {
            return a + b;
        }
        while (a * b != 0) {
            temp = a;
            a = a % b;
            b = b % temp;
        }
        return a + b;
    }

    public static int gcf3(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == b) {
            return a;
        }
        if (a * b == 0) {
            return a + b;
        }
        while (a * b != 0) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return b + a;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String outputFileName = "results.txt";
        FileOutputStream fos = new FileOutputStream(outputFileName);
        PrintWriter writer = new PrintWriter(fos);

        writer.println("a, b | gcf1 | gcf2 | gcf3");
        System.out.println("Input 2 numbers you want to find the gcf of");
        int a = scnr.nextInt();
        int b = scnr.nextInt();

        long startTimeA = System.currentTimeMillis();
        int gcfa = gcf1(a, b);
        long stopTimeA = System.currentTimeMillis();
        long totalTimeA = stopTimeA - startTimeA;
        
        long startTimeB = System.currentTimeMillis();
        int gcfb = gcf2(a, b);
        long stopTimeB = System.currentTimeMillis();
        long totalTimeB = stopTimeB - startTimeB;

        long startTimeC = System.currentTimeMillis();
        int gcfc = gcf3(a, b);
        long stopTimeC = System.currentTimeMillis();
        long totalTimeC = stopTimeC - startTimeC;

        writer.println(a + ", " + b + " | " + totalTimeA + " | " + totalTimeB + " | " + totalTimeC);
        System.out.println("The 3 gcf algothims returned " + gcfa + ", " + gcfb + ", and " + gcfc);
        System.out.println();

        System.out.println("Input 2 numbers you want to find the gcf of");
        a = scnr.nextInt();
        b = scnr.nextInt();

        startTimeA = System.currentTimeMillis();
        gcfa = gcf1(a, b);
        stopTimeA = System.currentTimeMillis();
        totalTimeA = stopTimeA - startTimeA;

        startTimeB = System.currentTimeMillis();
        gcfb = gcf2(a, b);
        stopTimeB = System.currentTimeMillis();
        totalTimeB = stopTimeB - startTimeB;

        startTimeC = System.currentTimeMillis();
        gcfc = gcf3(a, b);
        stopTimeC = System.currentTimeMillis();
        totalTimeC = stopTimeC - startTimeC;

        writer.println(a + ", " + b + " | " + totalTimeA + " | " + totalTimeB + " | " + totalTimeC);
        System.out.println("The 3 gcf algothims returned " + gcfa + ", " + gcfb + ", and " + gcfc);

        scnr.close();
        writer.close();
    }
}
