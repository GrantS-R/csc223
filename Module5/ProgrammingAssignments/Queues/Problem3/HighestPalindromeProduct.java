package Module5.ProgrammingAssignments.Queues.Problem3;

public class HighestPalindromeProduct {
    public static void main(String[] args) {
        NumericPalindrome palindromeChecker = new NumericPalindrome();
        int maxPalindrome = 0;
        int f1 = 0;
        int f2 = 0;

        for (int i = 99; i >= 10; i--) {
            for (int j = i; j >= 10; j--) {
                int product = i * j;
                if (palindromeChecker.isPalindrome(product) && product > maxPalindrome) {
                    maxPalindrome = product;
                    f1 = i;
                    f2 = j;
                }
            }
        }
        System.out.printf("%dx%d=%d\tis maximum palindrome product of two two-digit numbers\n", f1, f2, maxPalindrome);
    }
}
