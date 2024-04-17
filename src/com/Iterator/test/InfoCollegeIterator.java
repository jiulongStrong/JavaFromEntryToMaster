package com.Iterator.test;

import java.util.Iterator;
import java.util.List;

public class InfoCollegeIterator implements Iterator {
    List<Department> departments;
    int position = -1;

    public InfoCollegeIterator(List<Department> departments) {
        this.departments = departments;
    }


    @Override
    public boolean hasNext() {
        if (position >= departments.size()-1){
            return false;
        }else {
            position++;
            return true;
        }
    }

    @Override
    public Object next() {
      Department department = departments.get(position);
      return department;
    }

    @Override
    public void remove() {

    }
}
