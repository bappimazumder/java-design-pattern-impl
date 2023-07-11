/**
 * @version 1.0
 * @author Bappi Mazumder
 * @since 7/11/2023
 * Project Name : java-design-pattern
 */

package com.bappi.designPattern.structural.composite;
/*
* Another Leaf class like circle
* */
public class Rectangle implements Shape{
    @Override
    public void draw(String fillColor) {
        System.out.println("set the Rectangle color " + fillColor);
    }
}
