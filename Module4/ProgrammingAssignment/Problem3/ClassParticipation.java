package Module4.ProgrammingAssignment.Problem3;

import java.util.HashSet;

public class ClassParticipation {
    private class Node {
        String value;
        Node next;

        Node(String val) {
            value = val;
            next = null;
        }
    }

    Node first;
    Node last;

    public ClassParticipation() {
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
            return;
        }
        last.next = new Node(e);
        last = last.next;
    }

    public int getCount(String name) {
        int contributions = 0;
        Node node = first;
        while (node != null) {
            if (node.value.equals(name)) {
                contributions++;
            }
            node = node.next;
        }
        return contributions;
    }

    public String getReport() {
        StringBuilder report = new StringBuilder();
        Node node = first;
        HashSet<String> seen = new HashSet<>();
        while (node != null) {
            if (!seen.contains(node.value)) {
                report.append(node.value + " has count " + getCount(node.value) + "\n");
                seen.add(node.value);
            }
            node = node.next;
        }
        return report.toString();
    }
}
