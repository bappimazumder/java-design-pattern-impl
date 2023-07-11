/**
 * @version 1.0
 * @author Bappi Mazumder
 * @since 7/11/2023
 * Project Name : java-design-pattern
 */

package com.bappi.designPattern.structural.composite;

public class TestCompositePattern {

    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape circle2 = new Circle();
        Shape rectangle2 = new Rectangle();

        Drawing drawing = new Drawing();
        drawing.addShape(circle);
        drawing.addShape(circle2);
        drawing.addShape(rectangle);
        drawing.addShape(rectangle2);

        drawing.draw("Green");

        drawing.removeAllShape();

        drawing.addShape(circle);
        drawing.addShape(rectangle);
        drawing.draw("Blue");

    }
}
