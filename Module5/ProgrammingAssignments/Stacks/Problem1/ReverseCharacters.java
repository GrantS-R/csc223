package Module5.ProgrammingAssignments.Stacks.Problem1;

public class ReverseCharacters {
    public static String reverseWords (String sentance) {
        String[] words = sentance.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            ArrayBasedStack stack = new ArrayBasedStack(word.length());
            for (char c : word.toCharArray()) {
                stack.push(c);
            }
            while (!stack.isEmpty()) {
                result.append(stack.pop());
            }
            result.append(" ");
        }
        return result.toString().trim();
    }
}
