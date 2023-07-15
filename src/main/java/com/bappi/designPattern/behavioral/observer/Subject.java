/**
 * @version 1.0
 * @author Bappi Mazumder
 * @since 7/15/2023
 * Project Name : java-design-pattern
 */

package com.bappi.designPattern.behavioral.observer;

import java.util.Objects;
import java.util.Observer;

public interface Subject {
    public void register(Observer observer);
    public void unRegister(Observer observer);

    public void notifyObserver();

    public Object getUpdate();
}
