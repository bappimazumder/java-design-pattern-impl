/**
 * @version 1.0
 * @author Bappi Mazumder
 * @since 7/11/2023
 * Project Name : java-design-pattern
 */

package com.bappi.designPattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/*
* Composite Object
* A composite object contains group of leaf objects and we should provide some helper methods to add or
* delete leafs from the group. We can also provide a method to remove all the elements from the group.
* Drawing.java
* */
public class Drawing implements Shape{

    List<Shape> shapes = new ArrayList<Shape>();
    @Override
    public void draw(String fillColor) {
        for (Shape sh: shapes){
            sh.draw(fillColor);
        }
    }

    public void addShape(Shape s){
        shapes.add(s);
    }

    public void removeShape(Shape s){
        shapes.remove(s);
    }

    public void removeAllShape(){
        System.out.println("Clearing all the shapes from drawing");
        this.shapes.clear();
    }
}
