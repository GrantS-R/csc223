package Module5.ProgrammingAssignments.Queues.Problem2;

import java.util.Random;
import java.util.Scanner;

//Important note: depending on what you are using, it may appear as though the spaces are not being encoded. that is because they can end up being non-printable aski values, which some fonts, editors, or computers will show as a block with a ? in it, while others will not show anything, not even whitespace. This code does work, and it does include whitespace, even if it doesn't look like it does. 

public class cipherDriver {
    public static void main(String[] args) {
        int keySize = 7;
        int keyMin = -10;
        int keyMax = 10;
        int[] keySet = new int[keySize];
        Random rand = new Random();

        for (int i = 0; i < keySize; i++) {
            keySet[i] = rand.nextInt(keyMax - keyMin + 1) + keyMin;
        }

        LinkQueue<Integer> encodeQueue = new LinkQueue<>();
        LinkQueue<Integer> decodeQueue = new LinkQueue<>();

        for (int i = 0; i < keySize; i++) {
            encodeQueue.enqueue(keySet[i]);
            decodeQueue.enqueue(keySet[i]);
        }

        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter a message to encode: ");
        String message = scnr.nextLine();

        //here and later on, the og means original and nog means not original. god i hate comments but i cant think of a better name atm//
        StringBuilder encoded = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            int key = encodeQueue.dequeue();
            encodeQueue.enqueue(key);
            char og = message.charAt(i);
            char nog = (char)(og + key);
            encoded.append(nog);
        }

        StringBuilder decoded = new StringBuilder();
        for (int i = 0; i < encoded.length(); i++) {
            int key = decodeQueue.dequeue();
            decodeQueue.enqueue(key);
            char nog = encoded.charAt(i);
            char og = (char)(nog - key);
            decoded.append(og);
        }

        System.out.print("Key set: ");
        for (int k : keySet) System.out.print(k + " ");System.out.println();
        System.out.println("Original message: " + message);
        System.out.println("Encoded message: " + encoded);
        System.out.println("Decoded message: " + decoded);
        scnr.close();
    }
}
