import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RoomTest {

    @Test
    public void checkIn_should_markRoomOccupiedAndDirty() {
        //Arrange
        Room room = new Room(2, 150.0, false, false);

        // Act
        room.checkIn();

        //Assert
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
    }

    @Test
    public void checkOut_should_markRoomNotOccupiedAndDirty() {
        // Arrange
        Room room = new Room(2, 150.0, true, true); // Occupied and Dirty

        // Act
        room.checkOut();

        // Assert
        assertFalse(room.isOccupied()); // Guest is gone
        assertTrue(room.isDirty());    // Room needs cleaning
    }


}