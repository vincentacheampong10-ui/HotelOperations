package com.pluralsight;

public class Reservation {
    String roomType;
    double Price;
    int numberOfNights;
    boolean isWeekend;
    boolean reservationTotal;

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double Price() {
        return Price;
    }

    public void setPrice(double price) {
        this.Price = price;
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

    public boolean isReservationTotal() {
        return reservationTotal;
    }

    public void setReservationTotal(boolean reservationTotal) {
        this.reservationTotal = reservationTotal;
    }
    /// derived methods
    public double getReservationTotal() {
        if (this.roomType.equalsIgnoreCase("King")) {
            return 139;
        } else if (this.roomType.equalsIgnoreCase("Double")) {
            return 124;
        } else {
            throw new IllegalArgumentException("Invalid room type"+ this.roomType);
        }
    }
    public double getPrice() {
     double total = getPrice()* numberOfNights;
        if (isWeekend) {
            total = total*1.10;
        }
        return total;
    }
}
