/**
 * @version 1.0
 * @author Bappi Mazumder
 * @since 7/4/2023
 * Project Name : java-design-pattern
 */

package com.bappi.designPattern.creational.abstractFactory;

public class Blue implements Color{
    @Override
    public void fill() {
        System.out.println("Inside Blue method Fill is calling");
    }
}
