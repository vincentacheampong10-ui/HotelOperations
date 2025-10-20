package com.pluralsight;

public class Reservation {
   String RoomType;
   double getPrice;
    int NumberOfNights;
    boolean isWeekend;
    boolean ReservationTotal;

    public String getRoomType() {
        return RoomType;
    }

    public void setRoomType(String roomType) {
        RoomType = roomType;
    }

    public double getGetPrice() {
        return getPrice;
    }

    public void setGetPrice(double getPrice) {
        this.getPrice = getPrice;
    }

    public int getNumberOfNights() {
        return NumberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        NumberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public boolean isReservationTotal() {
        return ReservationTotal;
    }

    public void setReservationTotal(boolean reservationTotal) {
        ReservationTotal = reservationTotal;
    }
}
