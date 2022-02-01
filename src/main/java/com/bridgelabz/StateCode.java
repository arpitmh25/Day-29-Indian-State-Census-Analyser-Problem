package com.bridgelabz;

public class StateCode {
    private String srNo;
    private String stateName;
    private String TIN;
    private String stateCode;

    public StateCode() {
        super();
    }

    public String getSrNo() {
        return srNo;
    }

    public void setSrNo(String srNo) {
        this.srNo = srNo;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getTIN() {
        return TIN;
    }

    public void setTIN(String tIN) {
        TIN = tIN;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    @Override
    public String toString() {
        return "StateCode [srNo=" + srNo + ", stateName=" + stateName + ", TIN=" + TIN + ", stateCode=" + stateCode
                + "]";
    }

}
