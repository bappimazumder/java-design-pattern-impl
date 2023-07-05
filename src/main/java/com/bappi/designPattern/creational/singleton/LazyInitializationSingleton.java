/**
 * @version 1.0
 * @author Bappi Mazumder
 * @since 7/5/2023
 * Project Name : java-design-pattern
 */

package com.bappi.designPattern.creational.singleton;

public class LazyInitializationSingleton {

    /*static instance declared, but not created*/
    private static LazyInitializationSingleton instance;

    /* private constructor create, to avoid other classes can't create object */
    private LazyInitializationSingleton(){}

    /* This method create the new instance if its null in first time and returns the instance*/
    public static LazyInitializationSingleton getInstance(){
        if(instance == null){
            instance = new LazyInitializationSingleton();
        }
        return instance;
    }


}
