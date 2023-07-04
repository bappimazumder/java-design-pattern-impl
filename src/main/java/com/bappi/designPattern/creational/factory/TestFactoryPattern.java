/**
 * @version 1.0
 * @author Bappi Mazumder
 * @since 7/4/2023
 * Project Name : java-design-pattern
 */

package com.bappi.designPattern.creational.factory;

// Here is the simple test program that uses factory design pattern
public class TestFactoryPattern {
    public static void main(String args[]) {
        Computer pc = ComputerFactory.getComputer("PC", "2.6 GHz", "4 GB", "500 GB");
        Computer server = ComputerFactory.getComputer("Server", "2.14 GHz", "100 GB", "500 TB");
        System.out.println("This is PC get from factory pattern :" + pc);
        System.out.println("This is Server get from factory pattern :" + server);
    }
}
