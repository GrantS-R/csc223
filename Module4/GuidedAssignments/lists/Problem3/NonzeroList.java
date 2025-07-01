package Module4.GuidedAssignments.lists.Problem3;

public class NonzeroList {
    private int[] data;
    private int index;
    private int numberOfElements;

    public NonzeroList(int cap) {
        data = new int[cap];
        index = 0;
        numberOfElements = 0;
    }

    public void add(int num) {
        if (this.isFull()) {
            System.out.println("The NonzeroList is full.");
            return;
        }

        if (num == 0) {
            System.out.println("0 is not allowed in a NonzeroList.");
            return;
        }

        if (this.indexOf(num) != -1) {
            System.out.println("This number is in the list. A duplicated number can't be added to the list.");
            return;
        }

        if (this.isEmpty()) {
            data[0] = num;
            numberOfElements++;
            return;
        }

        int idx = 0;
        while (idx < numberOfElements && data[idx] < num) {
            idx++;
        }

        for (int i = numberOfElements; i > idx; i--) {
            data[i] = data[i - 1];
        }

        data[idx] = num;
        numberOfElements++;
    }

    public void remove(int target) {
        int idx = this.indexOf(target);
        if (idx == -1) {
            System.out.println("Target value does not exist.");
            return;
        }

        for (int i = idx; i < numberOfElements - 1; i++) {
            data[i] = data[i + 1];
        }
        --numberOfElements;
    }

    public void removeAll() {
        while (!this.isEmpty()) {
            this.remove(data[0]);
        }
    }

    public int indexOf(int target) {
        for (int i = 0; i < numberOfElements; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public boolean isFull() {
        return numberOfElements == data.length;
    }

    public boolean isEmpty() {
        return numberOfElements == 0;
    }

    public int size() {
        return numberOfElements;
    }

    public void print() {
        System.out.print("[");
        for (int i = 0; i < numberOfElements; i++) {
            System.out.print(data[i]);
            if (i < numberOfElements - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
