package Module3.ProgrammingAssignment;

import java.util.ArrayList;
import java.util.Scanner;

public class KeypadArrangement {
    public static int minimalKeyStrokes(int[] frequencies, int[] keyLimits) {
        int numKeys = keyLimits.length;
        int totalSlots = 0;
        for (int limit : keyLimits) {
            totalSlots += limit;
        }

        if (frequencies.length > totalSlots) {
            return -1;
        }

        sortArrayDecending(frequencies);

        ArrayList<Integer> keySlots = new ArrayList<>();
        for (int presses = 1; ; presses++) {
            boolean added = false;
            for (int key = 0; key < numKeys; key++) {
                if (keyLimits[key] >= presses) {
                    keySlots.add(presses);
                    added = true;
                }
            }
            if (!added) {
                break;
            }
        }
        if (frequencies.length > keySlots.size()) {
            return -1;
        }

        int totalStrokes = 0;
        for (int i = 0; i < frequencies.length; i++) {
            totalStrokes += frequencies[i] * keySlots.get(i);
        }
        return totalStrokes;
    }

    public static void sortArrayDecending(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }
    }

    public static String keyPadArrangement(int[] frequencies, int[] keyLimits, char[] letters) {
        int numOfKeys = frequencies.length;
        int numOfLimits = keyLimits.length;

        class Pair {
            int freq;
            char letter;
            Pair(int f, char l) { freq = f; letter = l; }
        }

        Pair[] pairs = new Pair[numOfKeys];
        for (int i = 0; i < numOfKeys; i++) {
            pairs[i] = new Pair(frequencies[i], letters[i]);
        }

        for (int i = 0; i < numOfKeys - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < numOfKeys; j++) {
                if (pairs[j].freq > pairs[maxIndex].freq) {
                    maxIndex = j;
                }
            }
            Pair temp = pairs[i];
            pairs[i] = pairs[maxIndex];
            pairs[maxIndex] = temp;
        }

        ArrayList<int[]> slots = new ArrayList<>();
        for (int press = 1; ; press++) {
            boolean added = false;
            for (int key = 0; key < numOfLimits; key++) {
                if (keyLimits[key] >= press) {
                    slots.add(new int[]{key, press});
                    added = true;
                }
            }
            if (!added) break;
        }
        if (slots.size() < numOfKeys) {
            return "";
        }

        StringBuilder[] keyArrangements = new StringBuilder[numOfLimits];
        for (int i = 0; i < numOfLimits; i++) {
            keyArrangements[i] = new StringBuilder();
        }
        for (int i = 0; i < numOfKeys; i++) {
            int keyIndex = slots.get(i)[0];
            keyArrangements[keyIndex].append(pairs[i].letter);
        }

        StringBuilder arrangement = new StringBuilder();
        for (int i = 0; i < numOfLimits; i++) {
            arrangement.append('[');
            arrangement.append(keyArrangements[i].toString());
            arrangement.append(']');
        }
        return arrangement.toString();
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numOfKeys = scnr.nextInt();
        int numOfPossibleReppetitions = scnr.nextInt();
        int[] frequencies = new int[numOfKeys];
        for (int i = 0; i < numOfKeys; i++) {
            frequencies[i] = scnr.nextInt();
        }
        int[] frequenciesCopy = frequencies;
        int[] reppetitions = new int[numOfPossibleReppetitions];
        for (int i = 0; i < numOfPossibleReppetitions; i++) {
            reppetitions[i] = scnr.nextInt();
        }
        int[] reppetitionsCopy = reppetitions;

        int minKeyStrokes = minimalKeyStrokes(frequencies, reppetitions);
        System.out.println("The minimal number of keystrokes based on the passed values is " + minKeyStrokes);
        
        System.out.println();
        char[] letters = new char[numOfKeys];
        for (int i = 0; i < numOfKeys; i++) {
            letters[i] = scnr.next().charAt(0);
        }
        String arrangement = keyPadArrangement(frequenciesCopy, reppetitionsCopy, letters);
        System.out.println("The ideal arangement for those characters, based on the numbers already provided, is: ");
        System.out.println(arrangement);
        scnr.close();
    }
}
