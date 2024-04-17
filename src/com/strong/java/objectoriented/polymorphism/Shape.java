package com.strong.java.objectoriented.polymorphism;

/**
 * @author: strong
 * @since: 2024/3/22 10:00
 * @description:
 */
class Shape {
    void draw() {
    }

    public static void main(String[] args) {
        Shape[] s = {new Circle(), new Square(), new Triangle()};
        for (Shape sh : s) {
            sh.draw();
        }
    }
}


class Circle extends Shape {
    void draw() {
        System.out.println("Circle.draw()");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Square.draw()");
    }
}

class Triangle extends Shape {
    void draw() {
        System.out.println("Triangle.draw()");
    }
}
