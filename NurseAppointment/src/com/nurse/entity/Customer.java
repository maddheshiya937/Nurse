package com.nurse.entity;



public class Customer {
    private int customerId;
    private String customerName;
    private String customerEmail;
    private String password;
    private String mobileNumber;
    private String address;
    private String gender;
    
    public Customer(int customerId, String customerName, String customerEmail, String password, String mobileNumber, String address, String gender) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.password = password;
        this.mobileNumber = mobileNumber;
        this.address = address;
        this.gender = gender;
    }
    
    public int getCustomerId() {
        return customerId;
    }
    
    public String getCustomerName() {
        return customerName;
    }
    
    public void setCustomerName(String name) {
        customerName = name;
    }
    
    public String getCustomerEmail() {
        return customerEmail;
    }
    
    public void setCustomerEmail(String email) {
        customerEmail = email;
    }
    
    public String getCustomerPassword() {
        return password;
    }
    
    public String getCustomerMobileNumber() {
        return mobileNumber;
    }
    
    public void setCustomerMobileNumber(String number) {
        mobileNumber = number;
    }
    
    public String getCustomerAddress() {
        return address;
    }
    
    public void setCustomerAddress(String addrs) {
        address = addrs;
    }
    public String getCustomerGender() {
        return gender;
    }
    
    public void setCustomerGender(String gndr) {
        gender = gndr;
    }
    
    @Override
    public String toString() {
        return "Customer Id: " + customerId + " Customer Name: " + customerName;
    }
}