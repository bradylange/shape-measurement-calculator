/*
 * Developer: Brady Lange
 * Course: CSIS 162 - Programming II
 * Institution: University of Wisconsin-River Falls
 * Class: TriangularPrism
 * Development Language: Java
 * Copyright Notice: MIT License, Copyright (c) 2019 Brady Lange
 */

package com.github.bradylange.shapeproperties.shapes;

/**
 * <p>
 * 		Contains triangular prism properties and algorithms to modify them.
 * </p>
 * <p>
 * 		Triangular prism - a polyhedron made of a triangular base, a translated 
 *                         copy, and 3 faces joining corresponding sides.
 * </p>
 * 
 * @author  Brady Lange - <a href = "https://www.linkedin.com/in/brady-lange/" 
 *                           target = "_blank">LinkedIn</a>
 * @version  1.0.1, 01/08/2019
 * @since  1.0, 02/13/2017
 */
public class TriangularPrism 
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
	 * 			((({@link #base} * {@link #depth}) / 2.0) * 2) 
	 *          + ({@link #base} * {@link #height}) 
	 *          + ({@link #height} * {@link #sideTwo}) 
	 *          + ({@link #height} * {@link #sideThree})
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
	 * 			(({@link #base} * {@link #depth}) / 2.0) * {@link #height}
	 * 		</li>
	 * </ul>
	 */
	private double volume;
	/**
	 * The measurement of the continuous line forming the boundary.
	 * <br>
	 * <p style = "font-style: italic;">
	 * 		Formula:
	 * </p>
	 * <ul>
	 * 		<li>
	 * 			2 * {@link #area} 
	 *          + ({@link #base} + {@link #sideTwo} + {@link #sideThree}) 
	 *          * {@link #height}
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
	/**
	 * The measurement from the top to the bottom.
	 */
	private double depth;
	/**
	 * Second side measurement.
	 */
	private double sideTwo;
	/**
	 * Third side measurement.
	 */
	private double sideThree;	
	
	// ========================================================================
	// Default Constructor
	// ========================================================================
	/**
	 * Constructs a {@link TriangularPrism} object with the default properties.
	 * 
	 * @version  1.0.1, 01/08/2019
	 * @since  1.0, 02/13/2017
	 */
	public TriangularPrism() 
	{
		// Instantiate default properties
		base = 0;																						
		sideTwo = 0;																							
		sideThree = 0;																							
		height = 0;																							
		depth = 0;																							
	}
	
	// ========================================================================
	// Alternate Constructor
	// ========================================================================
	/**
	 * Constructs a {@link TriangularPrism} object with the properties 
	 * {@link #base}, {@link #sideTwo}, {@link #sideThree}, {@link #height}, 
	 * and {@link #depth}.
	 * 
	 * @param base  the measurement of the {@link #base}
	 * @param sideTwo  the measurement of the {@link #sideTwo}
	 * @param sideThree  the measurement of the {@link #sideThree}
	 * @param height  the measurement of the {@link #height}
	 * @param depth  the measurement of the {@link #depth}
	 * 
	 * @version  1.0.1, 01/08/2019
	 * @since  1.0, 02/13/2017
	 */
	public TriangularPrism(double base, double sideTwo, double sideThree, 
	                       double height, double depth) 
	{
		// Instantiate properties with parameter values 
		this.base = base;																							
		this.sideTwo = sideTwo;																						
		this.sideThree = sideThree;																					
		this.height = height;																					
		this.depth = depth;																						
	}
	
	// ========================================================================
	// Calculate Area Method
	// ========================================================================
	/**
	 * Calculates the {@link TriangularPrism}'s {@link #area}.
	 * 
	 * @version  1.0.1, 01/08/2019
	 * @since  1.0, 02/13/2017
	 */
	public void calcArea() 
	{
		// Calculate triangular prism's area
		area = (((base * depth) / 2.0) * 2) + (base * height) 
		       + (height * sideTwo) + (height * sideThree);	
		// Format triangular prism's area to two decimal places 
		String aStr = String.format("%.2f", area);	
		// Convert triangular prism's area String to Double
		area = Double.parseDouble(aStr);								
	}
	
	// ========================================================================
	// Calculate Volume Method
	// ========================================================================
	/**
	 * Calculates the {@link TriangularPrism}'s {@link #volume}.
	 * 
	 * @version  1.0.1, 01/08/2019
	 * @since  1.0, 02/13/2017
	 */
	public void calcVolume() 
	{	
		// Calculate triangular prism's volume
		volume = ((base * depth) / 2.0) * height;	
		// Format triangular prism's volume to two decimal places 
		String vStr = String.format("%.2f", volume);
		// Convert triangular prism's volume String to Double
		volume = Double.parseDouble(vStr);								
	}
	
	// ========================================================================
	// Calculate Perimeter Method
	// ========================================================================-
	/**
	 * Sets the {@link TriangularPrism}'s {@link #perimeter}.
	 * 
	 * @version  1.0.1, 01/08/2019
	 * @since  1.0, 02/13/2017
	 */
	public void calcPerimeter() 
	{
		// Calculate triangular prism's perimeter
		perimeter = 2 * area + (base + sideTwo + sideThree) * height;
		// Format triangular prism's perimeter to two decimal places 
		String pStr = String.format("%.2f", perimeter);	
		// Convert triangular prism's perimeter String to Double
		perimeter = Double.parseDouble(pStr);							
	}
	
	// ========================================================================
	// Set Base Method
	// ========================================================================
	/**
	 * Sets the {@link TriangularPrism}'s {@link #base} measurement.
	 * 
	 * @param base  the measurement of the {@link #base}
	 * 
	 * @version  1.0.1, 01/08/2019
	 * @since  1.0, 02/13/2017
	 */
	public void setBase(double base)
	{
		// Set triangular prism's base 
		this.base = base;												
	}
	
	// ========================================================================
	// Set Side Two Method
	// ========================================================================
	/**
	 * Sets the {@link TriangularPrism}'s {@link #sideTwo} measurement.
	 * 
	 * @param sideTwo  the measurement of the {@link #sideTwo}
	 * 
	 * @version  1.0.1, 01/08/2019
	 * @since  1.0, 02/13/2017
	 */
	public void setSideTwo(double sideTwo)
	{
		// Set triangular prism's side two
		this.sideTwo = sideTwo;											
	}	
	
	// ========================================================================
	// Set Side Three Method
	// ========================================================================	
	/**
	 * Sets the {@link TriangularPrism}'s {@link #sideThree} measurement.
	 * 
	 * @param sideThree  the measurement of the {@link #sideThree}
	 * 
	 * @version  1.0.1, 01/08/2019
	 * @since  1.0, 02/13/2017
	 */
	public void setSideThree(double sideThree)
	{
		// Set triangular prism's side three
		this.sideThree = sideThree;										
	}	
	
	// ========================================================================
	// Set Depth Method
	// ========================================================================
	/**
	 * Sets the {@link TriangularPrism}'s {@link #depth} measurement.
	 * 
	 * @param depth  the measurement of the {@link #depth}
	 * 
	 * @version  1.0.1, 01/08/2019
	 * @since  1.0, 02/13/2017
	 */
	public void setDepth(double depth)
	{
		// Set triangular prism's depth
		this.depth = depth;												
	}
	
	// ========================================================================
	// Set Height Method
	// ========================================================================	
	/**
	 * Sets the {@link TriangularPrism}'s {@link #height} measurement.
	 * 
	 * @param height  the measurement of the {@link #height}
	 * 
	 * @version  1.0.1, 01/08/2019
	 * @since  1.0, 02/13/2017
	 */
	public void setHeight(double height)
	{
		// Set triangular prism's height
		this.height = height;											
	}	
	
	// ========================================================================
	// Get Base Method
	// ========================================================================	
	/**
	 * Returns the {@link TriangularPrism}'s {@link #base} measurement.
	 * 
	 * @return  the measurement of the {@link #base}
	 * 
	 * @version  1.0.1, 01/08/2019
	 * @since  1.0, 02/13/2017
	 */
	public double getBase()
	{
		// Return triangular prism's base 	
		return base;																						
	}
	
	// ========================================================================
	// Get Side Two Method
	// ========================================================================
	/**
	 * Returns the {@link TriangularPrism}'s {@link #sideTwo} measurement.
	 * 
	 * @return  the measurement of the {@link #sideTwo}
	 * 
	 * @version  1.0.1, 01/08/2019
	 * @since  1.0, 02/13/2017
	 */
	public double getSideTwo()
	{
		// Return triangular prism's side two
		return sideTwo;																		
	}
	
	// ========================================================================
	// Get Side Three Method
	// ========================================================================	
	/**
	 * Returns the {@link TriangularPrism}'s {@link #sideThree} measurement.
	 * 
	 * @return  the measurement of the {@link #sideThree}
	 * 
	 * @version  1.0.1, 01/08/2019
	 * @since  1.0, 02/13/2017
	 */
	public double getSideThree()
	{
		// Return triangular prism's side three
		return sideThree;												
	}
	
	// ========================================================================
	// Get Depth Method
	// ========================================================================
	/**
	 * Returns the {@link TriangularPrism}'s {@link #depth} measurement.
	 * 
	 * @return  the measurement of the {@link #depth}
	 * 
	 * @version  1.0.1, 01/08/2019
	 * @since  1.0, 02/13/2017
	 */
	public double getDepth()
	{
		// Return triangular prism's depth 
		return depth;																					
	}
	
	// ========================================================================
	// Get Height Method
	// ========================================================================	
	/**
	 * Returns the {@link TriangularPrism}'s {@link #height} measurement.
	 * 
	 * @return  the measurement of the {@link #height}
	 * 
	 * @version  1.0.1, 01/08/2019
	 * @since  1.0, 02/13/2017
	 */
	public double getHeight()
	{
		// Return triangular prism's height 
		return height;																				
	}	
	
	// ========================================================================
	// Get Area Method
	// ========================================================================
	/**
	 * Returns the {@link TriangularPrism}'s {@link #area} measurement.
	 * 
	 * @return  the measurement of the {@link #area}
	 * 
	 * @version  1.0.1, 01/08/2019
	 * @since  1.0, 02/13/2017
	 */
	public double getArea() 
	{
		// Return triangular prism's area
		return area;													 								
	}
	
	// ========================================================================
	// Get Perimeter Method
	// ========================================================================
	/**
	 * Returns the {@link TriangularPrism}'s {@link #perimeter} measurement.
	 * 
	 * @return  the measurement of the {@link #perimeter}
	 * 
	 * @version  1.0.1, 01/08/2019
	 * @since  1.0, 02/13/2017
	 */
	public double getPerimeter() 
	{
		// Return triangular prism's perimeter 
		return perimeter;																		
	}
	
	// ========================================================================
	// Get Volume Method
	// ========================================================================
	/**
	 * Returns the {@link TriangularPrism}'s {@link #volume} measurement.
	 * 
	 * @return  the measurement of the {@link #volume}
	 * 
	 * @version  1.0.1, 01/08/2019
	 * @since  1.0, 02/13/2017
	 */
	public double getVolume() 
	{
		// Return triangular prism's volume 
		return volume;																		
	}
	
	// ========================================================================
	// To String Method
	// ========================================================================	
	/**
	 * Returns the String representation of the {@link TriangularPrism} 
	 * object's properties.
	 * 
	 * @return  the properties of the {@link TriangularPrism} object as a String
	 * 
	 * @version  1.0.1, 01/08/2019
	 * @since  1.0, 02/13/2017
	 */
	public String toString()
	{
		// Triangular prism's properties
		String data = "\nPerimeter: " + perimeter + "\nArea: " + area 
		              + "\nVolume: " + volume + "\nBase: " + base 
		              + "\nHeight: " + height + "\nDepth: " + depth 
		              + "\nSide Two: " + sideTwo + "\nSide Three: " 
		              + sideThree;
		// Return triangular prism's properties	
		return data;													
	}	
} 