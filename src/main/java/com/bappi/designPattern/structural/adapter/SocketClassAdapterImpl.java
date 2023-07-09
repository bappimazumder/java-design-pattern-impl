/**
 * @version 1.0
 * @author Bappi Mazumder
 * @since 7/9/2023
 * Project Name : java-design-pattern
 */

package com.bappi.designPattern.structural.adapter;
/*
* While implementing Adapter pattern, there are two approaches - class adapter and object adapter -
* however both these approaches produce same result.
*
* Here is the class adapter approach implementation of our adapter.
* */
public class SocketClassAdapterImpl extends Socket implements SocketAdapter{
    @Override
    public Volt get120Volt() {
        return getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt v = getVolt();
        return convertVolt(v,10);
    }

    @Override
    public Volt get3Volt() {
        Volt v = getVolt();
        return convertVolt(v,40);
    }

    public Volt convertVolt(Volt v, int i){
        return  new Volt(v.getVolts()/i);
    }
}
