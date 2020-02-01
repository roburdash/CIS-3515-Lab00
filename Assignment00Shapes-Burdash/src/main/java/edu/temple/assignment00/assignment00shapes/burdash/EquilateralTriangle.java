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
public class EquilateralTriangle extends Triangle {

    //set name of equilateral triangle invoking super class
    public EquilateralTriangle(String name) {
        
        //set name of equilateral triangle
        super(name);
    }//end public Equilateral Triangle(String name)

    //set sides of equilateral triangle invoking super class
    public void setDimensions(double side) {
        
        //set all sides of equilateral triangle to the same value
        super.setDimensions(side, side, side);
    }//end public void setDimensions(double side)
        
}//end public class EquilateralTriangle extend Triangle
