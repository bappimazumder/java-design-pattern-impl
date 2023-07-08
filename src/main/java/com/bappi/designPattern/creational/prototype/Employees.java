/**
 * @version 1.0
 * @author Bappi Mazumder
 * @since 7/8/2023
 * Project Name : java-design-pattern
 */

package com.bappi.designPattern.creational.prototype;

import java.util.ArrayList;
import java.util.List;
/*
* Prototype design pattern is used when the Object creation is a costly affair and requires a lot of time and
* resources and you have a similar object already existing. Prototype pattern provides a mechanism to copy the
* original object to a new object and then modify it according to our needs. Prototype design pattern uses java
* cloning to copy the object.
*
* */
public class Employees implements Cloneable{
    private List<String> empList;

    public Employees() {
        empList = new ArrayList<>();
    }

    public Employees(List<String> empList) {
        this.empList = empList;
    }
    public List<String> getEmpList() {
        return empList;
    }

    public void loadData(){
        empList.add("Bappi");
        empList.add("John");
        empList.add("David");
        empList.add("Julien");
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        List<String> copyList = new ArrayList<>();
        for(String e : this.empList){
            copyList.add(e);
        }
        return new Employees(copyList);
    }

    @Override
    public String toString() {
        return "Employees{" +
                "empList=" + empList +
                '}';
    }
}
