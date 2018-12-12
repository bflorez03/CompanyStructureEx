package com.company;

public class SoftwareEngineer extends TechnicalEmployee {

    private boolean codeAccess;
    private boolean checkInCode;


    public SoftwareEngineer(String name) {
        super(name);
    }

    public boolean getCodeAccess() {
        return codeAccess;
    }

    public void setCodeAccess(boolean codeAccess) {
        this.codeAccess = codeAccess;
    }

    public void setCheckInCode(boolean checkInCode) {
        this.checkInCode = checkInCode;
    }

    public void setSuccessfulCheckIns(int successfulCheckIns) {
        super.setSuccessfulCheck(successfulCheckIns);
    }

    public int getSuccessfulCheckIns(){
        return super.getSuccessfulCheck();
    }

    public boolean checkInCode(){
        if(checkInCode){setSuccessfulCheckIns(super.getSuccessfulCheck()+1);}
        return checkInCode;
    }
}
