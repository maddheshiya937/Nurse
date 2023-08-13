package com.nurse.client;


import java.util.*;

import com.nurse.entity.Appointments;
import com.nurse.entity.Customer;
import com.nurse.entity.Nurse;
import com.nurse.entity.Service;

public class Admin {
    public static void main (String[] args) {
        Customer c = new Customer(101, "Mayank", "kmayank298@gmail.com", "mayank", "7829779309", "Pune", "Male");
        Nurse n = new Nurse(2033, "Nurse1", "7898989712", "Pune");
        Appointments a = new Appointments(1223, 101, 9022, "12/08/2023", true);
        Service s = new Service(9022, "Psycologist", "Psycologist", 12000);
        System.out.println(c);
        System.out.println(n);
        System.out.println(a);
        System.out.println(s);
    }
}