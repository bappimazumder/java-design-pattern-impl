/**
 * @version 1.0
 * @author Bappi Mazumder
 * @since 7/15/2023
 * Project Name : java-design-pattern
 */

package com.bappi.designPattern.behavioral.observer;

public class Subscriber {
    private String name;
    private Chanel Chanel;

    public Subscriber(String name) {
        this.name = name;
    }

    public void update(){
        System.out.println("Hi "+name+" Video Uploaded");
    }

    public void setSubscriberChannel(Chanel channel){
        this.Chanel= channel;
    }
}
