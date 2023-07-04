/**
 * @version 1.0
 * @author Bappi Mazumder
 * @since 7/4/2023
 * Project Name : java-design-pattern
 */

package com.bappi.designPattern.creational.abstractFactory;

public class AbstractFactoryPatternDemo {

    public static void main(String args[]){
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape shapeRectangle = shapeFactory.getShape("RECTANGLE");
        shapeRectangle.draw();
        Shape shapeSquare = shapeFactory.getShape("SQUARE");
        shapeSquare.draw();
        Shape shapeCircle = shapeFactory.getShape("CIRCLE");
        shapeCircle.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color greenColor = colorFactory.getColor("GREEN");
        greenColor.fill();

        Color blueColor = colorFactory.getColor("BLUE");
        blueColor.fill();
    }
}
