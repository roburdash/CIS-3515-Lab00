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
public class Shape {
    
    //name of shape
    private String name;
    
    //constructor for Shape object
    public Shape(String name){
        
        this.name = name;
    }//end public Shape(String name)
    
    //returns name of shape
    public String getName(){
        
        //returns name of shape
        return name;
    }//end public String getName()
    
    //returns the area of the shape
    public double getArea(){
        
        return 0.0;
    }//end public double getArea()
    
    
    //print the dimensions of the shape
    public void printDimensions(){
        
        System.out.println("No Dimensions.");
    }//end public void printDimensions()
    
}//end public class Shape
