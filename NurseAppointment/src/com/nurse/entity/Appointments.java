package com.nurse.entity;

public class Appointments {
    private int appointmentId;
    private int customerId;
    private int serviceId;
    private String appointmentDate;
    private boolean appointmentStatus;
    
    
    public Appointments(int appointmentId, int customerId, int serviceId, String appointmentDate, boolean appointmentStatus) {
        this.appointmentId = appointmentId;
        this.customerId = customerId;
        this.serviceId = serviceId;
        this.appointmentDate = appointmentDate;
        this.appointmentStatus = appointmentStatus;
    }
    
    public int getAppointmentId() {
        return appointmentId;
    }
    
    public int getCustomerId() {
        return customerId;
    }
    
    public int getServiceId() {
        return serviceId;
    }
    
    public void setAppointmentDate(String date) {
        this.appointmentDate = date;
    }
    
    public String getAppointmentDate() {
        return appointmentDate;
    }
    
    public void setAppointmentStatus(boolean status) {
        this.appointmentStatus = status;
    }
    
    public boolean getAppointmentStatus() {
        return appointmentStatus;
    }
    
    @Override
    public String toString() {
        return "Appointment Id: " + appointmentId + " Appointment Date: " + appointmentDate;
    }
}