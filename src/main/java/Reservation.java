public class Reservation {
    private String roomType; // King or Double
    private int numNights;
    private boolean weekend;

    public Reservation(String roomType, int numberOfNights, boolean weekend) {
        this.roomType = roomType;
        this.numNights = numberOfNights;
        this.weekend = weekend;

    }

    public String getRoomType() {
        return roomType;
    }

    public double getPrice() {
        double price = 0;

        switch (this.roomType) {
            case "king" -> { price = 139.00; }
            case "double" -> {price = 124.00; }
            default -> {
                System.out.println("That's not a room type!");
            }
        }
        return price;
    }

    public int getnumNights() {
        return numNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    public double getResTotal() {
        return getPrice() * numNights;
    }
}