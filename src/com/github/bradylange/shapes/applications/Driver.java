/*
 * Developer: Brady Lange
 * Course: CSIS 162 - Programming II
 * Institution: University of Wisconsin-River Falls
 * Class: Driver
 * Development Language: Java
 * Copyright Notice: MIT License, Copyright (c) 2019 Brady Lange
 */

package com.github.bradylange.shapes.applications;

// Import shape classes
import com.github.bradylange.shapeproperties.shapes.Circle;
import com.github.bradylange.shapeproperties.shapes.Cone;
import com.github.bradylange.shapeproperties.shapes.Cylinder;
import com.github.bradylange.shapeproperties.shapes.Parallelogram;
import com.github.bradylange.shapeproperties.shapes.Rectangle;
import com.github.bradylange.shapeproperties.shapes.RectangularSolid;
import com.github.bradylange.shapeproperties.shapes.Sphere;
import com.github.bradylange.shapeproperties.shapes.Trapezoid;
import com.github.bradylange.shapeproperties.shapes.Triangle;
import com.github.bradylange.shapeproperties.shapes.TriangularPrism;

/**
 * <p>
 * 		Calculates various shape measurements such as area, volume, perimeter,
 * 		or circumference as well as modifies their properties. Contains 
 * 		the {@link #main} method and "glues" other classes together.
 * </p>
 * <p>
 * 		Depends on:
 * </p>
 * <ul>
 * 		<li>
 * 			{@link Circle}
 * 		</li>
 * 		<li>
 * 			{@link Cone}
 * 		</li>
 * 		<li>
 * 			{@link Cylinder}
 * 		</li>
 * 		<li>
 * 			{@link Parallelogram}
 * 		</li>
 * 		<li>
 * 			{@link Rectangle}
 * 		</li>
 * 		<li>
 * 			{@link RectangularSolid}
 * 		</li>
 * 		<li>
 * 			{@link Sphere}
 * 		</li>
 * 		<li>
 * 			{@link Trapezoid}
 * 		</li>
 * 		<li>
 * 			{@link Triangle}
 * 		</li>
 * 		<li>
 * 			{@link TriangularPrism}
 * 		</li>
 * </ul>
 *
 * @author  Brady Lange - <a href = "https://www.linkedin.com/in/brady-lange/" 
 *                           target = "_blank">LinkedIn</a>
 * @version  1.0.1, 01/08/2019
 * @since  1.0, 02/13/2017
 */
public class Driver
{ 
	// ========================================================================
	// Main Method
	// ========================================================================
	/**
	 * Instantiates and sets up a {@link Circle}, {@link Cone},
	 * {@link Cylinder}, {@link Parallelogram}, {@link Rectangle},
	 * {@link RectangularSolid}, {@link Sphere}, {@link Trapezoid},
	 * {@link Triangle}, and {@link TriangularPrism}.
	 * 
	 * @param args  the array of command line arguments to be passed
	 * 
	 * @version  1.0.1, 01/08/2019
	 * @since  1.0, 02/13/2017
	 */
	public static void main(String[] args) 
	{
		// --------------------------------------------------------------------
		// Rectangle
		// --------------------------------------------------------------------
		System.out.println("************************************************");
		System.out.println("Shape Properties:");
		System.out.println("************************************************");
		// Construct default rectangle
		Rectangle defRect = new Rectangle();                                        
		System.out.println("Rectangle: ");
		System.out.println("************************************************");
		System.out.println("Default Constructor: " + defRect);
		System.out.println("------------------------------------------------");
		// Update rectangle's length
		defRect.setLength(30);          
		// Retrieve rectangle's length
		double newRectLen = defRect.getLength();                                    
		System.out.println("Updated length: " + newRectLen);
		System.out.println("------------------------------------------------");
		// Update rectangle's width
		defRect.setWidth(10);	
		// Calculate rectangle's area
		defRect.calcArea();     
		// Calculate rectangle's perimeter 
		defRect.calcPerimeter(); 													
		System.out.println("Updated Default Rectangle: " + defRect);
		System.out.println("------------------------------------------------");
		
		// Construct alternate rectangle
		Rectangle altRect = new Rectangle(20, 6);	
		// Calculate rectangle's area
		altRect.calcArea();		
		// Calculate rectangle's perimeter 
		altRect.calcPerimeter();													
		System.out.println("Alternate Constructor: " + altRect);
		// Retrieve rectangle's area
		double rectArea = altRect.getArea(); 										
		System.out.println("Area: " + rectArea);
		System.out.println("------------------------------------------------");
		
		// --------------------------------------------------------------------
		// Square 
		// --------------------------------------------------------------------
		// Update square's length
		defRect.setLength(15);		
		// Update square's width
		defRect.setWidth(15);	
		// Calculate square's area
		defRect.calcArea();		
		// Calculate square's perimeter
		defRect.calcPerimeter();													
		System.out.println("Rectangle Used as a Square: " + defRect);
		System.out.println("------------------------------------------------\n");
		System.out.println("************************************************");
		
		// --------------------------------------------------------------------
		// Parallelogram
		// --------------------------------------------------------------------
		// Construct default parallelogram
		Parallelogram defParallel = new Parallelogram();							
		System.out.println("Parallelogram: ");
		System.out.println("************************************************");
		System.out.println("Default Constructor: " + defParallel);
		System.out.println("------------------------------------------------");
		// Update parallelogram's base
		defParallel.setBase(60); 	
		// Retrieve parallelogram's base
		double newParaBase = defParallel.getBase();									
		System.out.println("Updated base: " + newParaBase);	
		System.out.println("------------------------------------------------");
		// Update parallelogram's height
		defParallel.setHeight(40);		
		// Calculate parallelogram's area
		defParallel.calcArea();		
		// Calculate parallelogram's perimeter 
		defParallel.calcPerimeter();												
		System.out.println("Updated Default Parallelogram: " + defParallel);
		System.out.println("------------------------------------------------");
		
		// Construct alternate parallelogram 
		Parallelogram altParallel = new Parallelogram(12, 6); 
		// Calculate parallelogram's area
		altParallel.calcArea();		
		// Calculate parallelogram's perimeter 
		altParallel.calcPerimeter();												
		System.out.println("Alternate Constructor: " + altParallel);
		// Retrieve parallelogram's height
		double newParaHeight = altParallel.getHeight();								
		System.out.println("Height: " + newParaHeight);
		System.out.println("------------------------------------------------\n");
		System.out.println("************************************************");
		
		// --------------------------------------------------------------------
		// Triangle
		// --------------------------------------------------------------------
		// Construct default triangle
		Triangle defTriangle = new Triangle(); 										
		System.out.println("Triangle: ");
		System.out.println("************************************************");
		System.out.println("Default Constructor: " + defTriangle);
		System.out.println("------------------------------------------------");
		// Update triangle's base
		defTriangle.setBase(40);		
		// Retrieve triangle's base
		double newTriBase = defTriangle.getBase();									
		System.out.println("Updated base: " + newTriBase);
		System.out.println("------------------------------------------------");
		// Update triangle's height
		defTriangle.setHeight(23);	
		// Update triangle's side 
		defTriangle.setSide(32);		
		// Calculate triangle's area
		defTriangle.calcArea();		
		// Calculate triangle's perimeter
		defTriangle.calcPerimeter();												 
		System.out.println("Updated Default Triangle: " + defTriangle);
		System.out.println("------------------------------------------------");
		
		// Construct alternate triangle 
		Triangle altTriangle = new Triangle(35, 21, 56);	
		// Calculate triangle's area
		altTriangle.calcArea();		
		// Calculate triangle's perimeter 
		altTriangle.calcPerimeter();												
		System.out.println("Alternate Constructor: " + altTriangle);
		// Retrieve triangle's height
		double newTriHeight = altTriangle.getHeight();								
		System.out.println("Height: " + newTriHeight);	
		System.out.println("------------------------------------------------\n");
		System.out.println("************************************************");
		
		// --------------------------------------------------------------------
		// Trapezoid
		// --------------------------------------------------------------------
		// Construct default trapezoid
		Trapezoid defTrapezoid = new Trapezoid(); 									
		System.out.println("Trapezoid: ");
		System.out.println("************************************************");
		System.out.println("Default Constructor: " + defTrapezoid);
		System.out.println("------------------------------------------------");
		// Update trapezoid's base one
		defTrapezoid.setBaseOne(12);				
		// Retrieve trapezoid's base one 
		double newTrapBaseOne = defTrapezoid.getBaseOne();							
		System.out.println("Updated Base One:  " + newTrapBaseOne);
		System.out.println("------------------------------------------------");
		// Update trapezoid's base two
		defTrapezoid.setBaseTwo(20);	
		// Update trapezoid's left side 
		defTrapezoid.setLeftSide(22);	
		// Update trapezoid's right side 
		defTrapezoid.setRightSide(10);	
		// Update trapezoid's height 
		defTrapezoid.setHeight(21);	
		// Calculate trapezoid's area 
		defTrapezoid.calcArea();
		// Calculate trapezoid's perimeter 
		defTrapezoid.calcPerimeter();												
		System.out.println("Updated Default Trapezoid: " + defTrapezoid);
		System.out.println("------------------------------------------------");
		
		// Construct alternate trapezoid
		Trapezoid altTrapezoid = new Trapezoid(10, 8, 9, 12, 15);	
		// Calculate trapezoid's area
		altTrapezoid.calcArea();	
		// Calculate trapezoid's perimeter 
		altTrapezoid.calcPerimeter();												
		System.out.println("Alternate Constructor: " + altTrapezoid);
		// Retrieve trapezoid's height 
		double newTrapHeight = altTrapezoid.getHeight();							
		System.out.println("Height: " + newTrapHeight);
		System.out.println("------------------------------------------------\n");
		System.out.println("************************************************");
		
		// --------------------------------------------------------------------
		// Circle
		// --------------------------------------------------------------------
		// Construct default circle
		Circle defCircle = new Circle(); 											
		System.out.println("Circle: ");
		System.out.println("************************************************");
		System.out.println("Default Constructor: " + defCircle);
		System.out.println("------------------------------------------------");
		// Update circle's diameter
		defCircle.setDiameter(20);		
		// Retrieve circle's diameter
		double newCircDiam = defCircle.getDiameter();								
		System.out.println("Updated diameter: " + newCircDiam);
		System.out.println("------------------------------------------------");
		// Update circle's radius
		defCircle.setRadius(10);	
		// Calculate circle's area
		defCircle.calcArea();	
		// Calculate circle's circumference
		defCircle.calcCircumference();												
		System.out.println("Updated Default Circle: " + defCircle);
		System.out.println("------------------------------------------------");
			
		// Construct alternate circle	
		Circle altCircle = new Circle(5, 10);
		// Calculate circle's area
		altCircle.calcArea();		
		// Calculate circle's circumference
		altCircle.calcCircumference();												
		System.out.println("Alternate Constructor: " + altCircle);
		// Retrieve circle's radius
		double newCircRadi = altCircle.getRadius();									
		System.out.println("Radius: " + newCircRadi);
		System.out.println("------------------------------------------------\n");
		System.out.println("************************************************");
		
		// --------------------------------------------------------------------
		// Rectangular Solid
		// --------------------------------------------------------------------
		// Construct default rectangular solid
		RectangularSolid defRectSol = new RectangularSolid(); 						
		System.out.println("Rectangular Solid: ");
		System.out.println("************************************************");
		System.out.println("Default Constructor: " + defRectSol);
		System.out.println("------------------------------------------------");
		// Update rectangular solid's height
		defRectSol.setHeight(56);				
		// Retrieve rectangular solid's height
		double newRectSolHeight = defRectSol.getHeight();							
		System.out.println("Updated height: " + newRectSolHeight);
		System.out.println("------------------------------------------------");
		// Update rectangular solid's length
		defRectSol.setLength(45);		
		// Update rectangular solid's width
		defRectSol.setWidth(33);	
		// Calculate rectangular solid's area
		defRectSol.calcArea();		
		// Calculate rectangular solid's perimeter 
		defRectSol.calcPerimeter();
		// Calculate rectangular solid's volume
		defRectSol.calcVolume(); 													
		System.out.println("Updated Default Rectangular Solid: " + defRectSol);
		System.out.println("------------------------------------------------");
		
		// Construct alternate rectangular solid 
		RectangularSolid altRectSol = new RectangularSolid(100, 77, 88); 
		// Calculate rectangular solid's area
		altRectSol.calcArea();		
		// Calculate rectangular solid's perimeter 
		altRectSol.calcPerimeter();	
		// Calculate rectangular solid's volume
		altRectSol.calcVolume();													
		System.out.println("Alternate Constructor: " + altRectSol);
		// Retrieve rectangular solid's length
		double newRectSolLength = altRectSol.getLength();							
		System.out.println("Length: " + newRectSolLength);
		System.out.println("------------------------------------------------\n");
		System.out.println("************************************************");
		
		// --------------------------------------------------------------------
		// Triangular Prism
		// --------------------------------------------------------------------
		// Construct default triangular prism
		TriangularPrism defTriPris = new TriangularPrism(); 						
		System.out.println("Triangular Prism: ");
		System.out.println("************************************************");
		System.out.println("Default Constructor: " + defTriPris);
		System.out.println("------------------------------------------------");
		// Update triangular prism's base 
		defTriPris.setBase(67);				
		// Retrieve triangular prism's base 
		double newTriPrisBase = defTriPris.getBase();								
		System.out.println("Updated base: " + newTriPrisBase);
		System.out.println("------------------------------------------------");
		// Update triangular prism's side two
		defTriPris.setSideTwo(89);		
		// Update triangular prism's side three
		defTriPris.setSideThree(44);
		// Update triangular prism's depth
		defTriPris.setDepth(25);
		// Update triangular prism's height
		defTriPris.setHeight(45);		
		// Calculate triangular prism's area
		defTriPris.calcArea();		
		// Calculate triangular prism's perimeter 
		defTriPris.calcPerimeter();	
		// Calculate triangular prism's volume
		defTriPris.calcVolume();													
		System.out.println("Updated Default Triangluar Prism: " + defTriPris);
		System.out.println("------------------------------------------------");
		
		// Construct alternate triangular prism	
		TriangularPrism altTriPris = new TriangularPrism(5, 10, 17, 19, 27); 
		// Calculate triangular prism's area
		altTriPris.calcArea();			
		// Calculate triangular prism's perimeter
		altTriPris.calcPerimeter();	
		// Calculate triangular prism's volume 
		altTriPris.calcVolume();													
		System.out.println("Alternate Constructor: " + altTriPris);
		// Retrieve triangular prism's side two
		double newTriPrisSideTwo = altTriPris.getSideTwo();		
		System.out.println("Side Two: " + newTriPrisSideTwo);
		System.out.println("------------------------------------------------\n");
		System.out.println("************************************************");
		
		// --------------------------------------------------------------------
		// Cylinder
		// --------------------------------------------------------------------
		// Construct default cylinder
		Cylinder defCylinder = new Cylinder();										
		System.out.println("Cylinder:");
		System.out.println("************************************************");
		System.out.println("Default Constructor: " + defCylinder);
		System.out.println("------------------------------------------------");
		// Update cylinder's radius
		defCylinder.setRadius(21);		
		// Retrieve cylinder's radius
		double newCylindRadi = defCylinder.getRadius();								
		System.out.println("Updated radius: " + newCylindRadi);
		System.out.println("------------------------------------------------");
		// Update cylinder's height
		defCylinder.setHeight(18);	
		// Calculate cylinder's area
		defCylinder.calcArea();			
		// Calculate cylinder's circumference
		defCylinder.calcCircumference();
		// Calculate cylinder's volume
		defCylinder.calcVolume();													
		System.out.println("Updated Default Cylinder: " + defCylinder);
		System.out.println("------------------------------------------------");
		
		// Construct alternate cylinder
		Cylinder altCylinder = new Cylinder(17, 31);	
		// Calculate cylinder's area
		altCylinder.calcArea();		
		// Calculate cylinder's circumference
		altCylinder.calcCircumference();	
		// Calculate cylinder's volume
		altCylinder.calcVolume();													
		System.out.println("Alternate Constructor: " + altCylinder);
		// Retrieve cylinder's height
		double newCylindHeight = altCylinder.getHeight();	
		System.out.println("Height: " + newCylindHeight);
		System.out.println("------------------------------------------------\n");
		System.out.println("************************************************");
		
		// --------------------------------------------------------------------
		// Cone
		// --------------------------------------------------------------------
		// Construct default cone
		Cone defCone = new Cone(); 													
		System.out.println("Cone: ");
		System.out.println("************************************************");
		System.out.println("Default Constructor: " + defCone);
		System.out.println("------------------------------------------------");
		// Update cone's radius
		defCone.setRadius(7);				
		// Retrieve cone's radius
		double newConeRadi = defCone.getRadius();									
		System.out.println("Updated radius: " + newConeRadi);
		System.out.println("------------------------------------------------");
		// Update cone's height
		defCone.setHeight(10);	
		// Update cone's side
		defCone.setSide(5);		
		// Calculate cone's area
		defCone.calcArea();			
		// Calculate cone's circumference	
		defCone.calcCircumference();	
		// Calculate cone's volume
		defCone.calcVolume();														
		System.out.println("Updated Default Cone: " + defCone);
		System.out.println("------------------------------------------------");
		
		// Construct alternate cone 
		Cone altCone = new Cone(12, 20, 11);	
		// Calculate cone's volume
		altCone.calcVolume();		
		// Calculate cone's area
		altCone.calcArea();		
		// Calculate cone's circumference 
		altCone.calcCircumference();												
		System.out.println("Alternate Constructor: " + altCone);
		// Retrieve cone's height
		double newConeHeight = altCone.getHeight();		
		System.out.println("Height: " + newConeHeight);
		System.out.println("------------------------------------------------\n");
		System.out.println("************************************************");
		
		// --------------------------------------------------------------------
		// Sphere
		// --------------------------------------------------------------------
		// Construct default sphere
		Sphere defSphere = new Sphere(); 											
		System.out.println("Sphere: ");
		System.out.println("************************************************");
		System.out.println("Default Constructor: " + defSphere);
		System.out.println("------------------------------------------------");
		// Update sphere's radius
		defSphere.setRadius(77);				
		// Retrieve sphere's radius
		double newSphereRadi = defSphere.getRadius();								
		System.out.println("Updated radius: " + newSphereRadi);
		System.out.println("------------------------------------------------");
		// Calculate sphere's area	
		defSphere.calcArea();	
		// Calculate sphere's circumference
		defSphere.calcCircumference();		
		// Calculate sphere's volume
		defSphere.calcVolume();														
		System.out.println("Updated Default Sphere: " + defSphere);
		System.out.println("------------------------------------------------");
		
		// Construct alternate sphere
		Sphere altSphere = new Sphere(10); 											
		// Calculate sphere's area
		altSphere.calcArea();	
		// Calculate sphere's circumference
		altSphere.calcCircumference();	
		// Calculate sphere's volume 
		altSphere.calcVolume();														
		System.out.println("Alternate Constructor: " + altSphere);
		// Retrieve sphere's area
		double newSphereArea = altSphere.getArea();	
		System.out.println("Area: " + newSphereArea);
		System.out.println("------------------------------------------------\n");
	}
}