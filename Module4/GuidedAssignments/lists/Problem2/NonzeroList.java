package Module4.GuidedAssignments.lists.Problem2;

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

        data[index] = num;
        numberOfElements++;
        index++;
    }

    public void removeData(int target) {
        if (this.indexOf(target) == -1) {
            System.out.println("Target value does not exist.");
            return;
        }
        
        --index;
        data[this.indexOf(target)] = data[index];
        data[index] = 0;
        --numberOfElements;
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
