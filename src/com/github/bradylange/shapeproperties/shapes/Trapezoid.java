/*
 * Developer: Brady Lange
 * Course: CSIS 162 - Programming II
 * Institution: University of Wisconsin-River Falls
 * Class: Trapezoid
 * Development Language: Java
 * Copyright Notice: MIT License, Copyright (c) 2019 Brady Lange
 */

package com.github.bradylange.shapeproperties.shapes;

/**
 * <p>
 * 		Contains trapezoid properties and algorithms to modify them.
 * </p>
 * <p>
 * 		Trapezoid - a quadrilateral with only one pair of parallel sides.
 * </p>
 * 
 * @author  Brady Lange - <a href = "https://www.linkedin.com/in/brady-lange/" 
 *                           target = "_blank">LinkedIn</a>
 * @version  1.0.1, 01/09/2019
 * @since  1.0, 02/13/2017
 */
public class Trapezoid 
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
	 * 			(({@link #baseOne} + {@link #baseTwo}) / 2) * {@link #height}
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
	 * 			{@link #baseOne} + {@link #baseTwo} + {@link #leftSide} 
	 *          + {@link #rightSide}
	 * 		</li>
	 * </ul>
	 */
	private double perimeter;
	/**
	 * The first side which is perpendicular to the altitude.
	 */
	private double baseOne; 
	/**
	 * The second side which is perpendicular to the altitude.
	 */
	private double baseTwo;
	/**
	 * The measurement from base to top.
	 */
	private double height;
	/**
	 * Left side.
	 */
	private double leftSide;
	/**
	 * Right side.
	 */
	private double rightSide;

	// ========================================================================
	// Default Constructor
	// ========================================================================
	/**
	 * Constructs a {@link Trapezoid} object with the default properties.
	 * 
	 * @version  1.0.1, 01/09/2019
	 * @since  1.0, 02/13/2017
	 */
	public Trapezoid() 
	{
		// Instantiate default properties 
		baseOne = 0;																						
		baseTwo = 0;																							
		height = 0;																							
		leftSide = 0;																						
		rightSide = 0;																						
	}

	// ========================================================================
	// Alternate Constructor
	// ========================================================================
	/**
	 * Constructs a {@link Trapezoid} object with the properties 
	 * {@link #baseOne}, {@link #baseTwo}, {@link #height}, {@link #leftSide}, 
	 * and {@link #rightSide}.
	 * 
	 * @param baseOne  the measurement of the {@link #baseOne}
	 * @param baseTwo  the measurement of the {@link #baseTwo}
	 * @param height  the measurement of the {@link #height}
	 * @param lSide  the measurement of the {@link #leftSide}
	 * @param rSide  the measurement of the {@link #rightSide}
	 * 
	 * @version  1.0.1, 01/09/2019
	 * @since  1.0, 02/13/2017
	 */
	public Trapezoid(double baseOne, double baseTwo, double height, 
	                 double lSide, double rSide)
	{
		// Instantiate properties with parameter values 
		this.baseOne = baseOne;																						
		this.baseTwo = baseTwo;																						
		this.height = height;																						
		this.leftSide = lSide;																					
		this.rightSide = rSide;																					
	}
	
	// ========================================================================
	// Calculate Area Method
	// ========================================================================
	/**
	 * Calculates the {@link Trapezoid}'s {@link #area}.
	 * 
	 * @version  1.0.1, 01/09/2019
	 * @since  1.0, 02/13/2017
	 */
	public void calcArea()
	{
		// Calculate trapezoid's area
		area = ((baseOne + baseTwo) / 2) * height;
		// Format trapezoid's area to two decimal places
		String aStr = String.format("%.2f", area);	
		// Convert trapezoid's area String to Double 
		area = Double.parseDouble(aStr);							
	}

	// ========================================================================
	// Calculate Perimeter Method
	// ========================================================================
	/**
	 * Calculates the {@link Trapezoid}'s {@link #perimeter}.
	 * 
	 * @version  1.0.1, 01/09/2019
	 * @since  1.0, 02/13/2017
	 */
	public void calcPerimeter() 
	{
		// Calculate trapezoid's perimeter 
		perimeter = baseOne + baseTwo + leftSide + rightSide;
		// Format trapezoid's perimeter to two decimal places 
		String pStr = String.format("%.2f", perimeter);		
		// Convert trapezoid's perimeter String to Double
		perimeter = Double.parseDouble(pStr);						
	}

	// ========================================================================
	// Set Base One Method
	// ========================================================================
	/**
	 * Sets the {@link Trapezoid}'s {@link #baseOne} measurement.
	 * 
	 * @param baseOne  the measurement of the {@link #baseOne}
	 * 
	 * @version  1.0.1, 01/09/2019
	 * @since  1.0, 02/13/2017
	 */
	public void setBaseOne(double baseOne) 
	{
		// Set trapezoid's base one	
		this.baseOne = baseOne;																	
	}
	
	// ========================================================================
	// Set Base Two Method
	// ========================================================================
	/**
	 * Sets the {@link Trapezoid}'s {@link #baseTwo} measurement.
	 * 
	 * @param baseTwo  the measurement of the {@link #baseTwo}
	 * 
	 * @version  1.0.1, 01/09/2019
	 * @since  1.0, 02/13/2017
	 */
	public void setBaseTwo(double baseTwo) 
	{	
		// Set trapezoid's base two 
		this.baseTwo = baseTwo;										
	}

	// ========================================================================
	// Set Height Method
	// ========================================================================
	/**
	 * Sets the {@link Trapezoid}'s {@link #height} measurement.
	 * 
	 * @param height  the measurement of the {@link #height}
	 * 
	 * @version  1.0.1, 01/09/2019
	 * @since  1.0, 02/13/2017
	 */
	public void setHeight(double height) 
	{	
		// Set trapezoid's height
		this.height = height;										
	}

	// ========================================================================
	// Set Left Side Method
	// ========================================================================
	/**
	 * Sets the {@link Trapezoid}'s {@link #leftSide} measurement.
	 * 
	 * @param lSide  the measurement of the {@link #leftSide}
	 * 
	 * @version  1.0.1, 01/09/2019
	 * @since  1.0, 02/13/2017
	 */
	public void setLeftSide(double lSide) 
	{
		// Set trapezoid's left side
		this.leftSide = lSide;										 
	}

	// ========================================================================
	// Set Right Side Method
	// ========================================================================
	/**
	 * Sets the {@link Trapezoid}'s {@link #rightSide} measurement.
	 * 
	 * @param rSide  the measurement of the {@link #rightSide}
	 * 
	 * @version  1.0.1, 01/09/2019
	 * @since  1.0, 02/13/2017
	 */
	public void setRightSide(double rSide) 
	{
		// Set trapezoid's right side 
		this.rightSide = rSide;										
	}

	// ========================================================================
	// Get Base One Method
	// ========================================================================
	/**
	 * Returns the {@link Trapezoid}'s {@link #baseOne} measurement.
	 * 
	 * @return  the measurement of the {@link #baseOne}
	 * 
	 * @version  1.0.1, 01/09/2019
	 * @since  1.0, 02/13/2017
	 */
	public double getBaseOne()
	{
		// Return trapezoid's base one
		return baseOne;												 
	}

	// ========================================================================
	// Get Base Two Method
	// ========================================================================
	/**
	 * Returns the {@link Trapezoid}'s {@link #baseTwo} measurement.
	 * 
	 * @return  the measurement of the {@link #baseTwo}
	 * 
	 * @version  1.0.1, 01/09/2019
	 * @since  1.0, 02/13/2017
	 */
	public double getBaseTwo() 
	{
		// Return trapezoid's base two 
		return baseTwo;														
	}

	// ========================================================================
	// Get Height Method
	// ========================================================================-
	/**
	 * Returns the {@link Trapezoid}'s {@link #height} measurement.
	 * 
	 * @return  the measurement of the {@link #height}
	 * 
	 * @version  1.0.1, 01/09/2019
	 * @since  1.0, 02/13/2017
	 */
	public double getHeight() 
	{
		// Return trapezoid's height 
		return height;																																
	}

	// ========================================================================
	// Get Left Side Method
	// ========================================================================
	/**
	 * Returns the {@link Trapezoid}'s {@link #leftSide} measurement.
	 * 
	 * @return  the measurement of the {@link #leftSide}
	 * 
	 * @version  1.0.1, 01/09/2019
	 * @since  1.0, 02/13/2017
	 */
	public double getLeftSide() 
	{	
		// Return trapezoid's left side 
		return leftSide;																															
	}

	// ========================================================================
	// Get Right Side Method
	// ========================================================================
	/**
	 * Returns the {@link Trapezoid}'s {@link #rightSide} measurement.
	 * 
	 * @return  the measurement of the {@link #rightSide}
	 * 
	 * @version  1.0.1, 01/09/2019
	 * @since  1.0, 02/13/2017
	 */
	public double getRightSide() 
	{
		// Return trapezoid's right side
		return rightSide;											 																				
	}
	
	// ========================================================================
	// Get Area Method
	// ========================================================================
	/**
	 * Returns the {@link Trapezoid}'s {@link #area} measurement.
	 * 
	 * @return  the measurement of the {@link #area}
	 * 
	 * @version  1.0.1, 01/09/2019
	 * @since  1.0, 02/13/2017
	 */
	public double getArea() 
	{	
		// Return trapezoid's area 
		return area;																																
	}
	
	// ========================================================================
	// Get Perimeter Method
	// ========================================================================
	/**
	 * Returns the {@link Trapezoid}'s {@link #perimeter} measurement.
	 * 
	 * @return  the measurement of the {@link #perimeter}
	 * 
	 * @version  1.0.1, 01/09/2019
	 * @since  1.0, 02/13/2017
	 */
	public double getPerimeter() 
	{
		// Return trapezoid's perimeter 
		return perimeter;																														 
	}
	
	// ========================================================================
	// To String Method
	// ========================================================================
	/**
	 * Returns the String representation of the {@link Trapezoid} object's 
	 * properties.
	 * 
	 * @return  the properties of the {@link Trapezoid} object as a String
	 * 
	 * @version  1.0.1, 01/09/2019
	 * @since  1.0, 02/13/2017
	 */
	public String toString()
	{
		// Trapezoid properties
		String data = "\nPerimeter: " + perimeter + "\nArea: " + area 
		              + "\nBase Two: " + baseOne + "\nBase One: " + baseTwo 
		              + "\nHeight: " + height + "\nLeft Side: " + leftSide 
		              + "\nRight Side: " + rightSide;
		// Return trapezoid's properties
		return data;																														
	}
} 