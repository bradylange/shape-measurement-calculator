/*
 * Developer: Brady Lange
 * Course: CSIS 162 - Programming II
 * Institution: University of Wisconsin-River Falls
 * Class: Rectangle
 * Development Language: Java
 * Copyright Notice: MIT License, Copyright (c) 2019 Brady Lange
 */

package com.github.bradylange.shapeproperties.shapes;

/**
 * <p>
 * 		Contains rectangle properties and algorithms to modify them. 
 * </p>
 * <p>
 * 		Rectangle - a plane figure with four straight sides and four right 
 *                  angles, especially one with unequal adjacent sides, in 
 *                  contrast to a square.
 * </p>
 * 
 * @author  Brady Lange - <a href = "https://www.linkedin.com/in/brady-lange/" 
 *                           target = "_blank">LinkedIn</a>
 * @version  1.0.1, 01/10/2019
 * @since  1.0, 02/13/2017
 */
public class Rectangle 
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
	 * 			{@link #length} * {@link #width}
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
	 * 			2 * ({@link #length} + {@link #width})
	 * 		</li>
	 * </ul>
	 */
	private double perimeter;
	/**
	 * The measurement from end to end.
	 */
	private double length;
	/**
	 * The measurement from side to side.
	 */
	private double width;			
	
	// ========================================================================
	// Default Constructor
	// ========================================================================
	/**
	 * Constructs a {@link Rectangle} object with the default properties.
	 * 
	 * @version  1.0.1, 01/10/2019
	 * @since  1.0, 02/13/2017
	 */
	public Rectangle() 
	{ 
		// Instantiate default properties
		length = 0;																			
		width = 0;																			
	} 
	
	// ========================================================================
	// Alternate Constructor
	// ========================================================================
	/**
	 * Constructs a {@link Rectangle} object with the properties {@link #length}
	 * and {@link #width}.
	 * 
	 * @param length  the measurement of the {@link #length}
	 * @param width  the measurement of the {@link #width}
	 * 
	 * @version  1.0.1, 01/10/2019
	 * @since  1.0, 02/13/2017
	 */
	public Rectangle(double length, double width) 
	{ 
		// Instantiate properties with parameter values 
		this.length = length;																		
		this.width = width;																	
	} 
	
	// ========================================================================
	// Calculate Area Method
	// ========================================================================
	/**
	 * Calculates the {@link Rectangle}'s {@link #area}.
	 * 
	 * @version  1.0.1, 01/10/2019
	 * @since  1.0, 02/13/2017
	 */
	public void calcArea() 
	{ 
		// Calculate rectangle's area
		area = length * width;	
		// Format rectangle's area to two decimal places
		String aStr = String.format("%.2f", area);
		// Convert rectangle's area String to Double
		area = Double.parseDouble(aStr);							
	} 
	
	// ========================================================================
	// Calculate Perimeter Method
	// ========================================================================
	/**
	 * Calculates the {@link Rectangle}'s {@link #perimeter}.
	 * 
	 * @version  1.0.1, 01/10/2019
	 * @since  1.0, 02/13/2017
	 */
	public void calcPerimeter() 
	{
		// Calculate rectangle's perimeter
		perimeter = 2 * (length + width);	
		// Format rectangle's perimeter to two decimal places
		String pStr = String.format("%.2f", perimeter);		
		// Convert rectangle's perimeter String to Double
		perimeter = Double.parseDouble(pStr);						 
	} 
	
	// ========================================================================
	// Set Length Method
	// ========================================================================
	/**
	 * Sets the {@link Rectangle}'s {@link #length} measurement.
	 * 
	 * @param length  the measurement of the {@link #length}
	 * 
	 * @version  1.0.1, 01/10/2019
	 * @since  1.0, 02/13/2017
	 */
	public void setLength(double length) 
	{ 
		// Set rectangle's length
		this.length = length;										
	} 
	
	// ========================================================================
	// Set Width Method
	// ========================================================================
	/**
	 * Sets the {@link Rectangle}'s {@link #width} measurement.
	 * 
	 * @param width  the measurement of the {@link #width}
	 * 
	 * @version  1.0.1, 01/10/2019
	 * @since  1.0, 02/13/2017
	 */
	public void setWidth(double width) 
	{ 
		// Set rectangle's width
		this.width = width;											
	} 
	
	// ========================================================================
	// Get Length Method
	// ========================================================================	
	/**
	 * Returns the {@link Rectangle}'s {@link #length} measurement.
	 * 
	 * @return  the measurement of the {@link #length}
	 * 
	 * @version  1.0.1, 01/10/2019
	 * @since  1.0, 02/13/2017
	 */
	public double getLength() 
	{ 
		// Return rectangle's length
		return length;																								
	} 
	
	// ========================================================================
	// Get Width Method
	// ========================================================================
	/**
	 * Returns the {@link Rectangle}'s {@link #width} measurement.
	 * 
	 * @return  the measurement of the {@link #width}
	 * 
	 * @version  1.0.1, 01/10/2019
	 * @since  1.0, 02/13/2017
	 */
	public double getWidth() 
	{ 
		// Return rectangle's width
		return width;																												
	} 
	
	// ========================================================================
	// Get Area Method
	// ========================================================================
	/**
	 * Returns the {@link Rectangle}'s {@link #area} measurement.
	 * 
	 * @return  the measurement of the {@link #area}
	 * 
	 * @version  1.0.1, 01/10/2019
	 * @since  1.0, 02/13/2017
	 */
	public double getArea()
	{ 
		// Return rectangle's area
		return area;																												
	} 
	
	// ========================================================================
	// Get Perimeter Method
	// ========================================================================
	/**
	 * Returns the {@link Rectangle}'s {@link #perimeter} measurement.
	 * 
	 * @return  the measurement of the {@link #perimeter}
	 * 
	 * @version  1.0.1, 01/10/2019
	 * @since  1.0, 02/13/2017
	 */
	public double getPerimeter()
	{ 
		// Return rectangle's perimeter
		return perimeter;											 																
	} 

	// ========================================================================
	// To String Method
	// ========================================================================
	/**
	 * Returns the String representation of the {@link Rectangle} object's 
	 * properties.
	 * 
	 * @return  the properties of the {@link Rectangle} object as a String
	 * 
	 * @version  1.0.1, 01/10/2019
	 * @since  1.0, 02/13/2017
	 */
	public String toString() 
	{ 
		// Rectangle properties
		String data = "\nPerimeter: " + perimeter + "\nArea: " + area 
		              + "\nLength: " + length + "\nWidth: " + width;
		// Return rectangle's properties	
		return data; 																												
	} 
}