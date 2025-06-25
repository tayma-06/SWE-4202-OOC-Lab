# Hotel Reservation Management System

## 1.1 Background

You are a Java developer working for a hotel chain that manages room bookings, guest check-ins, and reservation priorities. Your task is to build a simplified version of the Hotel Reservation Management System that showcases method overloading and method overriding through its booking process.

## 1.2 Task Description

1. Create a base class named Reservation:
   - Add a method named bookRoom() that prints "Booking a standard room."
   - Overload the bookRoom() method with:
     - bookRoom(String guestName)
     - bookRoom(String guestName, boolean isVIP)
   - Each overloaded version should print the guest name and indicate if the booking is prioritized for VIPs.

2. Create a derived class named OnlineReservation that extends Reservation:
   - Override bookRoom() to print "Booking room through online reservation system."
   - Override bookRoom(String guestName) to print a message like "Booking for guest <guestName> via online system."

3. Create another derived class named WalkInReservation that extends Reservation:
   - Override bookRoom() to print "Booking room via walk-in reservation."

4. Create a Main class to:
   - Instantiate objects of Reservation, OnlineReservation, and WalkInReservation.
   - Call all versions of the bookRoom() method to demonstrate method overloading and method overriding.

## 1.3 Extended Task (Optional)

To further demonstrate OOP principles:

- Convert Reservation into an abstract class and make bookRoom() abstract.
- Create an interface named Reservable with a bookRoom() method and implement it in both OnlineReservation and WalkInReservation.
- Add a cancelReservation() method to show overriding in cancellation behavior.
- Create a Guest class to store guest details such as name, age, and reservation ID.
