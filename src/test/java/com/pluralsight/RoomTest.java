package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void testCheckInWhenRoomIsAvailable() {
        Room room = new Room();
        room.setAvailable(false);
        room.checkIn();
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());

    }

    @Test
    void testCheckOutWhenRoomIsNotAvailable() {
        Room room = new Room();
        room.setAvailable(false);
        room.checkOut();
        room.cleanRoom();
        assertFalse(room.isOccupied());


    }

    @Test
    void testCheckOutWhenRoomIsClean() {
        Room room = new Room();
        room.setAvailable(false);
        room.setDirty(true);
        room.cleanRoom();
        assertTrue(room.isAvailable());
    }
}