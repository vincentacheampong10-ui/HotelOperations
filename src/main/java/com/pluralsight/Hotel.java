package com.pluralsight;

public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }

    //getters
    public int getAvailableSuites() {
        return numberOfSuites - bookedSuites;
    }

    public int getAvailableRooms() {
        return numberOfRooms - bookedBasicRooms;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", numberOfSuites=" + numberOfSuites +
                ", numberOfRooms=" + numberOfRooms +
                ", bookedSuites=" + bookedSuites +
                ", bookedBasicRooms=" + bookedBasicRooms +
                '}';
    }

    public boolean bookRoom(int numberOfRooms, boolean isSuite) {
        boolean isBasicRoom = !isSuite;
        if (isBasicRoom && (getAvailableRooms() >= numberOfRooms)) {
            bookedBasicRooms = bookedBasicRooms + numberOfRooms; //OR bookedBasicRooms += numberOfRooms;
            return true;
        } else {
            return false;
        }


    }
}



