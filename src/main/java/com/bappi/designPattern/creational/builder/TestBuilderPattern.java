/**
 * @version 1.0
 * @author Bappi Mazumder
 * @since 7/7/2023
 * Project Name : java-design-pattern
 */

package com.bappi.designPattern.creational.builder;

public class TestBuilderPattern {
    public static void main(String args[]){
            Computer computer = new Computer.ComputerBuilder("2 GB","500 GB"," Core i3")
                    .setBluetoothEnabled(true).setGraphicsCardEnabled(true).build();
            System.out.println(computer);
    }
}
