package Module6.GuiddedAssigment.Problem2;

public class GA2Driver {
    public static void main(String[] args) {
        MyIntBSTTree tree = new MyIntBSTTree();

        tree.add(1);
        tree.add(3);
        tree.add(4);
        tree.add(12);
        tree.add(20);
        tree.add(26);
        tree.add(68);

        System.out.println("Before balancing:");
        System.out.println("Tree height: " + tree.height());
        tree.display();

        System.out.println("\n\nAfter balancing:");
        tree = tree.balance();
        System.out.println("Tree height: " + tree.height());
        tree.display();
    }
}
