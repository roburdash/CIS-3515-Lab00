/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.temple.assignment00.assignment00shapes.burdash;

import java.util.Scanner;

/**
 *
 * @author robur
 */
public class ShapesMain {
    
    public static void main(String args[]){
        
        Scanner in = new Scanner(System.in);    //scanner for user input
        double[] userIn = new double[3];                        //double array for user input
        
        //create one of each type of shape object
        Square square = new Square("square");
        Circle circle = new Circle("circle");
        Triangle triangle = new Triangle("triangle");
        EquilateralTriangle eTriangle = new EquilateralTriangle("equals");
        
        //ask user for dimensions of the square
        System.out.println("Please enter a length for a square: ");
        userIn[0] = in.nextDouble();
        System.out.println("Please enter a height for a square: ");
        userIn[1] = in.nextDouble();
        square.setDimensions(userIn[0], userIn[1]);
        
        //ask user for dimension of the circle
        System.out.println("Please enter a radius for a circle");
        userIn[0] = in.nextDouble();
        circle.setDimensions(userIn[0]);
        
        //ask user for dimension of the triangle
        System.out.println("Please enter the length of a side of a triangle: ");
        userIn[0] = in.nextDouble();
        System.out.println("Please enter the length of another side of a triangle: ");
        userIn[1] = in.nextDouble();
        System.out.println("Please enter the length of the final side of a triangle: ");
        userIn[2] = in.nextDouble();
        triangle.setDimensions(userIn[0], userIn[1], userIn[2]);
        
        //ask user for dimension of the equilateral triangle
        System.out.println("Please enter the length of all side of an equilateral triangle: ");
        userIn[0] = in.nextDouble();
        eTriangle.setDimensions(userIn[0]);
        
        //print out object info
        System.out.println(square.getName() + " information.");
        square.printDimensions();
        System.out.println("Area: " + square.getArea());
        System.out.println(circle.getName() + " information.");
        circle.printDimensions();
        System.out.println("Area: " + circle.getArea());
        System.out.println(triangle.getName() + " information.");
        triangle.printDimensions();
        System.out.println("Area: " + triangle.getArea());
        System.out.println(eTriangle.getName() + " information.");
        eTriangle.printDimensions();
        System.out.println("Area: " + eTriangle.getArea());        
        
    }//end public static foic main(String args[])
    
}//end public class ShapesMain
