package com.spring.temp.app.model;

public class Wind {
	private float speed;
	private float deg;
	private float gust;
	
	
	
	@Override
	public String toString() {
		return "Wind [speed=" + speed + ", deg=" + deg + ", gust=" + gust + "]";
	}
	public Wind() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Wind(float speed, float deg, float gust) {
		super();
		this.speed = speed;
		this.deg = deg;
		this.gust = gust;
	}
	public float getSpeed() {
		return speed;
	}
	public void setSpeed(float speed) {
		this.speed = speed;
	}
	public float getDeg() {
		return deg;
	}
	public void setDeg(float deg) {
		this.deg = deg;
	}
	public float getGust() {
		return gust;
	}
	public void setGust(float gust) {
		this.gust = gust;
	}
	
	
}
