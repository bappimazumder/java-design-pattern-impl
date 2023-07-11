/**
 * @version 1.0
 * @author Bappi Mazumder
 * @since 7/11/2023
 * Project Name : java-design-pattern
 */

package com.bappi.designPattern.structural.proxy;

public class ProxyImage implements Image{

    private String fileName;
    private RealImage realImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
