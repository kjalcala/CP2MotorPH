/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.motorph.cp2motorph;
import java.awt.font.TextAttribute;
import java.util.Scanner;
/**
 *
 * @author kjalcala
 */
public class LoginEmployee {
    public String lastname;
    public String password;
    public String role;
    
    public void logInMessage(){
        System.out.println("================================");
        System.out.println("    MotorPH Payroll System      ");
        System.out.println("================================");
    }
    public String getLastName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Last Name: ");
        lastname = input.next();
        return lastname;
    }
    public String getPassword(){
        Scanner input = new Scanner(System.in);
        System.out.println("Password: ");
        password = input.next();
        return password;
    }
    
    public boolean verifylogin(String lastname, String password) { 
        EmployeeDetails lastnamecheck = new EmployeeDetails();    
        if (lastnamecheck.getFirstNameArrayLogin(lastname) && password.equals("password")){
            System.out.println("login successful");
            System.out.println("================================");
            return true;
        } else {
            return false;
        }
    }
    
    
    
    
}
