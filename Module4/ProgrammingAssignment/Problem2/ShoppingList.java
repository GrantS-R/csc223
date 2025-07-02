package Module4.ProgrammingAssignment.Problem2;

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
            list[this.indexOf(item)].setQuantity(list[this.indexOf(item)].getQuantity() + item.getQuantity());
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
            System.out.println("the item does not exist in the list");
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

    public boolean isFull() {
        return numberOfItems == list.length;
    }

    public boolean isEmpty() {
        return numberOfItems == 0;
    }

    public int size() {
        return numberOfItems;
    }

    public int totalItems() {
        int returnVal = 0;
        for (int i = 0; i < this.size(); i++) {
            returnVal += list[i].getQuantity();
        }
        return returnVal;
    }

    public double grandTotal() {
        double returnVal = 0;
        for (int i = 0; i < this.size(); i++) {
            returnVal += list[i].getQuantity() * list[i].getUnitPrice();
        }
        return returnVal;
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
        int idx = 0;
        String cattegory = "";
        while (idx < this.size()) {
            cattegory = list[idx].getCattegory();
            System.out.println(cattegory + ":");
            int slot = 1;
            while (cattegory.equals(list[idx].getCattegory())) {
                System.out.println(slot + ". " + list[idx].toString());
                slot++;
                idx++;
                if (idx >= this.size()) {
                    break;
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Number of items: " + this.totalItems() + "      Grand total: $" + this.grandTotal());
    }
}
