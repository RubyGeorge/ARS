package com.nissan.project.corejava.model;
/*
Testing git push
*/

public class Flight {
private String flightName;
private String airlines;
private String type;
private int capacity;
private String source;
private String destination;
public Flight(String flightName, String airlines, String type, int capacity, String source, String destination) {
	this.flightName = flightName;
	this.airlines = airlines;
	this.type = type;
	this.capacity = capacity;
	this.source = source;
	this.destination = destination;
}

public String getFlightName() {
	return flightName;
}
public String getAirlines() {
	return airlines;
}
public String getType() {
	return type;
}
public int getCapacity() {
	return capacity;
}
public String getSource() {
	return source;
}
public String getDestination() {
	return destination;
}

}
