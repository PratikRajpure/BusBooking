package com.bus.booking;

public class BusDetails {
	private int busId;
	private String busName;
	private String source;
	private String destination;
	public BusDetails() {
		super();
	}
	public BusDetails(int busId, String busName, String source, String destination) {
		super();
		this.busId = busId;
		this.busName = busName;
		this.source = source;
		this.destination = destination;
	}
	public int getBusId() {
		return busId;
	}
	public void setBusId(int busId) {
		this.busId = busId;
	}
	public String getBusName() {
		return busName;
	}
	public void setBusName(String busName) {
		this.busName = busName;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	@Override
	public String toString() {
		return "BusDetails [busId=" + busId + ", busName=" + busName + ", source=" + source + ", destination="
				+ destination + "]";
	}
}
