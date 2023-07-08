/**
 * @version 1.0
 * @author Bappi Mazumder
 * @since 7/8/2023
 * Project Name : java-design-pattern
 */

package com.bappi.designPattern.creational.prototype;

import java.util.List;

public class PrototypePatternTest {
    public static void main(String args[]) throws CloneNotSupportedException{
        Employees employees = new Employees();
        employees.loadData();
        // clone and modify 1
        Employees newEmployees1 = (Employees) employees.clone();
        List<String> list1 = newEmployees1.getEmpList();
        list1.add("Robert");
        list1.add("William");

        // clone and modify 2
        Employees newEmployees2 = (Employees) employees.clone();
        List<String> list2 = newEmployees2.getEmpList();
        list2.remove("Bappi");

        System.out.println("old employee list " + employees);
        System.out.println("new employee list " + newEmployees1);
        System.out.println("new  employee list 2 " + newEmployees2);

    }
}
