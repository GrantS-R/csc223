package Module4.ProgrammingAssignment.Problem4;

public class DoublyLinkedListDriver {
    public static void main(String[] args) {
        DoublyLinkedList<String> list = new DoublyLinkedList<String>();
        list.showListState();
        list.addANodeToStart("a");
        list.showListState();
        System.out.println("add node to start");
        list.addANodeToStart("z");
        list.showListState();
        System.out.println("add node to end");
        list.addANodeToEnd("c");
        list.showListState();
        System.out.println("add node to middle");
        list.insertNodeAfterCurrent("b");
        list.showList();
        list.goToNext();
        System.out.println("delete head node");
        list.deleteHeadNode();
        list.showListState();
        System.out.println("add node to end");
        list.addANodeToEnd("d");
        list.showList();
        System.out.println("delete current node");
        list.deleteCurrentNode();
        list.showListState();
        System.out.println("add node to start");
        list.addANodeToStart("z");
        System.out.println("iterate to end");
        list.goToEnd();
        list.showListState();
        System.out.println("iterate back");
        list.goToPrevious();
        list.showListState();
        System.out.println("delete tail node");
        list.deleteTailNode();
        list.showListState();
        System.out.println("a is in list: " + list.findInList("a"));
        System.out.println("b is in list: " + list.findInList("b"));
        list.showListState();
        list.showList();
    }
}
