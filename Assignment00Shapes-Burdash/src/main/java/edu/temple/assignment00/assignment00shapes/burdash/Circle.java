/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.temple.assignment00.assignment00shapes.burdash;

import java.lang.Math.*;

/**
 *
 * @author robur
 */
public class Circle extends Shape {
    
    double radius;      //radius of circle
    
    //constructor invoking superclass
    public Circle(String name) {
        
        //set name
        super(name);
    }//end public Circle(String name)
    
    //method to set dimensions of circle
    public void setDimensions(double radius){
        
        this.radius = radius;
    }//end public void setDimensions(double radius)

    @Override
    public void printDimensions() {
        
        //print radius of circle
        System.out.println("Radius: " + radius);
    }//end public void printDimensions()

    @Override
    public double getArea() {
        
        //return area of circle
        return Math.PI * radius * radius;
    }//end public double getArea()    
    
}//end public class Cirlce
