/**
 * @version 1.0
 * @author Bappi Mazumder
 * @since 7/13/2023
 * Project Name : java-design-pattern
 */

package com.bappi.designPattern.structural.decorator;
/* First of all we have a SimpleTroll implementing the Troll interface */
public class SimpleTroll implements Troll{
    @Override
    public void attack() {
        System.out.println("The troll tries to attack you");
    }

    @Override
    public int getAttackPower() {
        return 10;
    }

    @Override
    public void fleeBattle() {
        System.out.println("The troll shout in horror and run away");
    }
}
