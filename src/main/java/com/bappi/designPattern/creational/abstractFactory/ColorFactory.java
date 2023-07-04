/**
 * @version 1.0
 * @author Bappi Mazumder
 * @since 7/4/2023
 * Project Name : java-design-pattern
 */

package com.bappi.designPattern.creational.abstractFactory;

public class ColorFactory extends AbstractFactory{
    @Override
    Shape getShape(String shapeType) {
        return null;
    }

    @Override
    Color getColor(String colorType) {
        if(colorType == null){
            return null;
        }
        if (colorType.equalsIgnoreCase("ORANGE")){
            return new Orange();
        }else if (colorType.equalsIgnoreCase("GREEN")){
            return new Green();
        }else if (colorType.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }
}
