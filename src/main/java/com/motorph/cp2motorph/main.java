/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.motorph.cp2motorph;


public class main {
public static String loggedOnUser;
    
    public static void main(String[] args) {
        login lgn = new login();
        lgn.show();
        loggedOnUser = lgn.getLoggedOnUser();
    }
}
