/**
 * @version 1.0
 * @author Bappi Mazumder
 * @since 7/11/2023
 * Project Name : java-design-pattern
 */

package com.bappi.designPattern.structural.composite;

/* Base Component
*  Base component defines the common methods for leaf and composites.
*  We can create a class Shape with a method draw(String fillColor) to draw the shape with given color.
*  Shape.java
* */
public interface Shape {
    public  void draw(String fillColor);
}
