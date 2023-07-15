/**
 * @version 1.0
 * @author Bappi Mazumder
 * @since 7/15/2023
 * Project Name : java-design-pattern
 */

package com.bappi.designPattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Chanel {
    private List<Subscriber> subscribers = new ArrayList<>();
    private String title;

    public void subscribe(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber){
        subscribers.remove(subscriber);
    }
    public void notifySubscribers(){
        for(Subscriber subscriber : subscribers){
            subscriber.update();
        }
    }

    public void uploadVideo(String videoTitle){
        this.title = videoTitle;
        notifySubscribers();
    }

}
