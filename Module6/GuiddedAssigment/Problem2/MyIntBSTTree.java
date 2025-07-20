package Module6.GuiddedAssigment.Problem2;

import java.util.*;

public class MyIntBSTTree {
    private Node root;

    public MyIntBSTTree() {
        root = null;
    }

    public int height() {
        return heightHelper(root);
    }

    private int heightHelper(Node node) {
        if (node == null) {
            return -1;
        }
        int leftHeight = heightHelper(node.getLeft());
        int rightHeight = heightHelper(node.getRight());
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public Node[] inOrderArray() {
        List<Node> nodeList = new ArrayList<>();
        inOrderCollect(root, nodeList);
        return nodeList.toArray(new Node[0]);
    }

    private void inOrderCollect(Node node, List<Node> list) {
        if (node == null) {
            return;
        }
        inOrderCollect(node.getLeft(), list);
        list.add(new Node(node.getData()));
        inOrderCollect(node.getRight(), list);
    }

    public MyIntBSTTree balance() {
        Node[] sortedNodes = inOrderArray();
        MyIntBSTTree newTree = new MyIntBSTTree();
        newTree.root = buildBalancedFromArray(sortedNodes, 0, sortedNodes.length - 1);
        return newTree;
    }

    private Node buildBalancedFromArray(Node[] arr, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        Node node = new Node(arr[mid].getData());
        node.setLeft(buildBalancedFromArray(arr, start, mid - 1));
        node.setRight(buildBalancedFromArray(arr, mid + 1, end));
        return node;
    }

    public void add(int data) {
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

    public void display() {
        displayHelper(root, 0);
    }

    private void displayHelper(Node t, int level) {
        if (t == null) {
            return;
        }

        displayHelper(t.getRight(), level + 1);
        for (int k = 0; k < level; k++) {
            System.out.print("\t");
        }
        System.out.println(t.getData());
        displayHelper(t.getLeft(), level + 1);
    }

    public int size() {
        return sizeHelper(root);
    }

    private int sizeHelper(Node node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + sizeHelper(node.getLeft()) + sizeHelper(node.getRight());
        }
    }
}
