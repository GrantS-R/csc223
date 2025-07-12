package Module5.ProgrammingAssignments.Queues.Problem4;

public class StockTransactionHistory {
    public static void main(String[] args) {
        StockTransaction stocks = new StockTransaction();
        stocks.buy(25, 120);
        System.out.println("Buy 120 shares at $25 each.");
        stocks.buy(75, 20);
        System.out.println("Buy 20 stocks at $75 each.");
        stocks.sell(65, 30);
        System.out.println("Income from selling 30 shares at $65.0 is: $" + 30 * 65);
        System.out.println("Total cost of shares is: $" + stocks.totalCost() + "\n");

        System.out.println("Sell 30 shares at $65 each at a gain of $" + stocks.sell(65, 30) + "\n");

        stocks.sell(65, 10);
        System.out.println("Income from selling 10 shares at $65.0 is: $" + 10 * 65);
        System.out.println("Total cost of shares is: $" + stocks.totalCost() + "\n");

        System.out.println("Sell 10 shares at $65 each at a gain of $" + stocks.sell(65, 10) + "\n");

        stocks.buy(10, 100);
        System.out.println("Buy 100 shares at $10 each");
        stocks.buy(4, 130);
        System.out.println("Buy 130 shares at $4 each");
        stocks.buy(16, 200);
        System.out.println("Buy 200 shares at $16 each \n");

        stocks.sell(65, 10);
        System.out.println("Income from selling 10 shares at $65.0 is: $" + 10 * 65);
        System.out.println("Total cost of shares is: $" + stocks.totalCost() + "\n");

        System.out.println("Sell 10 shares at $65 each at a gain of $" + stocks.sell(65, 10) + "\n");

        stocks.sell(30, 150);
        System.out.println("Income from selling 150 shares at $30.0 is: $" + 30 * 150);
        System.out.println("Total cost of shares is: $" + stocks.totalCost() + "\n");

        System.out.println("Sell 150 shares at $30 each at a gain of $" + stocks.sell(30, 150) + "\n");
        System.out.println("done");
    }
}
