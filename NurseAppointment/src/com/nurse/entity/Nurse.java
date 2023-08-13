package com.nurse.entity;



public class Nurse {
    private int nurseId;
    private String nurseName;
    private String nurseMobileNumber;
    private String nurseAddress;
    
    public Nurse(int nurseId, String nurseName, String nurseMobileNumber, String nurseAddress) {
        this.nurseId = nurseId;
        this.nurseName = nurseName;
        this.nurseMobileNumber = nurseMobileNumber;
        this.nurseAddress = nurseAddress;
    }
    
    public int getNurseId() {
        return nurseId;
    }
    
    public String getNurseName() {
        return nurseName;
    }
    
    public void setNurseName(String name) {
        nurseName = name;
    }
    
    public String getNurseMobileNumber() {
        return nurseMobileNumber;
    }
    
    public void setNurseMobileNumber(String number) {
        nurseMobileNumber = number;
    }
    
    public String getNurseAddress() {
        return nurseAddress;
    }
    
    public void setNurseAddress(String address) {
        nurseAddress = address;
    }
    
    @Override
    public String toString() {
        return "Nurse Id: " + nurseId + " Nurse Name: " + nurseName;
    }
}