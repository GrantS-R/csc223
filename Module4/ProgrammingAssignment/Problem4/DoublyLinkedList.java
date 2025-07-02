package Module4.ProgrammingAssignment.Problem4;

public class DoublyLinkedList<String> {
    private ListNode<String> head;
    private ListNode<String> current;
    private ListNode<String> tail;
    private boolean forward;

    public DoublyLinkedList() {
        head = null;
        current = null;
        tail = null;
    }

    public int length() {
        int count = 0;
        ListNode<String> itteration = head;
        while (itteration != null) {
            count++;
            itteration = itteration.getLink();
        }
        return count;
    }

    public void addANodeToStart(String addData) {
        if (this.length() == 0) {
            head = new ListNode(addData, null, null);
            tail = head;
            current = head;
            return;
        }
        head.setPrevious(new ListNode(addData, head, null));
        head = head.getPrevious();
    }

    public void addANodeToEnd(String addData) {
        if (this.length() == 0) {
            head = new ListNode(addData, null, null);
            tail = head;
            current = head;
            return;
        }
        tail.setLink(new ListNode(addData, null, tail));
        tail = tail.getLink();
    }

    public String getDataAtCurrent() {
        return current.getData();
    }

    public void resetIteration() {
        current = head;
    }

    public boolean moreToIterate() {
        if (current.getLink() == null) {
            return false;
        } else {
            return true;
        }
    }

    public void goToNext() {
        if (!this.moreToIterate()) {
            return;
        }
        forward = true;
        current = current.getLink();
    }

    public void goToEnd() {
        forward = true;
        current = tail;
    }

    public void resetIterationReverse() {
        if (forward) {
            if (current.getPrevious() == null) {
                return;
            }
            current = current.getPrevious();
        } else {
            if (current.getLink() == null) {
                return;
            }
            current = current.getLink();
        }
    }

    public void goToPrevious() {
        if (this.length() == 0) {
            return;
        } else if (current.getPrevious() == null) {
            return;
        }
        forward = false;
        current = current.getPrevious();
    }

    public void insertNodeAfterCurrent(String newData) {
        current.setLink(new ListNode(newData, current.getLink(), current));
        current.getLink().getLink().setPrevious(current.getLink());
    }

    public void deleteCurrentNode() {
        current.getLink().setPrevious(current.getPrevious());
        current.getPrevious().setLink(current.getLink());
        current = current.getLink();
    }

    public void deleteHeadNode() {
        head = head.getLink();
        head.setPrevious(null);
    }

    public void deleteTailNode() {
        tail = tail.getPrevious();
        tail.setLink(null);
    }

    public boolean findInList(String target) {
        ListNode<String> cur = head;
        while (cur != null) {
            if (cur.getData().equals(target)) {
                current = cur;
                return true;
            }
            cur = cur.getLink();
        }
        current = null;
        return false;
    }

    public boolean onList(String target) {
        ListNode<String> cur = head;
        while (cur != null) {
            if (cur.getData().equals(target)) {
                return true;
            }
            cur = cur.getLink();
        }
        return false;
    }

    private ListNode<String> Find(String target) {
        ListNode<String> cur = head;
        while (cur != null) {
            if (cur.getData().equals(target)) {
                return cur;
            }
            cur = cur.getLink();
        }
        return null;
    }

    public void showList() {
        ListNode<String> cur = head;
        while (cur != null) {
            System.out.print(cur.getData());
            if (cur.getLink() != null) {
                System.out.print(", ");
            }
            cur = cur.getLink();
        }
        System.out.println();
    }

    public void showListState() {
        System.out.println("Head: " + (head == null ? "null" : head.data) + " Current: " + (current == null ? "null" : current.data) + " Tail: " + (tail == null ? "null" : tail.data) + " " + this.length() + " items");
    }

    public class ListNode<String> {
        String data;
        ListNode<String> link;
        ListNode<String> previous;

        public ListNode() {
            data = null;
            link = null;
            previous = null;
        }

        public ListNode(String newData, ListNode<String> linkValue, ListNode<String> previousValue) {
            data = newData;
            link = linkValue;
            previous = previousValue;
        }

        public void setData(String newData) {
            data = newData;
        }

        public String getData() {
            return data;
        }

        public void setLink(ListNode<String> newLink) {
            link = newLink;
        }

        public void setPrevious(ListNode<String> newPrevious) {
            previous = newPrevious;
        }

        public ListNode<String> getLink() {
            return link;
        }

        public ListNode<String> getPrevious() {
            return previous;
        }
    }
}
