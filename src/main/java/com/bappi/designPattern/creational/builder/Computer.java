/**
 * @version 1.0
 * @author Bappi Mazumder
 * @since 7/7/2023
 * Project Name : java-design-pattern
 */

package com.bappi.designPattern.creational.builder;

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
