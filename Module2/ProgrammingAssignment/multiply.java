package Module2.ProgrammingAssignment;

public class multiply {
    public static int multiply(int a, int b) {
        int result = 0;
        int i;
        for (i = 0; i < b; i++) {
            result += a;
        }
        return result;
    }
}
