/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.temple.assignment00.assignment00shapes.burdash;

/**
 *
 * @author robur
 */
public class Triangle extends Shape {
    
    double sideA;      //first side of triangle
    double sideB;      //second side of triangle
    double sideC;      //third side of triangle
    
    //constructor invoking super class
    public Triangle(String name) {
        
        //set name of triangle
        super(name);
    }//end public Triangle(String name)
    
    //method to set dimensions of triangle
    public void setDimensions(double sideA, double sideB, double sideC){
        
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }//end public void setDimensions(double sideA, double sideB, double sideC)

    @Override
    public void printDimensions() {
        
        //print all sides of triangle
        System.out.println("Side A: " + sideA);
        System.out.println("Side B: " + sideB);
        System.out.println("Side C: " + sideC);
    }//end public void printDimensions()

    @Override
    public double getArea() {
        
        //perimeter of the triangle
        double perim = (sideA + sideB + sideC)/2;
        
        //area of the traingle
        double area = Math.sqrt(perim * (perim - sideA) * (perim - sideB) *(perim - sideC));
        
        return area;
    }//end public double getArea()    
    
}//end public class Triangle extends Shape
