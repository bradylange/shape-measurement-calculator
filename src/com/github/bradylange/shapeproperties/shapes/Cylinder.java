/*
 * Developer: Brady Lange
 * Course: CSIS 162 - Programming II
 * Institution: University of Wisconsin-River Falls
 * Class: Cylinder
 * Development Language: Java
 * Copyright Notice: MIT License, Copyright (c) 2019 Brady Lange
 */

package com.github.bradylange.shapeproperties.shapes;

/**
 * <p>
 * 		Contains cylinder properties and algorithms to modify them. 
 * </p>
 * <p>
 * 		Cylinder - a solid geometric figure with straight parallel sides and 
 *                 a circular or oval cross section.
 * </p>
 * 
 * @author  Brady Lange - <a href = "https://www.linkedin.com/in/brady-lange/" 
 *                           target = "_blank">LinkedIn</a>
 * @version  1.0.1, 01/10/2019
 * @since  1.0, 02/13/2017
 */
public class Cylinder 
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
	 * 			((3.14 * ({@link #radius} * {@link #radius})) * 2) 
	 *          + ((2 * 3.14 * {@link #radius}) * {@link #height})
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
	 * 			3.14 * ({@link #radius} * {@link #radius}) * {@link #height}
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
	 * A straight line from the center to the circumference.
	 */
	private double radius;
	/**
	 * The measurement from base to top.
	 */
	private double height;								
	
	// ========================================================================
	// Default Constructor
	// ========================================================================
	/**
	 * Constructs a {@link Cylinder} object with the default properties.
	 * 
	 * @version  1.0.1, 01/10/2019
	 * @since  1.0, 02/13/2017
	 */
	public Cylinder() 
	{
		// Instantiate default properties
		radius = 0;																			
		height = 0;																			
	}

	// ========================================================================
	// Alternate Constructor
	// ========================================================================
	/**
	 * Constructs a {@link Cylinder} object with the properties {@link #radius}
	 * and {@link #height}.
	 * 
	 * @param radius  the measurement of the {@link #radius}
	 * @param height  the measurement of the {@link #height}
	 * 
	 * @version  1.0.1, 01/10/2019
	 * @since  1.0, 02/13/2017
	 */
	public Cylinder(double radius, double height) 
	{
		// Instantiate properties with parameter values 
		this.radius = radius;																		
		this.height = height;																		
	}

	// ========================================================================
	// Calculate Area Method
	// ========================================================================
	/**
	 * Calculates the {@link Cylinder}'s {@link #area}.
	 * 
	 * @version  1.0.1, 01/10/2019
	 * @since  1.0, 02/13/2017
	 */
	public void calcArea() 
	{
		// Calculate cylinder's area
		area = ((Math.PI * (radius * radius)) * 2) 
		       + ((2 * Math.PI * radius) * height);	
		// Format cylinder's area to two decimal places
		String aStr = String.format("%.2f", area);	
		// Convert cylinder's area String to Double
		area = Double.parseDouble(aStr);						
	}

	// ========================================================================
	// Calculate Circumference Method
	// ========================================================================
	/**
	 * Calculates the {@link Cylinder}'s {@link #circumference}.
	 * 
	 * @version  1.0.1, 01/10/2019
	 * @since  1.0, 02/13/2017
	 */
	public void calcCircumference() 
	{
		// Calculate cylinder's circumference
		circumference = 2 * Math.PI * radius;	
		// Format cylinder's circumference to two decimal places
		String cStr = String.format("%.2f", circumference);		
		// Convert cylinder's circumference String to Double 
		circumference = Double.parseDouble(cStr);				
	}

	// ========================================================================
	// Calculate Volume Method
	// ========================================================================
	/**
	 * Calculates the {@link Cylinder}'s {@link #volume}.
	 * 
	 * @version  1.0.1, 01/10/2019
	 * @since  1.0, 02/13/2017
	 */
	public void calcVolume() 
	{
		// Calculate cylinder's volume
		volume = Math.PI * (radius * radius) * height;	
		// Format cylinder's volume to two decimal places
		String vStr = String.format("%.2f", volume);	
		// Convert cylinder's volume String to Double 
		volume = Double.parseDouble(vStr);						
	}	

	// ========================================================================
	// Set Radius Method
	// ========================================================================
	/**
	 * Sets the {@link Cylinder}'s {@link #radius} measurement.
	 * 
	 * @param radius  the measurement of the {@link #radius}
	 * 
	 * @version  1.0.1, 01/10/2019
	 * @since  1.0, 02/13/2017
	 */
	public void setRadius(double radius) 
	{
		// Set cylinder's radius
		this.radius = radius;									
	}

	// ========================================================================
	// Set Height Method
	// ========================================================================
	/**
	 * Sets the {@link Cylinder}'s {@link #height} measurement.
	 * 
	 * @param height  the measurement of the {@link #height}
	 * 
	 * @version  1.0.1, 01/10/2019
	 * @since  1.0, 02/13/2017
	 */
	public void setHeight(double height) 
	{
		// Set cylinder's height
		this.height = height;									
	}

	// ========================================================================
	// Get Radius Method
	// ========================================================================
	/**
	 * Returns the {@link Cylinder}'s {@link #radius} measurement.
	 * 
	 * @return  the measurement of the {@link #radius}
	 * 
	 * @version  1.0.1, 01/10/2019
	 * @since  1.0, 02/13/2017
	 */
	public double getRadius() 
	{
		// Return cylinder's radius
		return radius;																										
	}

	// ========================================================================
	// Get Height Method
	// ========================================================================
	/**
	 * Returns the {@link Cylinder}'s {@link #height} measurement.
	 * 
	 * @return  the measurement of the {@link #height}
	 * 
	 * @version  1.0.1, 01/10/2019
	 * @since  1.0, 02/13/2017
	 */
	public double getHeight() 
	{	
		// Return cylinder's height
		return height;																											
	}
	
	// ========================================================================
	// Get Area Method
	// ========================================================================
	/**
	 * Returns the {@link Cylinder}'s {@link #area} measurement.
	 * 
	 * @return  the measurement of the {@link #area}
	 * 
	 * @version  1.0.1, 01/10/2019
	 * @since  1.0, 02/13/2017
	 */
	public double getArea() 
	{
		// Return cylinder's area	
		return area;																										
	}
	
	// ========================================================================
	// Get Circumference Method
	// ========================================================================
	/**
	 * Returns the {@link Cylinder}'s {@link #circumference} measurement.
	 * 
	 * @return  the measurement of the {@link #circumference}
	 * 
	 * @version  1.0.1, 01/10/2019
	 * @since  1.0, 02/13/2017
	 */
	public double getCircumference() 
	{	
		// Return cylinder's circumference	
		return circumference;																						
	}

	// ========================================================================
	// Get Volume Method
	// ========================================================================
	/**
	 * Returns the {@link Cylinder}'s {@link #volume} measurement.
	 * 
	 * @return  the measurement of the {@link #volume}
	 * 
	 * @version  1.0.1, 01/10/2019
	 * @since  1.0, 02/13/2017
	 */
	public double getVolume() 
	{	
		// Return cylinder's volume 
		return volume;																											
	}
	
	// ========================================================================
	// To String Method
	// ========================================================================
	/**
	 * Returns the String representation of the {@link Cylinder} object's 
	 * properties.
	 * 
	 * @return  the properties of the {@link Cylinder} object as a String
	 * 
	 * @version  1.0.1, 01/10/2019
	 * @since  1.0, 02/13/2017
	 */
	public String toString()
	{
		// Cylinder properties
		String data = "\nCircumference: " + circumference + "\nArea: " + area 
		              + "\nVolume: " + volume + "\nRadius: " + radius  
		              + "\nHeight: " + height;
		// Return cylinder's properties	
		return data;																											
	}
}