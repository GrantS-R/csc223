package Module5.ProgrammingAssignments.Stacks.Problem1;

import java.util.Scanner;

public class reverseCharactersDriver {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scnr.nextLine();

        System.out.println("\nInitial sentence:");
        System.out.println(sentence);

        System.out.println("\nSentence with reversed characters in each word:");
        System.out.println(ReverseCharacters.reverseWords(sentence));
        scnr.close();
    }
}
