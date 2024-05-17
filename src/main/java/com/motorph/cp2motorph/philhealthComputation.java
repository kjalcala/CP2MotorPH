/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.motorph.cp2motorph;

/**
 *
 * @author kjalcala
 */
public class philhealthComputation {
    public static Double philhealthContribution = 0.0;
    public String formattedPhilhealthContribution;
    public static Double philhealthComputation(Double employeeloginbasePay){
        Double basePay = employeeloginbasePay;
        philhealthContribution = 0.0;
            if (basePay <= 10000.0){
                philhealthContribution = 300.0 / 2;
                return philhealthContribution;
            } else if (basePay > 10000.0 && basePay < 60000.0) {
                philhealthContribution = (basePay * 0.03) / 2;
                return philhealthContribution;                                   
            } else if (basePay >= 60000.0) {
                philhealthContribution = 900.0;
                return philhealthContribution;
            } return philhealthContribution;
    }
}
