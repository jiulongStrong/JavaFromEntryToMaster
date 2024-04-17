package com.strong.java.flowcontrol;

/**
 * @author: strong
 * @since: 2024/3/16 21:04
 * @description:
 */
public class fortest {
    public static void main(String[] args) {
        System.out.println("普通for循环");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("增强for循环");
        int[] arr = {1, 2, 3, 4, 5};
        for (int i : arr) {
                     System.out.println(i);
                 }

        //计算100以内，所有的能被3整除的数字之和
        System.out.println("计算100以内，所有的能被3整除的数字之和");
        int sum = 0;
        for (int i = 0; i < 100; i++) {
           if (i % 3 == 0) {
           sum += i;
            }
        }
        System.out.println(sum);

        //今有鸡兔同笼，上有35个头，下有94足，问鸡兔各几只
        System.out.println("今有鸡兔同笼，上有35个头，下有94足，问鸡兔各几只");
        int headers = 35;
        int legs = 94;

        int chicken = 0;
        int rabbit = 0;

        for (int i = 0; i <= headers; i++){
            int possiblechicken = i;
            int possiblerabbit = headers - i;
            if (possiblechicken * 2 + possiblerabbit * 4 == legs){
                chicken = possiblechicken;
                rabbit = possiblerabbit;
                break;
            }
        }

        System.out.println("鸡的数量为：" + chicken);
        System.out.println("兔的数量为：" + rabbit);

        //
    }
}
