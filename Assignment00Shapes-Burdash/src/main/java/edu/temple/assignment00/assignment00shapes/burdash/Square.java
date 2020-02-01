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
public class Square extends Shape {
    
    double length;      //length of side of square
    double height;      //height of side of square
    
    //constructor for square object
    public Square(String name) {
        
        //set name invoking super class
        super(name);
    }//end public Square(String name)
    
    //method to set dimensions for square
    public void setDimensions(double length, double height){
        
        //sets length and height for square
        this.length = length;
        this.height = height;
    }//end public void setDimensions(double length, double height)

    @Override
    public void printDimensions() {
        
        //print length and height of square
        System.out.println("Length: " + length);
        System.out.println("Height: " + height);
    }//end public void printDimensions()

    @Override
    public double getArea() {
        
        //return area of square
        return length * height;
    }//end public double getArea()
    
}//end public class Square extends Shape
