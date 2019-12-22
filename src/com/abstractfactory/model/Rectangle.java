package com.abstractfactory.model;

public class Rectangle implements Shape {

	private int id = 0;
	
	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

}
