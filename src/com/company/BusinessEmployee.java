package com.company;

public class BusinessEmployee extends Employee {

    private double bonusBudget;

    public BusinessEmployee(String name) {
        super(name, 50000);
    }

    public double getBonusBudget(){
        return bonusBudget;
    }

    public String employeeStatus(){
        return this.employeeStatus() + "with a budget of " + String.valueOf(bonusBudget) + "\n";
    }
}
