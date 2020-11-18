/*
 * Developer: Brady Lange
 * Course: CSIS 162 - Programming II
 * Institution: University of Wisconsin-River Falls
 * Class: RectangularSolid
 * Development Language: Java
 * Copyright Notice: MIT License, Copyright (c) 2019 Brady Lange
 */

package com.github.bradylange.shapeproperties.shapes;

/**
 * <p>
 * 		Contains rectangular solid properties and algorithms to modify them.
 * </p>
 * <p>
 * 		Rectangular solid - a three dimensional object with six sides, 
 *                          all of which are rectangles.
 * </p>
 * 
 * @author  Brady Lange - <a href = "https://www.linkedin.com/in/brady-lange/" 
 *                           target = "_blank">LinkedIn</a>
 * @version  1.0.1, 01/10/2019
 * @since  1.0, 02/13/2017
 */
public class RectangularSolid 
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
	 * 			2 * ({@link #width} * {@link #length} + {@link #height} 
	 *          * {@link #length} + {@link #height} * {@link #width})
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
	 * 			{@link #length} * {@link #width} * {@link #height}
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
	 * 			2 * {@link #width} + 2 * {@link #length}
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
	/**
	 * The measurement from base to top.
	 */
	private double height;		
	
	// ========================================================================
	// Default Constructor
	// ========================================================================
	/**
	 * Constructs a {@link RectangularSolid} object with the default properties.
	 * 
	 * @version  1.0.1, 01/10/2019
	 * @since  1.0, 02/13/2017
	 */
	public RectangularSolid() 
	{
		// Instantiate default properties
		length = 0; 																			
		width = 0;																			
		height = 0;																				
	}
	
	// ========================================================================
	// Alternate Constructor
	// ========================================================================
	/**
	 * Constructs a {@link RectangularSolid} object with the properties
	 * {@link #length}, {@link #width}, and {@link #height}.
	 * 
	 * @param length  the measurement of the length
	 * @param width  the measurement of the width
	 * @param height  the measurement of the height
	 * 
	 * @version  1.0.1, 01/10/2019
	 * @since  1.0, 02/13/2017
	 */
	public RectangularSolid(double length, double width, double height) 
	{
		// Instantiate properties with parameter values 
		this.length = length;																		
		this.width = width;																		
		this.height = height;																			
	}
	
	// ========================================================================
	// Calculate Area Method
	// ========================================================================
	/**
	 * Calculates the {@link RectangularSolid}'s {@link #area}.
	 * 
	 * @version  1.0.1, 01/10/2019
	 * @since  1.0, 02/13/2017
	 */
	public void calcArea() 
	{
		// Calculate rectangular solid's area
		area = 2 * (width * length + height * length + height * width);	
		// Format rectangular solid's area to two decimal places
		String aStr = String.format("%.2f", area);		
		// Convert rectangular solid's area String to Double
		area = Double.parseDouble(aStr);									
	}
	
	// ========================================================================
	// Calculate Volume Method
	// ========================================================================
	/**
	 * Calculates the {@link RectangularSolid}'s {@link #volume}.
	 * 
	 * @version  1.0.1, 01/10/2019
	 * @since  1.0, 02/13/2017
	 */
	public void calcVolume() 
	{
		// Calculate rectangular solid's volume
		volume = length * width * height;
		// Format rectangular solid's volume to two decimal places
		String vStr = String.format("%.2f", volume);
		// Convert rectangular solid's volume String to Double
		volume = Double.parseDouble(vStr);									
	}
	
	// ========================================================================
	// Calculate Perimeter Method
	// ========================================================================
	/**
	 * Calculates the {@link RectangularSolid}'s {@link #perimeter}.
	 * 
	 * @version  1.0.1, 01/10/2019
	 * @since  1.0, 02/13/2017
	 */
	public void calcPerimeter() 
	{
		// Calculate rectangular solid's perimeter 
		perimeter = 2 * width + 2 * length;		
		// Format rectangular solid's perimeter to two decimal places
		String cStr = String.format("%.2f", perimeter);		
		// Convert rectangular solid's perimeter String to Double
		perimeter = Double.parseDouble(cStr);								
	}	
	
	// ========================================================================
	// Set Length Method
	// ========================================================================
	/**
	 * Sets the {@link RectangularSolid}'s {@link #length} measurement.
	 * 
	 * @param length  the measurement of the {@link #length}
	 * 
	 * @version  1.0.1, 01/10/2019
	 * @since  1.0, 02/13/2017
	 */
	public void setLength(double length)
	{
		// Set rectangular solid's length
		this.length = length;																								
	}
	
	// ========================================================================
	// Set Width Method
	// ========================================================================
	/**
	 * Sets the {@link RectangularSolid}'s {@link #width} measurement.
	 * 
	 * @param width  the measurement of the {@link #width}
	 * 
	 * @version  1.0.1, 01/10/2019
	 * @since  1.0, 02/13/2017
	 */
	public void setWidth(double width) 
	{
		// Set rectangular solid's width
		this.width = width;													
	}	
	
	// ========================================================================
	// Set Height Method
	// ========================================================================
	/**
	 * Sets the {@link RectangularSolid}'s {@link #height} measurement.
	 * 
	 * @param height  the measurement of the {@link #height}
	 * 
	 * @version  1.0.1, 01/10/2019
	 * @since  1.0, 02/13/2017
	 */
	public void setHeight(double height)
	{
		// Set rectangular solid's height
		this.height = height;												
	}
	
	// ========================================================================
	// Get Length Method
	// ========================================================================
	/**
	 * Returns the {@link RectangularSolid}'s {@link #length} measurement.
	 * 
	 * @return  the measurement of the {@link #length}
	 * 
	 * @version  1.0.1, 01/10/2019
	 * @since  1.0, 02/13/2017
	 */
	public double getLength() 
	{
		// Return rectangular solid's length
		return length;																												
	}
	
	// ========================================================================
	// Get Width Method
	// ========================================================================
	/**
	 * Returns the {@link RectangularSolid}'s {@link #width} measurement.
	 * 
	 * @return  the measurement of the {@link #width}
	 * 
	 * @version  1.0.1, 01/10/2019
	 * @since  1.0, 02/13/2017
	 */
	public double getWidth()
	{
		// Return rectangular solid's width	
		return width;																														
	}
	
	// ========================================================================
	// Get Height Method
	// ========================================================================
	/**
	 * Returns the {@link RectangularSolid}'s {@link #height} measurement.
	 * 
	 * @return  the measurement of the {@link #height}
	 * 
	 * @version  1.0.1, 01/10/2019
	 * @since  1.0, 02/13/2017
	 */
	public double getHeight() 
	{
		// Return rectangular solid's height
		return height;																												
	}
	
	// ========================================================================
	// Get Area Method
	// ========================================================================
	/**
	 * Returns the {@link RectangularSolid}'s {@link #area} measurement.
	 * 
	 * @return  the measurement of the {@link #area}
	 * 
	 * @version  1.0.1, 01/10/2019
	 * @since  1.0, 02/13/2017
	 */
	public double getArea() 
	{
		// Return rectangular solid's area
		return area;														 														
	}
	
	// ========================================================================
	// Get Perimeter Method
	// ========================================================================
	/**
	 * Returns the {@link RectangularSolid}'s {@link #perimeter}.
	 * 
	 * @return  the measurement of the {@link #perimeter}
	 * 
	 * @version  1.0.1, 01/10/2019
	 * @since  1.0, 02/13/2017
	 */
	public double getPerimeter()
	{
		// Return rectangular solid's perimeter 
		return perimeter;																												
	}
	
	// ========================================================================
	// Get Volume Method
	// ========================================================================
	/**
	 * Returns the {@link RectangularSolid}'s {@link #volume}.
	 * 
	 * @return  the measurement of the {@link #volume}
	 * 
	 * @version  1.0.1, 01/10/2019
	 * @since  1.0, 02/13/2017
	 */
	public double getVolume() 
	{
		// Return rectangular solid's volume
		return volume;																												
	}
	
	// ========================================================================
	// To String Method
	// ========================================================================
	/**
	 * Returns the String representation of the {@link RectangularSolid} 
	 * object's properties.
	 * 
	 * @return  the properties of the {@link RectangularSolid} object as a 
	 *          String
	 *          
	 * @version  1.0.1, 01/10/2019
	 * @since  1.0, 02/13/2017
	 */
	public String toString() 
	{
		// Rectangular solid's properties
		String data = "\nPerimeter:  " + perimeter + "\nArea: " + area 
		              + "\nLength: " + length + "\nWidth: " + width 
		              + "\nHeight: " + height;
		// Return rectangular solid's properties
		return data;																						
	}
}