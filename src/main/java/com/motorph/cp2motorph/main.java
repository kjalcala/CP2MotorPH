/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.motorph.cp2motorph;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class main {

    public static void main(String[] args) {
        LoginEmployee login = new LoginEmployee();
        if (login.verifylogin(login.getLastName(), login.getPassword()) == true){
            EmployeeDetails deets = new EmployeeDetails();
            System.out.println(deets.getEmployees());
        }
        
    }
}
