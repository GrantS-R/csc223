package Module6.GuiddedAssigment.Problem1;

public class GA1Driver {
    public static void main(String[] args) {
        MyIntBSTTree tree = new MyIntBSTTree();

        tree.add(8);
        tree.add(30);
        tree.add(28);
        tree.add(12);
        tree.add(1);
        tree.add(6);

        System.out.println("Number of elements: " + tree.size());
        tree.printInOrder();
    }
}
