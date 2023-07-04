/**
 * @version 1.0
 * @author Bappi Mazumder
 * @since 7/4/2023
 * Project Name : java-design-pattern
 */

package com.bappi.designPattern.creational.abstractFactory;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Circle draw is calling");
    }
}
