package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HotelTest {

    @Test
    void bookRoom_whenSuitesAvailabel_ReturnTrue() {
        // arrange
        Hotel grandBudapestHotel = new Hotel("Grand Budapest Hotel", 15, 100);
        // act: call method
       boolean result= grandBudapestHotel.bookRoom (5, true);
       //assert: verify changes
        assertTrue(result);
    }
    @Test
    void bookRoom_whenRoomsAreNotAvailabel_ReturnFalse() {
        // arrange
        Hotel grandBudapestHotel = new Hotel("Grand Budapest Hotel", 15, 100);
        // act: call method
        boolean result = grandBudapestHotel.bookRoom (101, true);
        //assert: verify changes
        assertTrue(result);
    }
    }
