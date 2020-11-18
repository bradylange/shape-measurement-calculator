/*
 * Developer: Brady Lange
 * Course: CSIS 162 - Programming II
 * Institution: University of Wisconsin-River Falls
 * Class: Triangle
 * Development Language: Java
 * Copyright Notice: MIT License, Copyright (c) 2019 Brady Lange
 */

package com.github.bradylange.shapeproperties.shapes;

/**
 * <p>
 * 		Contains triangle properties and algorithms to modify them. 
 * </p>
 * <p>
 * 		Triangle - a plane figure with three straight sides and three angles.
 * </p>
 * 
 * @author  Brady Lange - <a href = "https://www.linkedin.com/in/brady-lange/" 
 *                           target = "_blank">LinkedIn</a>
 * @version  1.0.1, 01/09/2019
 * @since  1.0, 02/13/2017
 */
public class Triangle 
{
	// ------------------------------------------------------------------------
	// Instance Variables
	// ------------------------------------------------------------------------
	/**
	 * The measurement of the surface.
	 * <br>
	 * </br>
	 * <p style = "font-style: italic;">
	 * 		Formula:
	 * </p>
	 * <ul>
	 * 		<li>
	 * 			(1 / 2.0 * {@link #base}) * {@link #height}
	 * 		</li>
	 * </ul>
	 */
	private double area;
	/**
	 * The measurement of the continuous line forming the boundary.
	 * <br>
	 * </br>
	 * <p style = "font-style: italic;">
	 * 		Formula:
	 * </p>
	 * <ul>
	 * 		<li>
	 * 			{@link #base} + {@link #height} + {@link #side}
	 * 		</li>
	 * </ul>
	 */
	private double perimeter;
	/**
	 * The measurement from base to top.
	 */
	private double height;
	/**
	 * The side which is perpendicular to the altitude.
	 */
	private double base;
	/**
	 * One side measurement.
	 */
	private double side;
	
	// ========================================================================
	// Default Constructor
	// ========================================================================
	/**
	 * Constructs a {@link Triangle} object with the default properties.
	 * 
	 * @version  1.0.1, 01/09/2019
	 * @since  1.0, 02/13/2017
	 */
	public Triangle() 
	{ 
		// Instantiate default properties
		base = 0; 															
		height = 0; 																			
		side = 0;																				
	} 
	
	// ========================================================================
	// Alternate Constructor
	// ========================================================================
	/**
	 * Constructs a {@link Triangle} object with the properties {@link #base}, 
	 * {@link #height}, and {@link #side}.
	 * 
	 * @param base  the measurement of the {@link #base}
	 * @param height  the measurement of the {@link #height}
	 * @param side  the measurement of the {@link #side}
	 * 
	 * @version  1.0.1, 01/09/2019
	 * @since  1.0, 02/13/2017
	 */
	public Triangle(double base, double height, double side) 
	{
		// Instantiate properties with parameter values 
		this.base = base;																				
		this.height = height;																			
		this.side = side;																				
	}
	
	// ========================================================================
	// Calculate Area Method
	// ========================================================================
	/**
	 * Calculates the {@link Triangle}'s {@link #area}.
	 * 
	 * @version  1.0.1, 01/09/2019
	 * @since  1.0, 02/13/2017
	 */
	public void calcArea() 
	{
		// Calculate triangle's area
		area = (1 / 2.0 * base) * height;	
		// Format triangle's area to two decimal places
		String aStr = String.format("%.2f", area);	
		// Convert triangle's area String to Double 
		area = Double.parseDouble(aStr);					
	}
	
	// ========================================================================
	// Calculate Perimeter Method
	// ========================================================================
	/**
	 * Calculates the {@link Triangle}'s {@link #perimeter}.
	 * 
	 * @version  1.0.1, 01/09/2019
	 * @since  1.0, 02/13/2017
	 */
	public void calcPerimeter() 
	{	
		// Calculate triangle's perimeter
		perimeter = base + height + side;	
		// Format triangle's perimeter to two decimal places 
		String pStr = String.format("%.2f", perimeter);	
		// Convert triangle's perimeter String to Double
		perimeter = Double.parseDouble(pStr);				
	}	

	// ========================================================================
	// Set Height Method
	// ========================================================================
	/**
	 * Sets the {@link Triangle}'s {@link #height} measurement.
	 * 
	 * @param height  the measurement of the {@link #height}
	 * 
	 * @version  1.0.1, 01/09/2019
	 * @since  1.0, 02/13/2017
	 */
	public void setHeight(double height) 
	{
		// Set triangle's height
		this.height = height;								
	}
	
	// ========================================================================
	// Set Base Method
	// ========================================================================
	/**
	 * Sets the {@link Triangle}'s {@link #base} measurement.
	 * 
	 * @param base  the measurement of the {@link #base}
	 * 
	 * @version  1.0.1, 01/09/2019
	 * @since  1.0, 02/13/2017
	 */
	public void setBase(double base)
	{
		// Set triangle's base
		this.base = base;									
	}
	
	// ========================================================================
	// Set Side Method
	// ========================================================================
	/**
	 * Sets the {@link Triangle}'s {@link #side} measurement.
	 * 
	 * @param side  the measurement of the {@link #side}
	 * 
	 * @version  1.0.1, 01/09/2019
	 * @since  1.0, 02/13/2017
	 */
	public void setSide(double side) 
	{
		// Set triangle's side 
		this.side = side;									
	}

	// ========================================================================
	// Get Height Method
	// ========================================================================
	/**
	 * Returns the {@link Triangle}'s {@link #height} measurement.
	 * 
	 * @return  the measurement of the {@link #height}
	 *
	 * @version  1.0.1, 01/09/2019
	 * @since  1.0, 02/13/2017
	 */
	public double getHeight() 
	{
		// Return triangle's height
		return height;																		
	}	
	
	// ========================================================================
	// Get Base Method
	// ========================================================================
	/**
	 * Returns the {@link Triangle}'s {@link #base} measurement.
	 * 
	 * @return  the measurement of the {@link #base}
	 * 
	 * @version  1.0.1, 01/09/2019
	 * @since  1.0, 02/13/2017
	 */
	public double getBase() 
	{
		// Return triangle's base 
		return base;																		
	}
	
	// ========================================================================
	// Get Side Method
	// ========================================================================
	/**
	 * Returns the {@link Triangle}'s {@link #side} measurement.
	 * 
	 * @return  the measurement of the {@link #side}
	 * 
	 * @version  1.0.1, 01/09/2019
	 * @since  1.0, 02/13/2017
	 */
	public double getSide()
	{	
		// Return triangle's side	
		return side;																		
	}
	
	// ========================================================================
	// Get Area Method
	// ========================================================================
	/**
	 * Returns the {@link Triangle}'s {@link #area} measurement.
	 * 
	 * @return  the measurement of the {@link #area}
	 * 
	 * @version  1.0.1, 01/09/2019
	 * @since  1.0, 02/13/2017
	 */
	public double getArea() 
	{
		// Return triangle's area 	
		return area;																	
	}
	
	// ========================================================================
	// Get Perimeter Method
	// ========================================================================
	/**
	 * Returns the {@link Triangle}'s {@link #perimeter} measurement.
	 * 
	 * @return  the measurement of the {@link #perimeter}
	 * 
	 * @version  1.0.1, 01/09/2019
	 * @since  1.0, 02/13/2017
	 */
	public double getPerimeter() 
	{
		// Return triangle's perimeter 
		return perimeter;																		
	}
	
	// ========================================================================
	// To String Method
	// ========================================================================
	/**
	 * Returns the String representation of the {@link Triangle} object's 
	 * properties.
	 * 
	 * @return  the properties of the {@link Triangle} object as a String
	 * 
	 * @version  1.0.1, 01/09/2019
	 * @since  1.0, 02/13/2017
	 */
	public String toString() 
	{
		// Triangle's properties
		String data = "\nPerimeter: " + perimeter + "\nArea: " + area 
		              + "\nHeight: " + height + "\nBase: " + base 
		              + "\nSide: " + side;
		// Return triangle's properties
		return data;																									
	}
}