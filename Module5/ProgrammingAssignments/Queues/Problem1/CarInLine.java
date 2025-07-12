package Module5.ProgrammingAssignments.Queues.Problem1;

public class CarInLine {
    private int arrivalTime;
    private int departureTime;

    public CarInLine(int arrivalTime) {
        this.arrivalTime = arrivalTime;
        departureTime = 0;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public int getDepartureTime() {
        return departureTime;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void setDepartureTime(int departureTime) {
        this.departureTime = departureTime;
    }

    public int totalTime() {
        return departureTime - arrivalTime;
    }
}
