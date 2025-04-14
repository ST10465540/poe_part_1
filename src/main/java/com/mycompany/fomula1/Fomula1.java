/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fomula1;
import javax.swing.*;
/**
 *
 * @author RC_Student_lab
 */
public class Fomula1 {
  public String Firstname;
    public String Lastname;
    public String Username;
    public String Password;
    public int cellphone;
    
    
    
    // Method to validate username
    public void CheckUserName() {
        boolean valid = false;
        while (!valid) {
            boolean hasUnderscore = Username.contains("_");
            if (hasUnderscore && Username.length() <= 5) {
                JOptionPane.showMessageDialog(null, "Username successfully captured!.");
                valid = true;
            } else {
                JOptionPane.showMessageDialog(null,
                        "Username is not correctly formated.Please ensure that your username contains an underscore (_) and no more than five characters in length");
                Username = JOptionPane.showInputDialog("Enter username:");
            }
        }
    }

    // Method to validate password
    public boolean Checkpassword(String password) {
        boolean hasUppercase = false, hasDigit = false, hasSpecialChar = false;
        String SpecialChr = "~!@#$%^&*()_=+<>/{}|::'\",.";

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) hasUppercase = true;
            if (Character.isDigit(ch)) hasDigit = true;
            if (SpecialChr.contains(Character.toString(ch))) hasSpecialChar = true;
           
        }

        return password.length() >= 8 && hasUppercase && hasDigit && hasSpecialChar;
         
    }

    // Main registration method
    public void RegisterUser() {
     
        JOptionPane.showMessageDialog(null, "CHATT WAVE");
        JOptionPane.showMessageDialog(null, "WELCOME !!");
        
         Firstname= JOptionPane.showInputDialog("Please Enter your First name");
         Lastname=JOptionPane.showInputDialog("Please Enter your Last name");
         JOptionPane.showMessageDialog(null,"Welcome"+" "+Firstname+" "+Lastname);
        // Prompt user to enter username
        Username = JOptionPane.showInputDialog("Please enter your Username:");
        CheckUserName();

        // Prompt user to enter password and validate
        do {
            Password = JOptionPane.showInputDialog("Enter password:");
            if (!Checkpassword(Password)) {
                JOptionPane.showMessageDialog(null,
                        "Password is not correctly formatted. please ensure that your password has at least 8 characters and contains a capital letter a number and a special character");
            }
        } while (!Checkpassword(Password));
        // Add this line to confirm password capture
        JOptionPane.showMessageDialog(null, "Password successfully captured.");

        // Prompt user to enter cell phone number
        // Prompt user to enter valid South African cellphone number
boolean validCell = false;
String cellInput ="";
while (!validCell) {
     cellInput = JOptionPane.showInputDialog("Enter your South African cellphone number (e.g. 0821234567):");

    if (cellInput != null && cellInput.matches("\\+27\\d{9}")) {
        validCell = true;
        JOptionPane.showMessageDialog(null,"Cell phone number successfully added");
        
    } else {
        JOptionPane.showMessageDialog
        (null,
        "Cellphone number incorrecltly formated \nOr does not contain international code");
    }
}
JOptionPane.showMessageDialog(null, "WELCOME TO CHATT WAVE !!");
        JOptionPane.showMessageDialog(null, "Registration successful !! \nFirstname:"+ Firstname+"\nLastname:"+Lastname+"\nUsername: " + Username + "\nCellphone: "+cellInput);
    
   
    }
    public static void  main(String[] args) {
        Fomula1 Usersign_in = new Fomula1();
        Usersign_in.RegisterUser();
       LOGin loginPage = new LOGin();
    loginPage.login(Usersign_in); // Calls login after registration
}
    }

