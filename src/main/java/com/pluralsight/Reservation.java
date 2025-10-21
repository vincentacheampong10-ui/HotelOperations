package com.pluralsight;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private  boolean isWeekend;

    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    /// derived methods
    public double getPrice () {
        if (this.roomType.equalsIgnoreCase("King")) {
            return 139;
        } else if (this.roomType.equalsIgnoreCase("Double")) {
            return 124;
        } else {
            throw new IllegalArgumentException("Invalid room type"+ this.roomType);
        }
    }
    public double getReservationTotal() {
     double total = getPrice() * this.numberOfNights;
        if (isWeekend) {
            total = total*1.10;
        }
        return total;
    }
}
