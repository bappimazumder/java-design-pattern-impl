/**
 * @version 1.0
 * @author Bappi Mazumder
 * @since 7/15/2023
 * Project Name : java-design-pattern
 */

package com.bappi.designPattern.behavioral.strategy;
/*
* Now we will have to create concrete implementation of algorithms for payment using
* Addition/Subtraction/Multiplication.
* */
public class Addition implements Strategy{
    @Override
    public float calculation(float a, float b) {
        return a+b;
    }
}
