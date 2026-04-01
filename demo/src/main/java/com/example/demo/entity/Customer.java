package com.example.demo.entity;


import com.example.demo.enums.CustomerStatus;
import jakarta.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerId;

    @Column(nullable = false,length = 100)
    private String customerName;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private CustomerStatus customerStatus;

    @Column(nullable = false)
    private Integer totalCustomerMileage;

    public Customer() {
    }

    public Customer(String customerName, CustomerStatus customerStatus, int totalCustomerMileage) {
        this.customerName = customerName;
        this.customerStatus = customerStatus;
        this.totalCustomerMileage = totalCustomerMileage;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public CustomerStatus getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(CustomerStatus customerStatus) {
        this.customerStatus = customerStatus;
    }

    public int getTotalCustomerMileage() {
        return totalCustomerMileage;
    }

    public void setTotalCustomerMileage(int totalCustomerMileage) {
        this.totalCustomerMileage = totalCustomerMileage;
    }
}