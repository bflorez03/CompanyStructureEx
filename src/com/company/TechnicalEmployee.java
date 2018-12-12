package com.company;

public class TechnicalEmployee extends Employee {

    private int successfulCheck;

    public TechnicalEmployee(String name) {
        super(name, 75000);
    }

    public void setSuccessfulCheck(int successfulCheck) {
        this.successfulCheck = successfulCheck;
    }

    public String employeeStatus(){
        return this.toString() + "has " + String.valueOf(this.successfulCheck) + "successful checks in.\n";
    }
}
