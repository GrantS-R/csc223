package Module5.ProgrammingAssignments.Stacks.Problem2;

import java.util.Random;

public class pezCandyDriver {
    public static void main(String[] args) {
        String[] colors = {"red", "yellow", "green", "pink", "blue"};
        Random rand = new Random();
        pezCandy pez = new pezCandy(12);

        for (int i = 0; i < 12; i++) {
            String color = colors[rand.nextInt(colors.length)];
            pez.push(color);
        }

        System.out.print("Initial Pez dispenser: ");
        pez.printStack();

        pezCandy tempStack = new pezCandy(12);
        while (!pez.isEmpty()) {
            String candy = pez.pop();
            if (!"red".equals(candy)) {
                tempStack.push(candy);
            }
        }

        while (!tempStack.isEmpty()) {
            pez.push(tempStack.pop());
        }

        System.out.print("Pez dispenser after eating all red candies: ");
        pez.printStack();
    }
}
