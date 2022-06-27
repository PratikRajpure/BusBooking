package com.bus.booking;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BusBookingTest {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		BusBooking bb = ctx.getBean(BusBooking.class);

		System.out.println(bb);

		System.out.println("Your booking is successfully done...");
	}
}
