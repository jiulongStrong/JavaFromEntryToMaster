package com.strong.java.objectoriented.abstractclassdemo;

/**
 * @author: strong
 * @since: 2024/3/22 11:44
 * @description:
 */
public class Salary extends Employee{
    private double salary;
    public Salary(String name, String address, int number, double salary) {
        super(name, address, number);
        this.salary = salary;
        System.out.println("调用Salary的构造函数");
    }

    public Salary(String name, String address, int number) {
        super(name, address, number);
    }

    @Override
    public void mailCheck() {
        System.out.println("Within mailCheck of Salary class ");
        System.out.println("Mailing check to " + getName()
                + " with salary " + salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {

        if(newSalary >= 0.0) {
            salary = newSalary;
        }
    }

    public double computePay() {

        System.out.println("Computing salary pay for " + getName());
        return salary/5;
    }
}
