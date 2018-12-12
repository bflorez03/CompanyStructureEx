package com.company;

public class TechnicalEmployee extends Employee {

    private int successfulCheck=0;

    public TechnicalEmployee(String name) {
        super(name, 75000);
    }

    public void setSuccessfulCheck(int successfulCheck) {
        this.successfulCheck = successfulCheck;
    }

    public int getSuccessfulCheck() {
        return successfulCheck;
    }

    public String employeeStatus(){
        return super.toString() + "has " + String.valueOf(this.successfulCheck) + "successful checks in.\n";
    }
}
