/*
 * Developer: Brady Lange
 * Course: CSIS 162 - Programming II
 * Institution: University of Wisconsin-River Falls
 * Class: Sphere
 * Development Language: Java
 * Copyright Notice: MIT License, Copyright (c) 2019 Brady Lange
 */

package com.github.bradylange.shapeproperties.shapes;

/**
 * <p>
 * 		Contains sphere properties and algorithms to modify them. 
 * </p>
 * <p>
 * 		Sphere - a round solid figure, or its surface, with every point on 
 * 		         its surface equidistant from its center.
 * </p>
 * 
 * @author  Brady Lange - <a href = "https://www.linkedin.com/in/brady-lange/" 
 *                           target = "_blank">LinkedIn</a>
 * @version  1.0.1, 01/09/2019
 * @since  1.0, 02/13/2017
 */
public class Sphere 
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
	 * 			4 * 3.14 * ({@link #radius} * {@link #radius})
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
	 * 			(4 / 3.0) * 3.14 
	 *          * ({@link #radius} * {@link #radius} * {@link #radius})
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
	
	// ========================================================================
	// Default Constructor
	// ========================================================================
	/**
	 * Constructs a {@link Sphere} object with the default properties.
	 * 
	 * @version  1.0.1, 01/09/2019
	 * @since  1.0, 02/13/2017
	 */
	public Sphere() 
	{
		// Instantiate default properties
		radius = 0;																				
	}
	
	// ========================================================================
	// Alternate Constructor
	// ========================================================================
	/**
	 * Constructs a {@link Sphere} object with the property {@link #radius}.
	 * 
	 * @param radius  the measurement of the {@link #radius}
	 * 
	 * @version  1.0.1, 01/09/2019
	 * @since  1.0, 02/13/2017
	 */
	public Sphere(double radius) 
	{	
		// Instantiate properties with parameter values 
		this.radius = radius;																			
	}
	
	// ========================================================================
	// Calculate Area Method
	// ========================================================================
	/**
	 * Calculates the {@link Sphere}'s {@link #area}.
	 * 
	 * @version  1.0.1, 01/09/2019
	 * @since  1.0, 02/13/2017
	 */
	public void calcArea()
	{
		// Calculate sphere's area
		area = 4 * Math.PI * (radius * radius);	
		// Format sphere's area to two decimal places
		String aStr = String.format("%.2f", area);	
		// Convert sphere's area String to Double
		area = Double.parseDouble(aStr);								
	}
	
	// ========================================================================
	// Calculate Volume Method
	// ========================================================================
	/**
	 * Calculates the {@link Sphere}'s {@link #volume}.
	 * 
	 * @version  1.0.1, 01/09/2019
	 * @since  1.0, 02/13/2017
	 */
	public void calcVolume()
	{		
		// Calculate spheres' volume 
		volume = (4 / 3.0) * Math.PI * (radius * radius * radius);	
		// Format sphere's volume to two decimal places 
		String cStr = String.format("%.2f", volume);	
		// Convert sphere's volume String to Double
		volume = Double.parseDouble(cStr);								
	}
	
	// ========================================================================
	// Calculate Circumference Method
	// ========================================================================
	/**
	 * Calculates the {@link Sphere}'s {@link #circumference}.
	 * 
	 * @version  1.0.1, 01/09/2019
	 * @since  1.0, 02/13/2017
	 */
	public void calcCircumference() 
	{
		// Calculate sphere's circumference
		circumference = 2 * Math.PI * radius;		
		// Format sphere's circumference to two decimal places 
		String cStr = String.format("%.2f", circumference);	
		// Convert sphere's circumference String to Double
		circumference = Double.parseDouble(cStr);						
	}
	
	// ========================================================================
	// Set Radius Method
	// ========================================================================
	/**
	 * Sets the {@link Sphere}'s {@link #radius} measurement.
	 * 
	 * @param radius  the measurement of the {@link #radius}
	 * 
	 * @version  1.0.1, 01/09/2019
	 * @since  1.0, 02/13/2017
	 */
	public void setRadius(double radius) 
	{
		// Set sphere's radius
		this.radius = radius;											
	}
	
	// ========================================================================
	// Get Radius Method
	// ========================================================================
	/**
	 * Returns the {@link Sphere}'s {@link #radius} measurement. 
	 * 
	 * @return  the measurement of the {@link #radius}
	 * 
	 * @version  1.0.1, 01/09/2019
	 * @since  1.0, 02/13/2017
	 */
	public double getRadius() 
	{
		// Return sphere's radius
		return radius;																													
	}
	
	// ========================================================================
	// Get Area Method
	// ========================================================================
	/**
	 * Returns the {@link Sphere}'s {@link #area} measurement.
	 * 
	 * @return  measurement of the {@link #area}
	 * 
	 * @version  1.0.1, 01/09/2019
	 * @since  1.0, 02/13/2017
	 */
	public double getArea() 
	{
		// Return sphere's area	
		return area;																													
	}
	
	// ========================================================================
	// Get Circumference Method
	// ========================================================================
	/**
	 * Returns the {@link Sphere}'s {@link #circumference} measurement.
	 * 
	 * @return  measurement of the {@link #circumference}
	 * 
	 * @version  1.0.1, 01/09/2019
	 * @since  1.0, 02/13/2017
	 */
	public double getCircumference()
	{
		// Return sphere's circumference
		return circumference;																											
	}
	
	// ========================================================================
	// Get Volume Method
	// ========================================================================
	/**
	 * Returns the {@link Sphere}'s {@link #volume} measurement.
	 * 
	 * @return  measurement of the {@link #volume}
	 * 
	 * @version  1.0.1, 01/09/2019
	 * @since  1.0, 02/13/2017
	 */
	public double getVolume() 
	{
		// Return sphere's volume
		return volume;																														
	}
	
	// ========================================================================
	// To String Method
	// ========================================================================
	/**
	 * Returns the String representation of the {@link Sphere} object's 
	 * properties.
	 * 
	 * @return  the properties of the {@link Sphere} object as a String
	 * 
	 * @version  1.0.1, 01/09/2019
	 * @since  1.0, 02/13/2017
	 */
	public String toString() 
	{
		// Sphere properties
		String data = "\nCircumference: " + circumference + "\nArea: " + area 
		              + "\nVolume: " + volume + "\nRadius: " + radius;
		// Return sphere's properties	
		return data;																													
	}
}