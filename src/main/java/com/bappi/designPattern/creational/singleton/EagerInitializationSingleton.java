/**
 * @version 1.0
 * @author Bappi Mazumder
 * @since 7/5/2023
 * Project Name : java-design-pattern
 */

package com.bappi.designPattern.creational.singleton;

/* In eager initialization, the instance of the singleton class is created at the
 time of class loading. The drawback to eager initialization is that the method is created
 even though the client application might not be using it.
 */
public class EagerInitializationSingleton {

    // static final instance created, that is created at the time of class loading.
    private static final EagerInitializationSingleton instance = new EagerInitializationSingleton();

    // private constructor create, to avoid other classes can't create object
    private EagerInitializationSingleton(){ }

    // This static method returns the instance
    public static EagerInitializationSingleton getInstance(){
        return instance;
    }


}
