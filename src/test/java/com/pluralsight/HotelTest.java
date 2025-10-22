package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class HotelTest {

    @Test
    void bookRoom_whenRoomsAvailabel_ReturnTrue() {
        // arrange
        Hotel grandBudapestHotel = new Hotel("Grand Budapest Hotel", 15, 100);
        // act: call method
       boolean result= grandBudapestHotel.bookRoom (5, false);
       //assert: verify changes
        assertTrue(result);
    }
    @Test
    void bookRoom_whenRoomsAreNotAvailabel_ReturnFalse() {
        // arrange
        Hotel grandBudapestHotel = new Hotel("Grand Budapest Hotel", 15, 101);
        // act: call method
        boolean result = grandBudapestHotel.bookRoom (5, false);
        //assert: verify changes
        assertTrue(result);
    }
}