package com.nurse.entity;

public class Service{
    private int serviceId;
    private String serviceName;
    private String serviceDescription;
    private float serviceCharges;
    
    public Service(int serviceId, String serviceName, String serviceDescription, float serviceCharges){
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.serviceDescription = serviceDescription;
        this.serviceCharges = serviceCharges;
    }
    
    public void setServiceName(String serviceName){
        this.serviceName = serviceName;
    }
    
    public String getServiceName(){
        return serviceName;
    } 
    
    public void setService(int serviceId){
        this.serviceId = serviceId;
    }
    
    public int getServiceId(){
        return serviceId;
    }
    
    public void setServiceDescription(String serviceDescription){
        this.serviceDescription = serviceDescription;
    }
    
    
    public String getServiceDescription(){
        return serviceDescription;
    } 
    
    public void serviceCharges(float serviceCharges){
        this.serviceCharges = serviceCharges;
    }
    
    public float getserviceCharges(){
        return serviceCharges;
    } 
    
    @Override
    public String toString() {
        return "Service Id: " + serviceId + " serviceName: " + serviceName;
    }
}