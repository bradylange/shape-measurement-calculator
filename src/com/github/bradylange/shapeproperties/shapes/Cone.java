/*
 * Developer: Brady Lange
 * Course: CSIS 162 - Programming II
 * Institution: University of Wisconsin-River Falls
 * Class: Cone
 * Development Language: Java
 * Copyright Notice: MIT License, Copyright (c) 2019 Brady Lange
 */

package com.github.bradylange.shapeproperties.shapes;

/**
 * <p>
 * 		Contains cone properties and algorithms to modify them. 
 * </p>
 * <p>
 * 		Cone - a solid or hollow object which tapers from a circular or roughly 
 *             circular base to a point.
 * </p>
 * 
 * @author  Brady Lange - <a href = "https://www.linkedin.com/in/brady-lange/" 
 *                           target = "_blank">LinkedIn</a>
 * @version  1.0.1, 01/11/2019
 * @since  1.0, 02/13/2017
 */
public class Cone 
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
	 * 			3.14 * {@link #radius} * {@link #side}
	 * 		</li>
	 * </ul>
	 */
	private double area;
	/**
	 * The amount of space that is occupied.
	 * <br>
	 * <p style = "font-style: italic;">
	 * 		Formula:
	 * </p>
	 * <ul>
	 * 		<li>
	 * 			(1 / 3.0) * 3.14 * ({@link #radius} * {@link #radius}) 
	 *          * {@link #height}
	 * 		</li>
	 * </ul>
	 */
	private double volume;
	/**
	 * The enclosing boundary of a curve.
	 * <br>
	 * <p style = "font-style: italic;">
	 * 		Formula:
	 * </p>
	 * <ul>
	 * 		<li>
	 * 			2 * 3.14 * {@link #radius}
	 * 		</li>
	 * </ul>
	 */
	private double circumference;
	/**
	 * The measurement from base to top.
	 */
	private double height; 
	/**
	 * A straight line from the center to the circumference.
	 */
	private double radius;
	/**
	 * One side measurement.
	 */
	private double side;		
	
	// ========================================================================
	// Default Constructor
	// ========================================================================
	/**
	 * Constructs a {@link Cone} object with the default properties.
	 * 
	 * @version  1.0.1, 01/11/2019
	 * @since  1.0, 02/13/2017
	 */
	public Cone() 
	{
		// Instantiate default properties
		radius = 0;																		
		side = 0;																		
		height = 0;																		
	}
	
	// ========================================================================
	// Alternate Constructor
	// ========================================================================
	/**
	 * Constructs a {@link Cone} object with the properties {@link #height},
	 * {@link #side}, and {@link #radius}.
	 * 
	 * @param height  the measurement of the {@link #height}
	 * @param side  the measurement of the {@link #side}
	 * @param radius  the measurement of the {@link #height}
	 * 
	 * @version  1.0.1, 01/11/2019
	 * @since  1.0, 02/13/2017
	 */
	public Cone(double height, double side, double radius)
	{
		// Instantiate properties with parameter values 
		this.radius = radius;																	
		this.side = side;																		
		this.height = height;																	
	}

	// ========================================================================
	// Calculate Area Method
	// ========================================================================
	/**
	 * Calculates the {@link Cone}'s {@link #area}.
	 * 
	 * @version  1.0.1, 01/11/2019
	 * @since  1.0, 02/13/2017
	 */
	public void calcArea() 
	{
		// Calculate cone's area
		area = Math.PI * radius * side;	
		// Format cone's area to two decimal places
		String aStr = String.format("%.2f", area);		
		// Convert cone's area String to Double
		area = Double.parseDouble(aStr);								
	}

	// ========================================================================
	// Calculate Circumference Method
	// ========================================================================
	/**
	 * Calculates the {@link Cone}'s {@link #circumference}.
	 * 
	 * @version  1.0.1, 01/11/2019
	 * @since  1.0, 02/13/2017
	 */
	public void calcCircumference()
	{
		// Calculate cone's circumference
		circumference = 2 * Math.PI * radius;		
		// Format cone's circumference to two decimal places
		String cStr = String.format("%.2f", circumference);	
		// Convert cone's circumference String to Double 
		circumference = Double.parseDouble(cStr);						
	}

	// ========================================================================
	// Calculate Volume Method
	// ========================================================================
	/**
	 * Calculates the {@link Cone}'s {@link #volume}.
	 * 
	 * @version  1.0.1, 01/11/2019
	 * @since  1.0, 02/13/2017
	 */
	public void calcVolume() 
	{
		// Calculate cone's volume
		volume = (1 / 3.0) * Math.PI * (radius * radius) * height;
		// Format cone's volume to two decimal places 
		String vStr = String.format("%.2f", volume);
		// Convert cone's volume String to Double 
		volume = Double.parseDouble(vStr);								
	}
	
	// ========================================================================
	// Set Radius Method
	// ========================================================================
	/**
	 * Sets the {@link Cone}'s {@link #radius} measurement.
	 * 
	 * @param radius  the measurement of the {@link #radius}
	 * 
	 * @version  1.0.1, 01/11/2019
	 * @since  1.0, 02/13/2017
	 */
	public void setRadius(double radius) 
	{
		//Set cone's radius
		this.radius = radius;											
	}

	// ========================================================================
	// Set Side Method
	// ========================================================================
	/**
	 * Sets the {@link Cone}'s {@link #side} measurement.
	 * 
	 * @param side  the measurement of the {@link #side}
	 * 
	 * @version  1.0.1, 01/11/2019
	 * @since  1.0, 02/13/2017
	 */
	public void setSide(double side)
	{
		// Set cone's side
		this.side = side;												
	}

	// ========================================================================
	// Set Height Method
	// ========================================================================
	/**
	 * Sets the {@link Cone}'s {@link #height} measurement.
	 * 
	 * @param height  the measurement of the {@link #height}
	 * 
	 * @version  1.0.1, 01/11/2019
	 * @since  1.0, 02/13/2017
	 */
	public void setHeight(double height) 
	{
		// Set cone's height
		this.height = height;											
	}
	
	// ========================================================================
	// Get Radius Method
	// ========================================================================
	/**
	 * Returns the {@link Cone}'s {@link #radius} measurement.
	 * 
	 * @return  the measurement of the {@link #radius}.
	 * 
	 * @version  1.0.1, 01/11/2019
	 * @since  1.0, 02/13/2017
	 */
	public double getRadius() 
	{
		// Return cone's radius	
		return radius;																											
	}

	// ========================================================================
	// Get Side Method
	// ========================================================================
	/**
	 * Returns the {@link Cone}'s {@link #side} measurement.
	 * 
	 * @return  the measurement of the {@link #side}
	 * 
	 * @version  1.0.1, 01/11/2019
	 * @since  1.0, 02/13/2017
	 */
	public double getSide() 
	{
		// Return cone's side 	
		return side;																											
	}
		
	// ========================================================================
	// Get Height Method
	// ========================================================================
	/**
	 * Returns the {@link Cone}'s {@link #height} measurement.
	 * 
	 * @return  the measurement of the {@link #height}
	 * 
	 * @version  1.0.1, 01/11/2019
	 * @since  1.0, 02/13/2017
	 */
	public double getHeight() 
	{
		// Return cone's height	
		return height;																											
	}
	
	// ========================================================================
	// Get Area Method
	// ========================================================================
	/**
	 * Returns the {@link Cone}'s {@link #area} measurement.
	 * 
	 * @return  the measurement of the {@link #area}
	 * 
	 * @version  1.0.1, 01/11/2019
	 * @since  1.0, 02/13/2017
	 */
	public double getArea() 
	{	
		// Return cone's area
		return area;													 													
	}
	
	// ========================================================================
	// Get Circumference Method
	// ========================================================================
	/**
	 * Returns the {@link Cone}'s {@link #circumference} measurement.
	 * 
	 * @return  the measurement of the {@link #circumference}
	 * 
	 * @version  1.0.1, 01/11/2019
	 * @since  1.0, 02/13/2017
	 */
	public double getCircumference() 
	{
		// Return cone's circumference	
		return circumference;																						
	}
	
	// ========================================================================
	// Get Volume Method
	// ========================================================================
	/**
	 * Returns the {@link Cone}'s {@link #volume} measurement.
	 * 
	 * @return  the measurement of the {@link #volume}
	 * 
	 * @version  1.0.1, 01/11/2019
	 * @since  1.0, 02/13/2017
	 */
	public double getVolume() 
	{
		// Return cone's volume 
		return volume;																													
	}
	
	// ========================================================================
	// To String Method
	// ========================================================================
	/**
	 * Returns the String representation of the {@link Cone} object's 
	 * properties.
	 * 
	 * @return  the properties of the {@link Cone} object as a String
	 * 
	 * @version  1.0.1, 01/11/2019
	 * @since  1.0, 02/13/2017
	 */
	public String toString()
	{
		// Cone properties
		String data = "\nCircumference: " + circumference + "\nArea: " + area 
		              + "\nVolume: " + volume + "\nHeight: " + height 
		              + "\nRadius: " + radius + "\nSide: " + side;
		// Return cone's properties
		return data;																													
	}
}