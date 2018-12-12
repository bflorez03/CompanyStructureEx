package com.company;

public class TechnicalLead extends TechnicalEmployee{

    private double baseSalary;
    private int headCount;
    private int numberOfReport;


    public TechnicalLead(String name) {
        super(name);
        this.baseSalary = getBaseSalaty()*1.3;
        this.headCount = 4;
    }

    public boolean hasHeadCount(){
        return numberOfReport < headCount;
    }

    public boolean addReport(SoftwareEngineer e){

    }

    public boolean requestBonus(Employee e, double bonus){

    }

    public String getTeamStatus(){

    }

}
