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

    /*
    * The preceding implementation works fine and provides thread-safety,
    * but it reduces the performance because of the cost associated with the synchronized method,
    * although we need it only for the first few threads that might create separate instances.
    * To avoid this extra overhead every time, double-checked locking principle is used.
    * In this approach, the synchronized block is used inside the if condition with an additional
    * check to ensure that only one instance of a singleton class is created.
    * */
    public static ThreadSafeSingleton getInstanceUsingDoubleLocking(){
        if(instance == null){
            synchronized (ThreadSafeSingleton.class){
                if (instance == null){
                    instance = new ThreadSafeSingleton();
                }
            }

        }
        return instance;
    }

}
