/**
 * @version 1.0
 * @author Bappi Mazumder
 * @since 7/11/2023
 * Project Name : java-design-pattern
 */

package com.bappi.designPattern.structural.proxy;
/*
* The proxy pattern provides a placeholder for another Object to control access to it.
* This pattern is used when we want to provide controlled access to functionality.
*
* */
public class ProxyPatternTest {
    public static void main(String[] args) {
        Image image = new ProxyImage("image_name.jpg");
        // First time image will be loaded from the disk
        image.display();

        // Here image will show from cache
        image.display();
    }
}
