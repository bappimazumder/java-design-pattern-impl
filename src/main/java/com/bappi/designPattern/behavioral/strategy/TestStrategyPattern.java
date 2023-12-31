/**
 * @version 1.0
 * @author Bappi Mazumder
 * @since 7/15/2023
 * Project Name : java-design-pattern
 */

package com.bappi.designPattern.behavioral.strategy;
/*
* Strategy design pattern is one of the behavioral design pattern. Strategy pattern is used when
* we have multiple algorithm for a specific task and client decides the actual implementation to be used
* at runtime.
* Strategy pattern is also known as Policy Pattern.
*
* We define multiple algorithms and let client application pass the algorithm to be used as a parameter.
* One of the best example of strategy pattern is Collections.sort() method that takes Comparator parameter.
* Based on the different implementations of Comparator interfaces, the Objects are getting sorted in different
*  ways.
* */
public class TestStrategyPattern {

    public static void main(String[] args) {
        float num1 = 20;
        float num2 = 10;
        Context addContext = new Context(new Addition());
        System.out.println("Addition = " + addContext.executeStrategy(num1,num2));


        Context multiContext = new Context(new Multiplication());
        System.out.println("Multiplication = " + multiContext.executeStrategy(num1,num2));

        Context subtract = new Context(new Subtraction());
        System.out.println("Subtraction = " +subtract.executeStrategy(num1,num2));

    }
}
