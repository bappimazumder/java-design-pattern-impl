/**
 * @version 1.0
 * @author Bappi Mazumder
 * @since 7/7/2023
 * Project Name : java-design-pattern
 */

package com.bappi.designPattern.creational.builder;
/*
* Builder pattern was introduced to solve some of the problems with Factory and Abstract Factory
* design patterns when the Object contains a lot of attributes. There are three major issues with
* Factory and Abstract Factory design patterns when the Object contains a lot of attributes.
*
* Too Many arguments to pass from client program to the Factory class that can be error prone because most of
* the time, the type of arguments are same and from client side its hard to maintain the order of the argument.
* Some of the parameters might be optional but in Factory pattern, we are forced to send all the parameters
* and optional parameters need to send as NULL.
* If the object is heavy and its creation is complex, then all that complexity will be part of Factory classes
* that is confusing.
*
* */
public class Computer {

    // Required property
    private String RAM;
    private String HDD;
    private String CPU;

    // Optional Property
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    public String getRAM() {
        return RAM;
    }

    public String getHDD() {
        return HDD;
    }

    public String getCPU() {
        return CPU;
    }

    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    public Computer(ComputerBuilder builder) {
        this.RAM = builder.RAM;
        this.HDD = builder.HDD;
        this.CPU = builder.CPU;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    // Static Builder Class
    public static class ComputerBuilder{

        // required parameter
        private String RAM;
        private String HDD;
        private String CPU;

        // optional parameter
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        public ComputerBuilder(String RAM, String HDD, String CPU) {
            this.RAM = RAM;
            this.HDD = HDD;
            this.CPU = CPU;
        }

        public ComputerBuilder  setGraphicsCardEnabled(boolean graphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public ComputerBuilder  setBluetoothEnabled(boolean bluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }
       public Computer build(){
            return new Computer(this);
       }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "RAM='" + RAM + '\'' +
                ", HDD='" + HDD + '\'' +
                ", CPU='" + CPU + '\'' +
                ", isGraphicsCardEnabled=" + isGraphicsCardEnabled +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                '}';
    }
}
