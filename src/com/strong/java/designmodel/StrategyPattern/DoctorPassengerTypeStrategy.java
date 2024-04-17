package com.strong.java.designmodel.StrategyPattern;

/**
 * @author: strong
 * @since: 2024/3/16 23:11
 * @description:
 */
public class DoctorPassengerTypeStrategy implements IPassengerTypeStrategy{
    @Override
    public void ImplementCase() {
       System.out.println("i am a doctor");
    }
}
