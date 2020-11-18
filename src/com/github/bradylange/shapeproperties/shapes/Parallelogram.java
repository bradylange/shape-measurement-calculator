/*
 * Developer: Brady Lange
 * Course: CSIS 162 - Programming II
 * Institution: University of Wisconsin-River Falls
 * Class: Parallelogram
 * Development Language: Java
 * Copyright Notice: MIT License, Copyright (c) 2019 Brady Lange
 */

package com.github.bradylange.shapeproperties.shapes;

/**
 * <p>
 * 		Contains parallelogram properties and algorithms to modify them. 
 * </p>
 * <p>
 * 		Parallelogram - a four-sided plane rectilinear figure with opposite 
 *                      sides parallel.
 * </p>
 * 
 * @author  Brady Lange - <a href = "https://www.linkedin.com/in/brady-lange/" 
 *                           target = "_blank">LinkedIn</a>
 * @version  1.0.1, 01/10/2019
 * @since  1.0, 02/13/2017
 */
public class Parallelogram 
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
	 * 			{@link #base} * {@link #height}
	 * 		</li>
	 * </ul>
	 */
	private double area;
	/**
	 * The measurement of the continuous line forming the boundary.
	 * <br>
	 * <p style = "font-style: italic;">
	 * 		Formula:
	 * </p>
	 * <ul>
	 * 		<li>
	 * 			2 * ({@link #base} * {@link #height})
	 * 		</li>
	 * </ul>
	 */
	private double perimeter;	
	/**
	 * The side which is perpendicular to the altitude.
	 */
	private double base;
	/**
	 * The measurement from base to top.
	 */
	private double height; 
									
	// ========================================================================
	// Default Constructor
	// ========================================================================
	/**
	 * Constructs a {@link Parallelogram} object with the default properties.
	 * 
	 * @version  1.0.1, 01/10/2019
	 * @since  1.0, 02/13/2017
	 */
	public Parallelogram() 
	{ 
		// Instantiate default properties
		base = 0;																			
		height = 0;																			
	} 
	
	// ========================================================================
	// Alternate Constructor
	// ========================================================================
	/**
	 * Constructs a {@link Parallelogram} object with the properties 
	 * {@link #base} and {@link #height}.
	 * 
	 * @param base  the measurement of the {@link #base}
	 * @param height  the measurement of the {@link #height}
	 * 
	 * @version  1.0.1, 01/10/2019
	 * @since  1.0, 02/13/2017
	 */
	public Parallelogram(double base, double height) 
	{ 
		// Instantiate properties with parameter values 
		this.base = base;																			
		this.height = height;																		
	} 
	
	// ========================================================================
	// Calculate Area Method
	// ========================================================================
	/**
	 * Calculates the {@link Parallelogram}'s {@link #area}.
	 * 
	 * @version  1.0.1, 01/10/2019
	 * @since  1.0, 02/13/2017
	 */
	public void calcArea() 
	{
		// Calculate parallelogram's area
		area = base * height;	
		// Format parallelogram's area to two decimal places
		String aStr = String.format("%.2f", area);	
		// Convert parallelogram's area String to Double 
		area = Double.parseDouble(aStr);							
	}
	
	// ========================================================================
	// Calculate Perimeter Method
	// ========================================================================
	/**
	 * Calculates the {@link Parallelogram}'s {@link #perimeter}.
	 * 
	 * @version  1.0.1, 01/10/2019
	 * @since  1.0, 02/13/2017
	 */
	public void calcPerimeter() 
	{
		// Calculate parallelogram's perimeter
		perimeter = 2 * (base * height);	
		// Format parallelogram's perimeter to two decimal places
		String pStr = String.format("%.2f", perimeter);		
		// Convert parallelogram's perimeter String to Double 
		perimeter = Double.parseDouble(pStr);						
	}	
	
	// ========================================================================
	// Set Height Method
	// ========================================================================
	/**
	 * Sets the {@link Parallelogram}'s {@link #height} measurement.
	 * 
	 * @param height  the measurement of the {@link #height}
	 * 
	 * @version  1.0.1, 01/10/2019
	 * @since  1.0, 02/13/2017
	 */
	public void setHeight(double height) 
	{
		// Set parallelogram's height
		this.height = height;										
	}
	
	// ========================================================================
	// Set Base Method
	// ========================================================================
	/**
	 * Sets the {@link Parallelogram}'s {@link #base} measurement.
	 * 
	 * @param base  the measurement of the {@link #base}
	 * 
	 * @version  1.0.1, 01/10/2019
	 * @since  1.0, 02/13/2017
	 */
	public void setBase(double base) 
	{
		// Set parallelogram's base 
		this.base = base;											
	}
	
	// ========================================================================
	// Get Height Method
	// ========================================================================
	/**
	 * Returns the {@link Parallelogram}'s {@link #height} measurement.
	 * 
	 * @return  the measurement of the {@link #height}
	 * 
	 * @version  1.0.1, 01/10/2019
	 * @since  1.0, 02/13/2017
	 */
	public double getHeight() 
	{
		// Return parallelogram's height
		return height;																										
	}
	
	// ========================================================================
	// Get Base Method
	// ========================================================================
	/**
	 * Returns the {@link Parallelogram}'s {@link #base} measurement.
	 * 
	 * @return  the measurement of the {@link #base}
	 * 
	 * @version  1.0.1, 01/10/2019
	 * @since  1.0, 02/13/2017
	 */
	public double getBase() 
	{
		// Return parallelogram's base 	
		return base;																											
	}
	
	// ========================================================================
	// Get Area Method
	// ========================================================================
	/**
	 * Returns the {@link Parallelogram}'s {@link #area} measurement.
	 * 
	 * @return  the measurement of the {@link #area}
	 * 
	 * @version  1.0.1, 01/10/2019
	 * @since  1.0, 02/13/2017
	 */
	public double getArea() 
	{
		// Return parallelogram's area 	
		return area;																										
	}
	
	// ========================================================================
	// Get Perimeter Method
	// ========================================================================
	/**
	 * Returns the {@link Parallelogram}'s {@link #perimeter} measurement.
	 * 
	 * @return  the measurement of the {@link #perimeter}
	 * 
	 * @version  1.0.1, 01/10/2019
	 * @since  1.0, 02/13/2017
	 */
	public double getPerimeter() 
	{
		// Return parallelogram's perimeter 
		return perimeter;																										 
	}
	
	// ========================================================================
	// To String Method
	// ========================================================================
	/**
	 * Returns the String representation of the {@link Parallelogram} object's 
	 * properties.
	 * 
	 * @return  the properties of the {@link Parallelogram} object as a String
	 * 
	 * @version  1.0.1, 01/10/2019
	 * @since  1.0, 02/13/2017
	 */
	public String toString()
	{
		// Parallelogram properties
		String data = "\nPerimeter: " + perimeter + "\nArea: " + area 
		              + "\nHeight: " + height + "\nBase: " + base;
		// Return parallelogram's properties	
		return data;																										
	}
} 