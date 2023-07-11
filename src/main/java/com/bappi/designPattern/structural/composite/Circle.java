/**
 * @version 1.0
 * @author Bappi Mazumder
 * @since 7/11/2023
 * Project Name : java-design-pattern
 */

package com.bappi.designPattern.structural.composite;
/*
* Leaf implements base component and these are the building block for the composite.
*  We can create multiple leaf objects such as Rectangle, Circle etc.
* */
public class Circle implements Shape{
    @Override
    public void draw(String fillColor) {
        System.out.println("Set the circle color "+fillColor);
    }
}
