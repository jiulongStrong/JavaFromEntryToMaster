package com.strong.java.datastructure;

/**
 * @author: strong
 * @since: 2024/3/22 16:57
 * @description:
 * 泛型提供了编译时类型安全检测机制，该机制允许程序员在编译时检测到非法的类型。
 *
 * 泛型的本质是参数化类型，也就是说所操作的数据类型被指定为一个参数
 * 定义泛型方法的规则：
 *
 * 所有泛型方法声明都有一个类型参数声明部分（由尖括号分隔），该类型参数声明部分在方法返回类型之前（在下面例子中的 <E>）。
 * 每一个类型参数声明部分包含一个或多个类型参数，参数间用逗号隔开。一个泛型参数，也被称为一个类型变量，是用于指定一个泛型类型名称的标识符。
 * 类型参数能被用来声明返回值类型，并且能作为泛型方法得到的实际参数类型的占位符。
 * 泛型方法体的声明和其他方法一样。注意类型参数只能代表引用型类型，不能是原始类型（像 int、double、char 等）。
 * java 中泛型标记符：
 *
 * E - Element (在集合中使用，因为集合中存放的是元素)
 * T - Type（Java 类）
 * K - Key（键）
 * V - Value（值）
 * N - Number（数值类型）
 * ？ - 表示不确定的 java 类型
 */
public class genericsDemo {

    public static < E > void printArray( E[] inputArray ) {
        //输出数组元素
        for ( E element : inputArray ) {
            System.out.printf( "%s ", element );
        }
        System.out.println();
    }

    //有界的类型参数
    public static <T extends Comparable<T>> T maximum(T x, T y, T z){
        T max = x;
        if ( y.compareTo( max ) > 0 ){
            max = y;
        }
        if ( z.compareTo( max ) > 0 ){
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {

        // 创建不同类型数组
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        String[] stringArray = { "Hello", "World" };

        printArray( intArray  );
        printArray( stringArray  );

        System.out.printf( "%d, %d 和 %d 中最大的数为 %d\n\n",
                3, 4, 5, maximum( 3, 4, 5 ) );

        System.out.printf( "%.1f, %.1f 和 %.1f 中最大的数为 %.1f\n\n",
                6.6, 8.8, 7.7, maximum( 6.6, 8.8, 7.7 ) );

        System.out.printf( "%s, %s 和 %s 中最大的数为 %s\n","pear",
                "apple", "orange", maximum( "pear", "apple", "orange" ) );
    }
}
