package com.spring.temp.app.model;

public class Clouds {
	private int all;

	@Override
	public String toString() {
		return "Clouds [all=" + all + "]";
	}

	public Clouds(int all) {
		super();
		this.all = all;
	}

	public Clouds() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAll() {
		return all;
	}

	public void setAll(int all) {
		this.all = all;
	}
}
