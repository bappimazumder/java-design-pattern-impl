/**
 * @version 1.0
 * @author Bappi Mazumder
 * @since 7/9/2023
 * Project Name : java-design-pattern
 */

package com.bappi.designPattern.structural.adapter;

public class Volt {
    private int volts;

    public Volt(int volts) {
        this.volts = volts;
    }
    public int getVolts() {
        return volts;
    }

    public void setVolts(int volts) {
        this.volts = volts;
    }
}
