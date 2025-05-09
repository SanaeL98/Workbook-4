package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;
    private boolean isClean;

    Room(int beds, double roomPrice, boolean occupied, boolean dirty) {
        this.numberOfBeds = beds;
        this.price = roomPrice;
        this.isOccupied = isOccupied();
        this.isDirty = dirty;
    }

    int getNumberOfBeds() {
        return numberOfBeds;
    }

    double getPrice() {
        return price;
    }

    boolean isOccupied() {
        return isOccupied;

    }

    boolean isDirty() {
        return isDirty;
    }

    boolean isAvailable() {
        return !isOccupied && !isDirty;
    }

    public void checkIn(){
        if (isOccupied && isClean) {
            isOccupied = true;
            isClean = false;
        }else {
            System.out.println("Room is either already occupied or not clean.");
        }
    }
    public void checkOut() {
        if (isOccupied) {
            isOccupied = false;
            isClean = false;
        } else {
            System.out.println("Room is already empty.");
        }
    }

    public void cleanRoom() {
        if (!isOccupied) {
            isClean = true;
        } else {
            System.out.println("Can't clean an occupied room.");
        }
    }
}

