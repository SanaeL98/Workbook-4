package com.pluralsight;

public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;

    private int bookedBasicRooms;
        // Constructor 1: no booked rooms
    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }

        // Constructor 2: with booked rooms
    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    // Method to book rooms
    public boolean bookRoom(int numberOfRooms, boolean isSuite) {
        if (isSuite) {
            if (bookedSuites + numberOfRooms <= this.numberOfSuites) {
                bookedSuites += numberOfRooms;
                return true;
            }
        } else {
            if (bookedBasicRooms + numberOfRooms <= this.numberOfRooms) {
                bookedBasicRooms += numberOfRooms;
                return true;
            }
        }
        return false;
    }

    // Derived getter: available suites
    public int getAvailableSuites() {
        return numberOfSuites - bookedSuites;
    }

    // Derived getter: available basic rooms
    public int getAvailableRooms() {
        return numberOfRooms - bookedBasicRooms;
    }
}
