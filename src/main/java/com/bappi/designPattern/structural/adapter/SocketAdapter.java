/**
 * @version 1.0
 * @author Bappi Mazumder
 * @since 7/9/2023
 * Project Name : java-design-pattern
 */

package com.bappi.designPattern.structural.adapter;
/*
* we want to build an adapter that can produce 3 volts, 12 volts and default 120 volts.
* So first of all we will create an adapter interface with these methods.
* */
public interface SocketAdapter {
    public Volt get120Volt();
    public Volt get12Volt();
    public Volt get3Volt();

}
