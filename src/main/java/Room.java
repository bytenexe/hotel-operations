public class Room {
    private int numBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty) {
        this.numBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    public int getNumberOfBeds() {
        return numBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isAvailable() {
        return !dirty && !occupied;
    }
}