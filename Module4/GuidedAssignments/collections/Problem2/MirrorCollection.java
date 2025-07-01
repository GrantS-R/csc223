package Module4.GuidedAssignments.collections.Problem2;

public class MirrorCollection<T> {
    public static void main(String[] args) {
        CollectionInterface<Integer> col = new CollectionT<Integer>(5);
        col.add(9);
        col.add(3);
        col.add(5);
        col.print();

        CollectionInterface<Integer> res = new MirrorCollection().mirrorCollection(col);
        res.print();
    }

    public CollectionInterface<T> mirrorCollection(CollectionInterface<T> col) {
        CollectionInterface<T> res = new CollectionT(col.size() * 2);
        for (int i = 0; i < col.size(); i++) {
            res.add(col.get(i));
        }

        int i = res.size() - 1;
        while (!res.isFull() && i >= 0) {
            res.add(res.get(i));
            i--;
        }

        return res;
    }
}
