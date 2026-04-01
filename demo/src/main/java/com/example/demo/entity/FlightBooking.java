package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "flight_bookings")
public class FlightBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookingId;

    @JoinColumn(name = "customer_id", referencedColumnName = "customerId")
    @ManyToOne
    private Customer customer;

    @JoinColumn(name = "flight_id", referencedColumnName = "flightId")
    @ManyToOne
    private Flight flight;

    public FlightBooking() {
    }

    public FlightBooking(Customer customer, Flight flight) {
        this.customer = customer;
        this.flight = flight;
    }
    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
}