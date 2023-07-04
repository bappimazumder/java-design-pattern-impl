/**
 * @version 1.0
 * @author Bappi Mazumder
 * @since 7/4/2023
 * Project Name : java-design-pattern
 */

package com.bappi.designPattern.creational.factory;

// This is our factory class, Here is the basic implementation
public class ComputerFactory {
    public static Computer getComputer(String type,String cpu,String ram,String hdd){
        if(type.equalsIgnoreCase("PC")){
            return new PC(cpu,ram,hdd);
        }else if(type.equalsIgnoreCase("Server")){
            return new Server(cpu,ram,hdd);
        }
        return null;
    }
}
