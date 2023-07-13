/**
 * @version 1.0
 * @author Bappi Mazumder
 * @since 7/13/2023
 * Project Name : java-design-pattern
 */

package com.bappi.designPattern.structural.decorator;
/*
* Decorator design pattern is used to modify the functionality of an object at runtime.
*  At the same time other instances of the same class will not be affected by this, so individual object
* gets the modified behavior.
* */
public class TestDecoratorPattern {

    public static void main(String[] args) {
        // Simple troll test
        System.out.println(" Testing program With a simple troll ");
        Troll troll = new SimpleTroll();
        troll.attack();
        troll.fleeBattle();
        System.out.println("Simple troll power: " + troll.getAttackPower());

        // change the behavior of the simple troll by adding a decorator
        System.out.println(" Testing program With a decorator troll ");
        Troll clubbedTroll = new ClubbedTroll(troll);
        clubbedTroll.attack();
        clubbedTroll.fleeBattle();
        System.out.println("Clubbed troll power: "+ clubbedTroll.getAttackPower());
    }
}