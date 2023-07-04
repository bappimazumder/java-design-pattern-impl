/**
 * @version 1.0
 * @author Bappi Mazumder
 * @since 7/4/2023
 * Project Name : java-design-pattern
 */

package com.bappi.designPattern.creational.factory;

// This is the Abstract class(Super class)for factory pattern
public abstract class Computer {
    public abstract String getCPU();
    public abstract String getRAM();
    public abstract String getHDD();

    @Override
    public String toString() {
        return "CPU = "+this.getCPU()+", RAM = "+ this.getRAM() + ", HDD " + this.getHDD();
    }
}
