package Module5.ProgrammingAssignments.Queues.Problem1;

public class carQueueSimulation {
    public static void main(String[] args) {
        int cars = 100;
        int maxCashiers = 10;
        int desiredWait = 90;
        int[] avgWaitTimes = new int[maxCashiers];

        System.out.print("Number of cashiers:\t");
        for (int i = 1; i <= maxCashiers; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();
        System.out.print("Average time:\t\t");

        for (int cashiers = 0; cashiers < maxCashiers; cashiers++) {
            LinkQueue<CarInLine> carQueue = new LinkQueue<>();
            int arrivalTime = 0;
            for (int i = 0; i < cars; i++) {
                carQueue.enqueue(new CarInLine(arrivalTime));
                arrivalTime += 10;
            }

            int[] cashierAvailable = new int[cashiers + 1];
            for (int i = 0; i < cashiers + 1; i++) {
                cashierAvailable[i] = 0;
            }

            int totalWaitTime = 0;
            while (!carQueue.isEmpty()) {
                CarInLine car = carQueue.dequeue();
                int minIndex = 0;
                for (int i = 1; i < cashierAvailable.length; i++) {
                    if (cashierAvailable[i] < cashierAvailable[minIndex])
                        minIndex = i;
                }
                int startTime = Math.max(car.getArrivalTime(), cashierAvailable[minIndex]);
                int serviceTime = 90;
                car.setDepartureTime(startTime + serviceTime);
                cashierAvailable[minIndex] = car.getDepartureTime();
                totalWaitTime += car.totalTime();
            }

            int avg = totalWaitTime / cars;
            avgWaitTimes[cashiers] = avg;
            System.out.print(avg + "\t");
        }
        System.out.println();
        int optimum = 1;

        for (int c = 0; c < maxCashiers; c++) {
            if (avgWaitTimes[c] <= desiredWait) {
                optimum = c + 1;
                break;
            }
        }

        System.out.println("Optimum number of cashiers is: " + optimum);
        System.out.println("Average processing time: " + desiredWait);
        System.out.println("Press any key to continue . . .");
    }
}
