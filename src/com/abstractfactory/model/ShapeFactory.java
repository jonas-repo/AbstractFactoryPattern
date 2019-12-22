package com.abstractfactory.model;

public class ShapeFactory extends AbstractFactory{

	@Override
	public Shape getShape(String shapeType) {
		
		if(shapeType.equalsIgnoreCase("RECTANGLE"))// compares two strings irrespective of the case (lower or upper) of the string
		{
	         return new Rectangle();         
	    }
		else if(shapeType.equalsIgnoreCase("SQUARE"))
		{
	        return new Square();
	    }	 
	    return null;
	}

}
