/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.motorph.cp2motorph;

/**
 *
 * @author kjalcala
 */
public class PagibigComputation {
    public static Double pagibigContribution = 0.0;
    static Double basePay;

    public static Double pagibigComputation(Double basicPay) {   
        basePay = basicPay;
        if (basePay >= 1000.0 && basePay <= 1500.00) {
            pagibigContribution = basePay * 0.01;
            return pagibigContribution;
        } else if (basePay > 1500.0) {
            pagibigContribution = basePay * 0.02;
            if (pagibigContribution > 100){
                pagibigContribution = 100.0;
                return pagibigContribution;
            }return pagibigContribution;
        } 
        return pagibigContribution;
    }
}
