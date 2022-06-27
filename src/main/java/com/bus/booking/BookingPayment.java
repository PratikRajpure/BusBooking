package com.bus.booking;

public class BookingPayment {
	private int rate;
	private int totalAmountToPay;
	public BookingPayment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookingPayment(int rate, int totalAmountToPay) {
		super();
		this.rate = rate;
		this.totalAmountToPay = totalAmountToPay;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int getTotalAmountToPay() {
		return totalAmountToPay;
	}
	public void setTotalAmountToPay(int totalAmountToPay) {
		this.totalAmountToPay = totalAmountToPay;
	}
	@Override
	public String toString() {
		return "BookingPayment [rate=" + rate + ", totalAmountToPay=" + totalAmountToPay + "]";
	}

}
