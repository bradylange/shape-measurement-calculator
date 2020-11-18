/*
 * Developer: Brady Lange
 * Course: CSIS 162 - Programming II
 * Institution: University of Wisconsin-River Falls
 * Class: Circle
 * Development Language: Java
 * Copyright Notice: MIT License, Copyright (c) 2019 Brady Lange
 */

package com.github.bradylange.shapeproperties.shapes;

/**
 * <p>
 * 		Contains circle properties and algorithms to modify them. 
 * </p>
 * <p>
 * 		Circle - a round plane figure whose boundary (the circumference) 
 *               consists of points equidistant from a fixed point (the center).
 * </p>
 * 
 * @author  Brady Lange - <a href = "https://www.linkedin.com/in/brady-lange/" 
 *                           target = "_blank">LinkedIn</a>
 * @version  1.0.1, 01/11/2019
 * @since  1.0, 02/13/2017
 */
public class Circle 
{ 
	// ------------------------------------------------------------------------
	// Instance Variables
	// ------------------------------------------------------------------------
	/**
	 * The measurement of the surface.
	 * <br>
	 * <p style = "font-style: italic;">
	 * 		Formula:
	 * </p>
	 * <ul>
	 * 		<li>
	 * 			3.14 * ({@link #radius} * {@link #radius})
	 * 		</li>
	 * </ul>
	 */
	public double area;
	/**
	 * The enclosing boundary of a curve.
	 * <br>
	 * <p style = "font-style: italic;">
	 * 		Formula:
	 * </p>
	 * <ul>
	 * 		<li>
	 * 			3.14 * {@link #diameter}
	 * 		</li>
	 * </ul>
	 */
	public double circumference;	
	/**
	 * A straight line from the center to the circumference.
	 */
	public double radius;
	/**
	 * A straight line passing from side to side through the center.
	 */
	public double diameter;
			
	// ========================================================================
	// Default Constructor
	// ========================================================================
	/**
	 * Constructs a {@link Circle} object with the default properties.
	 * 
	 * @version  1.0.1, 01/11/2019
	 * @since  1.0, 02/13/2017
	 */
	public Circle() 
	{
		// Instantiate default properties
		radius = 0;																							
		diameter = 0;															
	}

	// ========================================================================
	// Alternate Constructor
	// ========================================================================
	/**
	 * Constructs a {@link Circle} object with the properties {@link #radius}
	 * and {@link #diameter}.
	 * 
	 * @param radius  the measurement of the {@link #radius}
	 * @param diameter  the measurement of the {@link #diameter}
	 * 
	 * @version  1.0.1, 01/11/2019
	 * @since  1.0, 02/13/2017
	 */
	public Circle(double radius, double diameter) 
	{
		// Instantiate properties with parameter values 
		this.radius = radius;															
		this.diameter = diameter;														
	}

	// ========================================================================
	// Calculate Area Method
	// ========================================================================
	/**
	 * Calculates the {@link Circle}'s {@link #area}.
	 * 
	 * @version  1.0.1, 01/11/2019
	 * @since  1.0, 02/13/2017
	 */
	public void calcArea() 
	{
		// Calculate circle's area 
		area = Math.PI * (radius * radius);
		// Format circle's area to two decimal places
		String aStr = String.format("%.2f", area);	
		// Convert circle's area String to Double 
		area = Double.parseDouble(aStr);						
	}
	
	// ========================================================================
	// Calculate Circumference Method
	// ========================================================================
	/**
	 * Calculates the {@link Circle}'s {@link #circumference}.
	 * 
	 * @version  1.0.1, 01/11/2019
	 * @since  1.0, 02/13/2017
	 */
	public void calcCircumference() 
	{
		// Calculate circle's circumference
		circumference = Math.PI * diameter;		
		// Format circle's circumference to two decimal places
		String cStr = String.format("%.2f", circumference);	
		// Convert circle's circumference String to Double
		circumference = Double.parseDouble(cStr);				
	}

	// ========================================================================
	// Set Radius Method
	// ========================================================================
	/**
	 * Sets the {@link Circle}'s {@link #radius} measurement.
	 * 
	 * @param radius  the measurement of the {@link #radius}
	 * 
	 * @version  1.0.1, 01/11/2019
	 * @since  1.0, 02/13/2017
	 */
	public void setRadius(double radius) 
	{
		// Set circle's radius 
		this.radius = radius;									
	}
	
	// ========================================================================
	// Set Diameter Method
	// ========================================================================
	/**
	 * Sets the {@link Circle}'s {@link #diameter} measurement.
	 * 
	 * @param diameter  the measurement of the {@link #diameter}
	 * 
	 * @version  1.0.1, 01/11/2019
	 * @since  1.0, 02/13/2017
	 */
	public void setDiameter(double diameter) 
	{
		// Set circle's diameter 
		this.diameter = diameter;								
	}

	// ========================================================================
	// Get Radius Method
	// ========================================================================
	/**
	 * Returns the {@link Circle}'s {@link #radius} measurement.
	 * 
	 * @return  the measurement of the {@link #radius}
	 * 
	 * @version  1.0.1, 01/11/2019
	 * @since  1.0, 02/13/2017
	 */
	public double getRadius() 
	{
		// Return circle's radius 
		return radius;																						
	}
	
	// ========================================================================
	// Get Diameter Method
	// ========================================================================
	/**
	 * Returns the {@link Circle}'s {@link #diameter} measurement.
	 * 
	 * @return  the measurement of the {@link #diameter}
	 * 
	 * @version  1.0.1, 01/11/2019
	 * @since  1.0, 02/13/2017
	 */
	public double getDiameter() 
	{
		// Return circle's diameter	
		return diameter;																					
	}
	
	// ========================================================================
	// Get Area Method
	// ========================================================================
	/**
	 * Returns the {@link Circle}'s {@link #area} measurement.
	 * 
	 * @return  the measurement of the {@link #area}
	 * 
	 * @version  1.0.1, 01/11/2019
	 * @since  1.0, 02/13/2017
	 */
	public double getArea() 
	{
		// Return circle's area	
		return area;																			
	}	

	// ========================================================================
	// Get Circumference Method
	// ========================================================================
	/**
	 * Returns the {@link Circle}'s {@link #circumference} measurement.
	 * 
	 * @return  the measurement of the {@link #circumference}
	 * 
	 * @version  1.0.1, 01/11/2019
	 * @since  1.0, 02/13/2017
	 */
	public double getCircumference()
	{
		// Return circle's circumference
		return circumference;																				
	}
	
	// ========================================================================
	// To String Method
	// ========================================================================
	/**
	 * Returns the String representation of the {@link Circle} object's 
	 * properties.
	 * 
	 * @return  the properties of the {@link Circle} object as a String
	 * 
	 * @version  1.0.1, 01/11/2019
	 * @since  1.0, 02/13/2017
	 */
	public String toString() 
	{
		// Circle properties
		String data = "\nCircumference: " + circumference + "\nArea: " + area 
		              + "\nRadius: " + radius + "\nDiameter: " + diameter;
		// Return circle's properties
		return data;																						
	}
}