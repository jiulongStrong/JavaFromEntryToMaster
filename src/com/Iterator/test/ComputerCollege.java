package com.Iterator.test;

import java.util.Iterator;

public class ComputerCollege implements College {
    Department[] departments;
    int count = 0;//保存当前数组元素个数

    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("JAVA", "JAVA");
        addDepartment("C++", "C++");
        addDepartment("Python", "Python");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[count] = department;
        count++;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}