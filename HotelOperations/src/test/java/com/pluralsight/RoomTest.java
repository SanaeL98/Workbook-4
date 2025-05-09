package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    @Test
    void testCheckIn() {
        Room room = new Room(2, 100.0, false, true); // unoccupied and clean
        room.checkIn();
        assertTrue(room.isOccupied());

    }

    @Test
    void testCheckOut() {
        Room room = new Room(2, 100.0, true, true); // occupied
        room.checkOut();
        assertFalse(room.isOccupied());

    }

    @Test
    void testCleanRoom() {
        Room room = new Room(2, 100.0, false, false); // unoccupied and dirty
        room.cleanRoom();
        assertFalse(room.isDirty());

    }

}