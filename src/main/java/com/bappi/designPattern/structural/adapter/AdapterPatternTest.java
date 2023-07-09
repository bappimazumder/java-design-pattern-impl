/**
 * @version 1.0
 * @author Bappi Mazumder
 * @since 7/9/2023
 * Project Name : java-design-pattern
 */

package com.bappi.designPattern.structural.adapter;

/*
* One of the great real life example of Adapter design pattern is mobile charger.
* Mobile battery needs 3 volts to charge but the normal socket produces either 120V (US) or 240V (India).
*  So the mobile charger works as an adapter between mobile charging socket and the wall socket.
* We will try to implement multi-adapter using adapter design pattern in this tutorial.
* So first of all we will have two classes - Volt (to measure volts) and Socket (producing constant volts
* of 120V).
*
* */
public class AdapterPatternTest {

    public static void main(String args[]){
        objectAdapter();
    }

    private static void objectAdapter(){
        SocketAdapter socketAdapter = new SocketClassAdapterImpl();
        Volt volt3 = getVolt(socketAdapter,3);
        Volt volt12 = getVolt(socketAdapter,12);
        Volt volt120 = getVolt(socketAdapter,120);

        System.out.println("volt3 volts using Object Adapter="+volt3.getVolts());
        System.out.println("volt12 volts using Object Adapter="+volt12.getVolts());
        System.out.println("volt120 volts using Object Adapter="+volt120.getVolts());
    }

    private static Volt getVolt(SocketAdapter socketAdapter, int i){
        switch (i){
            case 3: return socketAdapter.get3Volt();
            case 12: return socketAdapter.get12Volt();
            case 120: return socketAdapter.get120Volt();
            default: return socketAdapter.get120Volt();
        }
    }
}
