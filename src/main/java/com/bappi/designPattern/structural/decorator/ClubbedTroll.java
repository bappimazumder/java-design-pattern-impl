/**
 * @version 1.0
 * @author Bappi Mazumder
 * @since 7/13/2023
 * Project Name : java-design-pattern
 */

package com.bappi.designPattern.structural.decorator;
/*
*  Decorator class implements the component interface and it has a HAS-A relationship with the
*  component interface. The component variable should be accessible to the child decorator classes,
*  so we will make this variable protected.
* */
public class ClubbedTroll implements Troll{

    protected Troll decoratedTroll;

    public ClubbedTroll(Troll decoratedTroll) {
        this.decoratedTroll = decoratedTroll;
    }

    @Override
    public void attack() {
        decoratedTroll.attack();
        System.out.println("This troll swings at you with a club");
    }

    @Override
    public int getAttackPower() {
        return decoratedTroll.getAttackPower()+20;
    }

    @Override
    public void fleeBattle() {
        decoratedTroll.fleeBattle();
    }
}
