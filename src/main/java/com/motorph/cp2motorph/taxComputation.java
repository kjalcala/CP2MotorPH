/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.motorph.cp2motorph;

/**
 *
 * @author kjalcala
*/
public class taxComputation {
    static Double basePay;
    static Double totalContribution;
    public static Double tax;
    public static Double taxComputation(Double basicPay, Double ptotalContribution){
        basePay = basicPay;
        totalContribution = ptotalContribution;
        tax = 0.0;
     
       
            if (basePay <= 20832.0) {
                tax = 0.0; 
                return tax;
            } else if (basePay > 20832 && basePay <= 33333.0){
                tax = ((basePay - totalContribution)-20833) * 0.2;
                return tax;
            } else if (basePay > 33333.0 && basePay <= 66667.0){
                tax = (((basePay - totalContribution )-33333) * 0.25) + 2500;
                return tax;
            } else if (basePay > 66667.0 && basePay <= 166667.0){
                tax = (((basePay - totalContribution )-66667) * 0.3) + 10833;
                return tax;
            } else if (basePay > 166667.0 && basePay <= 666667.0){
                tax = (((basePay - totalContribution )-166667) * 0.32) + 40833.33;
                return tax;
            } else if (basePay > 666667.0){
                tax = (((basePay - totalContribution )-666667) * 0.35) + 200833.33;
                return tax;
            } return tax;
    }
}
 