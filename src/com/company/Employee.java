package com.company;

public class Employee {

    private String name;
    private double baseSalaty;
    private int employeeID=0;
    private String  status;

    public Employee(String name, double baseSalaty) {
        this.name = name;
        this.baseSalaty = baseSalaty;
        this.employeeID++;
    }

    Employee(String name, int employeeID) {
        this.name = name;
        this.employeeID = employeeID;
    }

    public double getBaseSalaty() {
        return baseSalaty;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Employee getManager(){
        return new Employee(this.name, this.employeeID);
    }

    public boolean equals(Employee other){
        return this.employeeID == other.employeeID;
    }

    public String toString(){
        return String.valueOf(this.employeeID) + " " + this.name;
    }

    public String employeeStatus(){
        return status;
    }
}
