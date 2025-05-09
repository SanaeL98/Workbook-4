package com.pluralsight;

public class Reservation {
    String roomType;
    int numberOfNights;
    boolean isWeekend;

    Reservation(String type, int nights, boolean weekend) {
        roomType = type;
        numberOfNights = nights;
        isWeekend = weekend;
    }

    String getRoomType() {
        return roomType;
    }

    void setRoomType(String type) {
        roomType = type;
    }

    int getNumberOfNights() {
        return numberOfNights;
    }

    void setNumberOfNights(int nights) {
        numberOfNights = nights;
    }

    boolean isWeekend() {
        return isWeekend;
    }
    double getPrice() {
        if (roomType.equals("king")) {
            return 139.00;
        } else {
            return 124.00;
        }
    }

    double getReservationTotal() {
        double total = getPrice() * numberOfNights;
        if (isWeekend) {
            total = total + (total * 0.10);
        }
        return total;
    }
}

