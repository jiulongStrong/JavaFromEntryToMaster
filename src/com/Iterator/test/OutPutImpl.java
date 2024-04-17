package com.Iterator.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OutPutImpl {
    //学院集合
    private List<College> collegeList;

    public OutPutImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    //遍历所有学院，然后调用printDepartment 输出各个学院的系
    public void printCollege() {
        Iterator<College> iterator = collegeList.iterator();
        while (iterator.hasNext()) {
            College college = iterator.next();
            System.out.println("=====" + college.getName() + "=======");
            printDepartment(college.createIterator());
        }

    }

    //输出系
    public void printDepartment(Iterator iterator) {
        while (iterator.hasNext()) {
            Department next = (Department) iterator.next();
            System.out.println(next.getName());
        }
    }
}