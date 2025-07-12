package Module5.ProgrammingAssignments.Queues.Problem4;

public class StockTransaction implements QueueInterface {
    private static class node {
        Stock data;
        node next;
        node(Stock data) {
            this.data = data;
            next = null;
        }
    }

    private node front;
    private node rear;
    int size = 0;

    public StockTransaction() {
        front = null;
        rear = null;
    }

    public void enqueue(Stock element) {
        if (this.isEmpty()) {
            front = new node(element);
            rear = front;
        } else {
            rear.next = new node(element);
            rear = rear.next;
        }
        size++;
    }

    public Stock dequeue() {
        if (this.isEmpty()) {
            throw new QueueUnderflowException("Dequeue attempted on empty queue");
        } else {
            Stock returnVal = front.data;
            front = front.next;
            size--;
            return returnVal;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return false;
    }

    public int size() {
        return size;
    }

    public void buy(double cost, int quantity) {
        while (quantity > 0) {
            this.enqueue(new Stock(cost));
            quantity--;
        }
    }

    public double sell(double salePrice, int quantity) {
        double buyPrice = 0;
        double netProfit = salePrice * quantity;
        while (quantity > 0) {
            buyPrice += this.dequeue().getCost();
            quantity--;
        }
        netProfit -= buyPrice;
        return netProfit;
    }

    public double totalCost() {
        double totalCost = 0;
        node current = front;
        while (current.next != null) {
            totalCost += current.data.getCost();
            current = current.next;
        }
        return totalCost;
    }
}
