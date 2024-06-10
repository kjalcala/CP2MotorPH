/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.motorph.cp2motorph;

import com.opencsv.CSVReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Set;

/**
 *
 * @author kjalcala
 */
public class LoggedOnUser {
    
    private int employeeNumber;
    private String lastName;
    private String firstName;
    private String birthday;
    private String address;
    private String phoneNumber;
    private String sssNumber;
    private String philhealthNumber;
    private String tinNumber;
    private String pagibigNumber;
    private String status;
    private static String position;
    private String immediateSupervisor;
    private double basicSalary;
    private double riceSubsidy;
    private double phoneAllowance;
    private double clothingAllowance;
    private double grossSemiMonthlyRate;
    private double hourlyRate;
    
    public String getLastName(){ 
        return lastName;
    }
    
    public String getFirstName() {
        return firstName;
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
    public static String getPosition() {
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
    
    public void setPosition(String position) {
        this.position = position;
    }
    
    public void setUserInfo(int employeeNumber) {
        String file = "src\\employee_data.csv";
        BufferedReader reader = null;
        String line = "";
        try (CSVReader reader1 = new CSVReader(new FileReader("src\\employee_data.csv"))) {
            String[] info;
            while ((info = reader1.readNext()) != null) {
                // Assuming the first column contains usernames
                String username = info[1].trim(); // Trim to remove leading/trailing spaces
                if (info[0].equalsIgnoreCase(String.valueOf(employeeNumber))) {
                    System.out.println("set user is working");
                    lastName = info[1];
                    firstName = info[2];
                    birthday = info[3];
                    address = info[4];
                    phoneNumber = info[5];
                    sssNumber = info[6];
                    philhealthNumber = info[7];
                    tinNumber = info[8];
                    pagibigNumber = info[9];
                    status = info[10];
                    position = info[11];
                    immediateSupervisor = info[12];
                    basicSalary = Double.parseDouble(info[13]);
                    riceSubsidy = Double.parseDouble(info[14]);
                    phoneAllowance = Double.parseDouble(info[15]);
                    clothingAllowance = Double.parseDouble(info[16]);
                    grossSemiMonthlyRate = Double.parseDouble(info[17]);
                    hourlyRate = Double.parseDouble(info[18]);
                    System.out.println("this is setpos" + info[11]);
                    setPosition(info[11]);
                    
                    System.out.println(address);
                    MotorPH mph = new MotorPH();
                    mph.profileFullNameLbl.setText(getLastName() + ", " + getFirstName());
                    mph.profilePositionLbl.setText(getPosition());
                    mph.profileEmployeeNumberLbl.setText("Employee Number: " +String.valueOf(info[0]));
                    mph.profilePersonalInformationLastNameLbl.setText(getLastName());
                    mph.profileFirstNameLbl.setText(getFirstName());
                    mph.profileBirthdayLbl.setText(getBirthday());
                    mph.profileContactNoLbl.setText(getPhoneNumber());
                    mph.profileAddressTxtArea.setText(getAddress());
                    mph.profileBasicSalaryLbl.setText(String.valueOf(getBasicSalary()));
                    mph.profileHourlyRateLbl.setText(String.valueOf(getHourlyRate()));
                    mph.profileRiceSubsidyLbl.setText(String.valueOf(getRiceSubsidy()));
                    mph.profilePhoneSubsidyLbl.setText(String.valueOf(getPhoneAllowance()));
                    mph.profileClothingLbl.setText(String.valueOf(getClothingAllowance()));
                    mph.profileSssLbl.setText(getSssNumber());
                    mph.profilePagibigLbl.setText(getPagibigNumber());
                    mph.profilePhilhealthLbl.setText(getPhilhealthNumber());
                    mph.profileTinLbl.setText(getTinNumber());

                    mph.payslipBasicPayLbl.setText(String.valueOf(getBasicSalary()));
                    mph.payslipClothingAllowanceLbl.setText(String.valueOf(getClothingAllowance()));
                    mph.payslipRiceAllowanceLbl.setText(String.valueOf(getRiceSubsidy()));
                    mph.payslipPhoneAllowanceLbl.setText(String.valueOf(getPhoneAllowance()));
                    mph.payslipPhilhealthLbl.setText(String.valueOf(philhealthComputation.philhealthComputation(getBasicSalary())));
                    mph.payslipPagibigLbl.setText(String.valueOf(PagibigComputation.pagibigComputation(getBasicSalary())));
                    mph.payslipSssLbl.setText(String.valueOf(SssComputation.sssComputation(getBasicSalary())));
                    Double totalDeduction = (philhealthComputation.philhealthComputation(getBasicSalary())) + (SssComputation.sssComputation(getBasicSalary())) + (PagibigComputation.pagibigComputation(getBasicSalary()));
                    mph.payslipWithholdingTaxLbl.setText(String.valueOf(taxComputation.taxComputation(getBasicSalary(), totalDeduction)));
                    Double totalDeductionWithTax = totalDeduction + taxComputation.taxComputation(getBasicSalary(), totalDeduction);
                    mph.PayslipTotalDeductionLbl.setText(String.valueOf(totalDeductionWithTax));
                    mph.payslipTotalNetEarningsLbl.setText(String.valueOf(getBasicSalary()- totalDeductionWithTax));
                    mph.show();
                }
                
               
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
           
        }

    }
    
}
