/**
 * @version 1.0
 * @author Bappi Mazumder
 * @since 7/15/2023
 * Project Name : java-design-pattern
 */

package com.bappi.designPattern.behavioral.strategy;

public class Subtraction implements Strategy{
    @Override
    public float calculation(float a, float b) {
        return a-b;
    }
}
