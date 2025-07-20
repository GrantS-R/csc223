package Module6.GuiddedAssigment.Problem1;

import java.util.*;

public class MyIntBSTTree {
    private Node root;

    public MyIntBSTTree() {
        root = null;
    }

    public int size() {
        if (root == null) {
            return 0;
        }

        int count = 0;
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);

        while(!queue.isEmpty()) {
            Node current = queue.poll();
            count++;

            if (current.getLeft() != null) {
                queue.add(current.getLeft());
            }
            if (current.getRight() != null) {
                queue.add(current.getRight());
            }
        }
        return count;
    }

    public void add (int data) {
        root = addHelper(root, data);
    }

    private Node addHelper(Node node, int data) {
        if (node == null) {
            node = new Node(data);
        } else if (data <= node.getData()) {
            node.setLeft(addHelper(node.getLeft(), data));
        } else {
            node.setRight(addHelper(node.getRight(), data));
        }

        return node;
    }

    public void printInOrder() {
        List<Integer> result = new ArrayList<>();
        inOrderHelper(root, result);
        System.out.println(result);
    }

    private void inOrderHelper(Node node, List<Integer> list) {
        if (node == null) {
            return;
        }

        inOrderHelper(node.getLeft(), list);
        list.add(node.getData());
        inOrderHelper(node.getRight(), list);
    }
}
