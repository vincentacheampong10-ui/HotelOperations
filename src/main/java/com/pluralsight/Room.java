package com.pluralsight;

public class Room {
    private int numberOfBed;
    private int getPrice;
    private boolean isOccupied;
    private boolean isDirty;
    private boolean isAvailable;

    public int getNumberOfBed() {
        return numberOfBed;
    }

    public void setNumberOfBed(int numberOfBed) {
        this.numberOfBed = numberOfBed;
    }

    public int getGetPrice() {
        return getPrice;
    }

    public void setGetPrice(int getPrice) {
        this.getPrice = getPrice;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void checkIn(){
        if(isAvailable()){
            throw new IllegalStateException("Cannot check in. Room is not available");
        }
        isOccupied = true;
        isDirty = true;
    }

    public void checkOut(){
        if(isAvailable()){
            throw new IllegalStateException("Room is available");
        }
        isOccupied = false;
        cleanRoom();
    }

    public void cleanRoom(){
        isDirty = false;
    }

    }



