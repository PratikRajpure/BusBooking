package com.bus.booking;

import org.springframework.beans.factory.annotation.Autowired;

public class BusBooking {

	String BusAgencyName;
	@Autowired
	BusDetails busDetails;
	PassengerDetails passengerDetails;
	BookingPayment bookingPayment;
	public BusBooking() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Autowired
	
	public String getBusAgencyName() {
		return BusAgencyName;
	}
	public BusBooking(String busAgencyName) {
		super();
		BusAgencyName = busAgencyName;
	}
	public void setBusAgencyName(String busAgencyName) {
		BusAgencyName = busAgencyName;
	}
	public BusDetails getBusDetails() {
		return busDetails;
	}
	@Autowired
	public void setBusDetails(BusDetails busDetails) {
		this.busDetails = busDetails;
	}
	public PassengerDetails getPassengerDetails() {
		return passengerDetails;
	}
	@Autowired
	public void setPassengerDetails(PassengerDetails passengerDetails) {
		this.passengerDetails = passengerDetails;
	}
	
	public BusBooking(PassengerDetails passengerDetails) {
		super();
		this.passengerDetails = passengerDetails;
	}
	public BookingPayment getBookingPayment() {
		return bookingPayment;
	}
	@Autowired
	public void setBookingPayment(BookingPayment bookingPayment) {
		this.bookingPayment = bookingPayment;
	}
	@Override
	public String toString() {
		return "BusBooking [BusAgencyName=" + BusAgencyName + ", busDetails=" + busDetails + ", passengerDetails="
				+ passengerDetails + ", bookingPayment=" + bookingPayment + "]";
	}
}