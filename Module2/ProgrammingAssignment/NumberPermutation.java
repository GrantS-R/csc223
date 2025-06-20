package Module2.ProgrammingAssignment;

import java.util.ArrayList;
import java.util.Collections;

public class NumberPermutation {
    public static void printPermutations(int length) {
        char[] oddDigits = {'1', '3', '5', '7', '9'};
        ArrayList<String> results = new ArrayList<String>();

        // Local recursive helper using an inner class
        class Recurse {
            void generate(String current) {
                if (current.length() == length) {
                    results.add(current);
                    return;
                }
                for (char d : oddDigits) {
                    generate(current + d);
                }
            }
        }

        if (length > 0) {
            new Recurse().generate("");
            Collections.sort(results);
            for (String s : results) {
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        printPermutations(n);
    }
}
