package com.driver;

public class Email {

    private final String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
        if(!oldPassword.equals(this.password)){
            System.out.println("Oldpassword is incorrect.");
            return ;
        }
        if(newPassword.length()<8){
            System.out.println("New password must contain at least 8 characters.");
            return ;
        }
        boolean upc=false;
        boolean lwc=false;
        boolean dt=false;
        boolean spl=false;

        for (char c : newPassword.toCharArray()) {
            if (Character.isUpperCase(c)) {
                upc=true;
            } 
            else if (Character.isLowerCase(c)) {
                lwc=true;
            } 
            else if (Character.isDigit(c)) {
                dt=true;
            }   
            else {
                spl=true;
            }
        }
        if (!upc) {
            System.out.println("New password must contain at least one uppercase letter.");
            return ;
        }
    
        if (!lwc) {
            System.out.println("New password must contain at least one lowercase letter.");
            return ;
        }
    
        if (!dt) {
            System.out.println("New password must contain at least one digit.");
            return ;
        }
    
        if (!spl) {
            System.out.println("New password must contain at least one special character.");
            return ;
        }
        this.password = newPassword;
        System.out.println("Password changed successfully.");
    }
}
