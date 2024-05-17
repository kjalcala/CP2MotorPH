/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.motorph.cp2motorph;

/**
 *
 * @author kjalcala
 */
public class SssComputation {    
    
    static Double basePay;
    public static Double sssContribution;
    public static Double sssComputation(Double basicPay){
        basePay = basicPay;
        sssContribution = 135.0;
            Double sssCompensation = 3250.0;
            Double SCom = 500.0;
            Double SCon = 22.5;
            Double maxSssCompensation = 24750.0;
            if (basePay >= sssCompensation){
                while (sssCompensation <= basePay){ 
                    if (sssCompensation > 24750){
                        break;
                    }
                    sssCompensation = sssCompensation + SCom;
                    sssContribution = sssContribution + SCon;
                } return sssContribution;
            } return sssContribution;
    }
}
