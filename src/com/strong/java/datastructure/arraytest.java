package com.strong.java.datastructure;

import java.util.ArrayList;

/**
 * @author: strong
 * @since: 2024/3/17 10:23
 * @description:
 */

//特点： 固定大小，存储相同类型的元素。
//        优点： 随机访问元素效率高。
//        缺点： 大小固定，插入和删除元素相对较慢。

public class arraytest {

    public static void main(String[] args) {
        //固定长度数组，需要事先声明长度
        int[] arr = {1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //动态数组，可以动态添加元素
        int[] arr2 = new int[5];
        arr2[0] = 1;
        arr2[1] = 2;
        arr2[2] = 3;
        arr2[3] = 4;
        arr2[4] = 5;
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        //可变长数组，ArrayLists实现
        ArrayList arr3 = new ArrayList();
        arr3.add(1);
        arr3.add(2);
        arr3.add(3);
        arr3.add(4);
        System.out.println(arr3);
        System.out.println(arr3.get(0));
        System.out.println(arr3.size());
        arr3.set(1,5);
        arr3.remove(0);
        System.out.println(arr3);

        //二维数组，可变长度可用ArrayList的ArrayList实现
        ArrayList<ArrayList<Integer>> arr4 = new ArrayList<ArrayList<Integer>>();
//        int[][] arr4 = new int[3][4];
}
}
