/**
 * @version 1.0
 * @author Bappi Mazumder
 * @since 7/4/2023
 * Project Name : java-design-pattern
 */

package com.bappi.designPattern.creational.abstractFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String type){

        if(type.equalsIgnoreCase("SHAPE")){
                return new ShapeFactory();
        }else if(type.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
