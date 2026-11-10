
import java.time.LocalDateTime;

public class Employee {
    private String name;
    private double hoursWorked;
    private int startTime;
    private boolean punchedIn;

    public Employee(String name) {
        this.name = name;
        this.hoursWorked = 0;
        this.punchedIn = false;
    }

    public boolean punchIn(int time) {
        if (!punchedIn) {
            this.startTime = time;
            this.punchedIn = true;
            return true;
        }
        return false;
    }

    public boolean punchIn() {
        LocalDateTime currentTime = LocalDateTime.now();
        int hour = currentTime.getHour();
        int minute = currentTime.getMinute();
        int time = (hour * 60) + minute;

        return punchIn(time);
    }

    public boolean punchOut(int time) {
        if (punchedIn) {
            double hours = (time - this.startTime) / 60.0;
            this.hoursWorked += hours;
            this.punchedIn = false;
            return true;
        }
        return false;
    }

    public boolean punchOut() {
        LocalDateTime currentTime = LocalDateTime.now();
        int hour = currentTime.getHour();
        int minute = currentTime.getMinute();
        int time = (hour * 60) + minute;

        return punchOut(time);
    }

    public boolean punchTimeCard(int time) {
        if (!punchedIn) {
            return punchIn(time);
        } else {
            return punchOut(time);
        }
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public String getName() {
        return name;
    }
}
