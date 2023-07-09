/**
 * @version 1.0
 * @author Bappi Mazumder
 * @since 7/9/2023
 * Project Name : java-design-pattern
 */

package com.bappi.designPattern.structural.adapter;

public class Socket {
    Volt getVolt(){
        return new Volt(120);
    }
}
