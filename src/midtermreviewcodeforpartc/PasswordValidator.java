/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermreviewcodeforpartc;

import java.util.Scanner;

/**
 *
 * @author lenhu
 */
public class PasswordValidator {
     private User users[] = new User[100];
    public void run()
            
    {
        
        
        int userCount=0;//keep track of number of users for array
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your desired user name:");
        String userName = sc.nextLine();
        
        System.out.println("Your name is: " + userName);
        
  
        boolean validPassword=false;
        String password="";
        while(!validPassword)
        {
            System.out.println("Passwords must have at least 8 characters");
            System.out.println("Passwords must have at least one special character");
            System.out.println("Please enter your desired password:"); 
            
            password = sc.nextLine();
            int specialCharCount=0;
            //iterate over each character to see if it is a special character
            for(int i=0;i<password.length(); i++)
            {
                if(!(Character.isLetterOrDigit(password.charAt(i))))
                {
                    //now we know there is at least one special character
                    specialCharCount++;
                }
            }
            if(specialCharCount>0 &&password.length()>7)
            {
                validPassword=true;
            }
        }//loop only ends when password is valid so now we create the User
        
        User newUser = new User(userName, password);
        users[userCount] = newUser;//add the new user to the user list
        userCount++;
        System.out.println("New User Added");
        System.out.println("UserName: " + userName);
        System.out.println("Password: just kidding can't show password");
    }//end run method
    
}
