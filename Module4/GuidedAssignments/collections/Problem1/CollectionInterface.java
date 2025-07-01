package Module4.GuidedAssignments.collections.Problem1;

public interface CollectionInterface<T> {
    void add(T ele);
    void add(T ele, int index);
    T get(T ele);
    T get(int index);
    boolean contains(T ele);
    int remove(T ele);
    boolean remove(int index);
    int indexOf(T ele);
    boolean isFull();
    boolean isEmpty();
    int size();
    void print();
}
