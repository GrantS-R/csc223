package Module6.GuiddedAssigment.Problem2;

public class Node {
    private int data;
    private Node left;
    private Node right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }

    public int getData() {
        return data;
    }

    public Node getLeft() {
        return left;
    }
    
    public Node getRight() {
        return right;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
