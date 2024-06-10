/*
 * Click nbfs://nbhost/FileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.motorph.cp2motorph;

/**
 *
 * @author kjalcala
 */
public class Employee {
    private int employeeNumber;
    private String lastName;
    private final String firstName;
    private String birthday;
    private String address;
    private String phoneNumber;
    private String sssNumber;
    private String philhealthNumber;
    private String tinNumber;
    private String pagibigNumber;
    private String status;
    private String position;
    private String immediateSupervisor;
    private double basicSalary;
    private double riceSubsidy;
    private double phoneAllowance;
    private double clothingAllowance;
    private double grossSemiMonthlyRate;
    private double hourlyRate;


    public Employee(int employeeNumber, String lastName, String firstName, String birthday, String address, String phoneNumber, String sssNumber, String philhealthNumber, String tinNumber, String pagibigNumber, String status, String position, String immediateSupervisor, String jane_Smith, double basicSalary, double riceSubsidy, double phoneAllowance, double clothingAllowance, double grossSemiMonthlyRate, double hourlyRate) {
        this.employeeNumber = employeeNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthday = birthday;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.sssNumber = sssNumber;
        this.philhealthNumber = philhealthNumber;
        this.tinNumber = tinNumber;
        this.pagibigNumber = pagibigNumber;
        this.status = status;
        this.position = position;
        this.immediateSupervisor = immediateSupervisor;
        this.basicSalary = basicSalary;
        this.riceSubsidy = riceSubsidy;
        this.phoneAllowance = phoneAllowance;
        this.clothingAllowance = clothingAllowance;
        this.grossSemiMonthlyRate = grossSemiMonthlyRate;
        this.hourlyRate = hourlyRate;
    }
    
    
    public String getLastName(){ 
        return lastName;
    }
    
    public String getFirstName() {
        return firstName;
    }
    public void setLastName() {
        lastName = getLastName();
    }
    
    public String getBirthday() {
        return birthday;
    }
    public int getEmployeeNumber() {
        return employeeNumber;
    }
    public String getAddress() {
        return address;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getSssNumber() {
        return sssNumber;
    }
    public String getPhilhealthNumber() {
        return philhealthNumber;
    }
    public String getTinNumber() {
        return tinNumber;
    }
    public String getPagibigNumber() {
        return pagibigNumber;
    }
    public String getStatus() {
        return status;
    }
    public String getPosition() {
        return position;
    }
    public String getImmediateSupervisor() {
        return immediateSupervisor;
    }
    public Double getBasicSalary() {
        return basicSalary;
    }
    public Double getRiceSubsidy() {
        return riceSubsidy;
    }
    public Double getPhoneAllowance() {
        return phoneAllowance;
    }
    public Double getClothingAllowance() {
        return clothingAllowance;
    }
    public Double getGrossSemiMonthlyRate() {
        return grossSemiMonthlyRate;
    }
    public Double getHourlyRate() {
        return hourlyRate;
    }
}
