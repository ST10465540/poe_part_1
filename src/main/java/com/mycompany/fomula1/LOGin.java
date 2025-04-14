/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fomula1;

import javax.swing.*;

public class LOGin {
    private String loginUsername;
    private String loginPassword;
    private String LoginFirstname;
    private String LoginLastname;

    // Method to get login details from user
    public void login(Fomula1 registeredUser) {
        JOptionPane.showMessageDialog(null, "CHATT WAVE - LOGIN");

        boolean loggedIn = false;

        while (!loggedIn) {
            loginUsername = JOptionPane.showInputDialog("Enter your username:");
            if (loginUsername == null) break; // User pressed cancel

            loginPassword = JOptionPane.showInputDialog("Enter your password:");
            if (loginPassword == null) break; // User pressed cancel

            // Validate username and password
            if (loginUsername.equals(registeredUser.Username) && loginPassword.equals(registeredUser.Password)) {
                JOptionPane.showMessageDialog(null, "Login successful!\nWelcome  " + registeredUser.Firstname + " " + registeredUser.Lastname + ". It is great to see you again");
                loggedIn = true;
            } else {
                int option = JOptionPane.showConfirmDialog(null, "Username or password incorrect, try again?", "Login Failed", JOptionPane.YES_NO_OPTION);
                if (option != JOptionPane.YES_OPTION) {
                    break; // Exit loop if user selects No
                }
            }
        }
    }
}
        
    
