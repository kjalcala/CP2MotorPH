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
    }
    public String getLastName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Last Name: ");
        lastname = input.nextLine();
        return lastname;
    }
    public String getPassword(){
        Scanner input = new Scanner(System.in);
        System.out.println("Password: ");
        password = input.nextLine();
        return password;
    }
    
    public boolean verifylogin(String lastname, String password) { 
        if (lastname.equals("Garcia") && password.equals("password")){
            System.out.println("login successful");
            return true;
        } else {
            return false;
        }
    }
    
    
}
