/**
 * @version 1.0
 * @author Bappi Mazumder
 * @since 7/5/2023
 * Project Name : java-design-pattern
 */

package com.bappi.designPattern.creational.singleton;
/*
* A simple way to create a thread-safe singleton class is to make the global access method
*  synchronized so that only one thread can execute this method at a time.It will remove the
*  multithreaded problem
* */
public class ThreadSafeSingleton {
    /*static instance declared, but not created*/
    private static ThreadSafeSingleton instance;

    /* private constructor create, to avoid other classes can't create object */
    private ThreadSafeSingleton(){}

    /* This method create the new instance if its null in first time and returns the instance*/
    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance == null){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}
