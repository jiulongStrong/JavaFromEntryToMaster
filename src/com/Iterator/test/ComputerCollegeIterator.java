package com.Iterator.test;

import java.util.Iterator;

public class ComputerCollegeIterator implements Iterator {
    //需要知道Department是以怎样的方式存放,此处为数组
    Department[] departments;
    int position = 0;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (position >= departments.length || departments[position] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position++;
        return department;
    }

    //默认空实现
    @Override
    public void remove() {
    }
}
