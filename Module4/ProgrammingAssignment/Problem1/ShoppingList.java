package Module4.ProgrammingAssignment.Problem1;

public class ShoppingList {
    private Item[] list;
    private int numberOfItems;

    public ShoppingList(int initialSize) {
        list = new Item[initialSize];
    }

    public void insert(Item item) {
        if (item == null) {
            return;
        }

        if (this.indexOf(item) != -1) {
            list[this.indexOf(item)].setQuantity(item.getQuantity() + list[this.indexOf(item)].getQuantity());
            return;
        }

        if (this.isFull()) {
            this.doubling();
        }

        if (this.isEmpty()) {
            list[0] = item;
            numberOfItems++;
            return;
        }

        if (item.getQuantity() < 0) {
            item.setQuantity(item.getQuantity() * -1);
        }

        if (item.getUnitPrice() < 0) {
            item.setUnitPrice(item.getUnitPrice() * -1);
        }

        int idx = 0;
        while (idx < this.size() && item.compareTo(list[idx]) > 0) {
            idx++;
        }

        for (int i = this.size(); i > idx; i--) {
            list[i] = list[i - 1];
        }

        list[idx] = item;
        numberOfItems++;
    }

    public void remove(Item item) {
        int idx = this.indexOf(item);
        if (idx == -1) {
            System.out.println("Item " + item.toString() + " not found.");
            return;
        }

        for (int i = idx; i < this.size() - 1; i++) {
            list[i] = list[i + 1];
        }

        numberOfItems--;
    }

    public void remove (String name) {
        int idx = this.indexOf(name);
        if (idx == -1) {
            System.out.println("Item with the name " + name + " not found.");
            return;
        }

        for (int i = idx; i < this.size() - 1; i++) {
            list[i] = list[i + 1];
        }

        numberOfItems--;
    }

    private void doubling() {
        Item[] temp = new Item[list.length * 2];
        for (int i = 0; i < list.length; i++) {
            temp[i] = list[i];
        }
        list = temp;
    }

    public int indexOf(Item item) {
        for (int i = 0; i < numberOfItems; i++) {
            if (list[i].compareTo(item) == 0) {
                return i;
            }
        }
        return -1;
    }

    public int indexOf(String name) {
        name = name.toLowerCase();
        for (int i = 0; i < numberOfItems; i++) {
            if (list[i].getName().toLowerCase().compareTo(name) == 0) {
                return i;
            }
        }
        return -1;
    }

    public boolean isFull() {
        return numberOfItems == list.length;
    }

    public boolean isEmpty() {
        return numberOfItems == 0;
    }

    public int size() {
        return numberOfItems;
    }

    public void printNames() {
        System.out.print("[");
        for (int i = 0; i < numberOfItems; i++) {
            System.out.print(list[i].getName());
            if (i < numberOfItems - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public void print() {
        for (int i = 0; i < numberOfItems; i++) {
            System.out.println((i+1) + ". " + list[i].toString());
        }
    }
}
