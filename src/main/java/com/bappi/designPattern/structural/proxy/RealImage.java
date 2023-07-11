/**
 * @version 1.0
 * @author Bappi Mazumder
 * @since 7/11/2023
 * Project Name : java-design-pattern
 */

package com.bappi.designPattern.structural.proxy;

public class RealImage implements Image{
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading from the disk " + fileName);
    }
}
