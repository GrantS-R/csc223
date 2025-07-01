package Module4.GuidedAssignments.lists.Problem4;

public class ColorLinkedList {
    private class Node {
        String value;
        Node next;

        Node(String val, Node n) {
            value = val;
            next = n;
        }

        Node(String val) {
            value = val;
            next = null;
        }
    }

    private Node first;
    private Node last;

    public ColorLinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        if (first == null && last == null) {
            return true;
        }
        return false;
    }

    public int size() {
        int count = 0;
        Node p = first;
        while (p != null) {
            count++;
            p = p.next;
        }
        return count;
    }

    public void add(String e) {
        if (this.isEmpty()) {
            first = new Node(e);
            last = first;
        } else {
            last.next = new Node(e);
            last = last.next;
        }
    }

    public void add(int index, String e) throws IndexOutOfBoundsException{
        if (index > this.size()) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            first = new Node(e, first);
            if (this.isEmpty()) {
                last = first;
            }
            return;
        }
        if (index == this.size()) {
            last.next = new Node(e);
            last = last.next;
            return;
        }
        Node p = first;
        int i = 0;
        while (i < index - 1) {
            p = p.next;
            i++;
        }
        p.next = new Node(e, p.next);
    }

    public String toString() {
        StringBuilder strBuilder = new StringBuilder();
        Node p = first;
        while (p != null) {
            strBuilder.append(p.value + "\n");
            p = p.next;
        }
        return strBuilder.toString();
    }

    public Node remove(int index) throws IndexOutOfBoundsException{
        if (index >= this.size()) {
            throw new IndexOutOfBoundsException();
        }
        Node removed = first;
        if (index == 0) {
            first = first.next;
            return removed;
        }
        int i = 0;
        while (i < index - 1) {
            removed = removed.next;
            i++;
        }
        Node temp = removed;
        removed = removed.next;
        temp.next = removed.next;
        if (temp.next == null) {
            last = temp;
        }
        return removed;
    }
}
