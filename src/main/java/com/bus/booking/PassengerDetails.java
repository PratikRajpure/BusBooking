package com.bus.booking;

public class PassengerDetails {
	private String pName;
	private int seatNumofPassenger;
	public PassengerDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PassengerDetails(String pName, int seatNumofPassenger) {
		super();
		this.pName = pName;
		this.seatNumofPassenger = seatNumofPassenger;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getSeatNumofPassenger() {
		return seatNumofPassenger;
	}
	public void setSeatNumofPassenger(int seatNumofPassenger) {
		this.seatNumofPassenger = seatNumofPassenger;
	}
	@Override
	public String toString() {
		return "PassengerDetails [pName=" + pName + ", seatNumofPassenger=" + seatNumofPassenger + "]";
	}
}