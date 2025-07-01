package Module4.GuidedAssignments.collections.Problem1;

public class CollectionTDriver {
    public static void main(String[] args) {
        CollectionT<String> collection = new CollectionT<String>(5);
        System.out.println("Before adding any items, the collection is empty: " + collection.isEmpty());
        collection.add("A");
        collection.add("B");
        collection.add("C");
        collection.print();
        collection.add("Z", 0);
        collection.add("E");
        collection.print();
        System.out.println("Collection size = " + collection.size());
        System.out.println("The collection is full: " + collection.isFull());
        collection.add("D", 3);
        collection.add("D", 3);
        System.out.println("The collection is full: " + collection.isFull());
        collection.print();
        collection.remove(5);
        collection.print();
        collection.remove("D");
        collection.print();
    }
}
