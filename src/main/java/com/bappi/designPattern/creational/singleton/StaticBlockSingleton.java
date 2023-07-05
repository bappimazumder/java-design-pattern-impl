/**
 * @version 1.0
 * @author Bappi Mazumder
 * @since 7/5/2023
 * Project Name : java-design-pattern
 */

package com.bappi.designPattern.creational.singleton;

/* Static block initialization implementation is similar to eager initialization,
     except that instance of the class is created in the static block that provides the
     option for exception handling.*/
public class StaticBlockSingleton {

    /*static instance declared, but not created*/
    private static StaticBlockSingleton instance;

    /* private constructor create, to avoid other classes can't create object */
    private StaticBlockSingleton(){}

    /*static block initialization and for exception handling */
    static {
        try {
            instance = new StaticBlockSingleton();
        }catch (Exception ex){
            throw new RuntimeException("Exception throw from the instance creation");
        }
    }

    /*This static method returns the instance*/
    public static StaticBlockSingleton getInstance(){
        return instance;
    }

}
