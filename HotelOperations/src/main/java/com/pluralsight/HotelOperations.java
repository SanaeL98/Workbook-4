package com.pluralsight;

public class HotelOperations {
    public static void main(String[] args) {
        Room myRoom = new Room(2, 150.00, false, false);

        System.out.println("Room Info:");
        System.out.println("Beds: " + myRoom.getNumberOfBeds());
        System.out.println("Price: $" + myRoom.getPrice());
        System.out.println("Available? " + myRoom.isAvailable());

        Reservation myReservation = new Reservation("king", 2, true);

        System.out.println("\nReservation Info:");
        System.out.println("Room Type: " + myReservation.getRoomType());
        System.out.println("Nights: " + myReservation.getNumberOfNights());
        System.out.println("Weekend? " + myReservation.isWeekend());
        System.out.println("Total Cost: $" + myReservation.getReservationTotal());

        Room room101 = new Room(2, 100.0, false, true);

        room101.checkIn();
        room101.checkOut();
        room101.cleanRoom();

        Employee emp = new Employee("E001","Sara","Housekeeping",15,0.0);

        emp.punchIn(9.0);
        emp.punchOut(17.5);

        System.out.println("Total hours worked: " + emp.getHoursWorked());


        Hotel myHotel = new Hotel("Haraz Inn", 5, 10);

        boolean booked = myHotel.bookRoom(2, true);
        System.out.println("Suites booked: " + booked);
        System.out.println("Available suites: " + myHotel.getAvailableSuites());
        System.out.println("Available basic rooms: " + myHotel.getAvailableRooms());

    }
}



