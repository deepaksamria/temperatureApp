package com.spring.temp.app.model;

public class Coord {
	private double lon;
	private double lat;
	
	@Override
	public String toString() {
		return "Coord [lon=" + lon + ", lat=" + lat + "]";
	}
	public Coord() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Coord(double lon, double lat) {
		super();
		this.lon = lon;
		this.lat = lat;
	}
	public double getLon() {
		return lon;
	}
	public void setLon(double lon) {
		this.lon = lon;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
}
