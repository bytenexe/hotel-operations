public class Room {
    private int numBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    public Room(int numBeds, double price, boolean occupied, boolean dirty) {
        this.numBeds = numBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    public int getNumBeds() {
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
        return !occupied && !dirty;
    }

    public boolean checkIn() {
        if (isAvailable()) {
            this.occupied = true;
            this.dirty = true;
            return true;
        }
        return false;
    }

    public boolean checkOut() {
        if (occupied) {
            this.occupied = false;
            this.dirty = true;
            return true;
        }
        return false;
    }

    public boolean cleanRoom() {
        if (dirty) {
            this.dirty = false;
            return true;
        }
        return false;
    }
}