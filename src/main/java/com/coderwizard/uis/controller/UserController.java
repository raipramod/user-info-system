package com.coderwizard.uis.controller;

import com.coderwizard.uis.model.User;
import com.coderwizard.uis.service.UserService;
import com.coderwizard.uis.service.UserServiceImpl;

import javax.swing.*;
import java.time.LocalDate;
import java.util.List;

public class UserController {

    public static void main(String[] args) {
        String decision = "N";
        UserService userService = new UserServiceImpl();
       do{
           String operation = JOptionPane.showInputDialog("Enter operation: save|update|delete|get|list");
           switch (operation){
               case "save":
                    User user = getUser("save");
                  int saved =  userService.saveUser(user);
                  if (saved >= 1){
                      JOptionPane.showMessageDialog(null, "user info is saved in db" );
                  }else {
                      JOptionPane.showMessageDialog(null, "error in db" );
                  }
                   break;
               case "update":
                   User updatedUser = getUser("update");
                   int updated =  userService.saveUser(updatedUser);
                   if (updated >= 1){
                       JOptionPane.showMessageDialog(null, "user info is saved in db" );
                   }else {
                       JOptionPane.showMessageDialog(null, "error in db" );
                   }

                   break;
               case "delete":
                   int id = Integer.parseInt(JOptionPane.showInputDialog("Enter Id: "));
                   int deleted = userService.deleteUser();
                   if (deleted>= 1){
                       JOptionPane.showMessageDialog(null, "user info is deleted in db" );
                   }else {
                       JOptionPane.showMessageDialog(null, "error in db" );
                   }
                   break;
               case "get":
                    id = Integer.parseInt(JOptionPane.showInputDialog("Enter Id: "));
                   user = userService.getUserById(id);
                   System.out.println("****************");
                   System.out.println("User name is:"+ user.getUsername());
                   System.out.println(user);
                   System.out.println("***********************************");

                   break;
               case "list":
                   List<User> users = userService.getAllUser();
                   for (User u : users) {
                        printUserInfo(u);
                   }
                   break;


           }
           decision = JOptionPane.showInputDialog("Do you want to continue? Enter Y|N");
       }while(decision.equalsIgnoreCase("y"));
       JOptionPane.showMessageDialog(null, "Bye Bye See you soon");


    }

    public static User getUser(String type){
        User user = new User();
        if(type.equals("update")){
            int id = Integer.parseInt(JOptionPane.showInputDialog("Enter id:"));
            user.setId(id);
        }
        String username = JOptionPane.showInputDialog("Enter User Name: ");
        String password = JOptionPane.showInputDialog("Enter password:  ");
        long mobileNo = Long.parselong(JOptionPane.showInputDialog("Enter User MobileNo: "));
        double salary = Double.parseDouble(JOptionPane.showInputDialog("Enter Salary"));
        LocalDate dob = LocalDate.parse(JOptionPane.showInputDialog("Enter DOB:"));
        boolean active = Boolean.parseBoolean(JOptionPane.showInputDialog("Enter boolean"));
        user.setUsername(username);
        user.setPassword(password);
        user.setSalary(salary);
        user.setMobileNo(mobileNo);
        user.setActive(active);
        user.setDob(dob);

        return user;
    }

    public static void printUserInfo(User user){
        System.out.println("****************************");
        System.out.println("User id is:" +user.getId());
        System.out.println("User name is:"+ user.getUsername());
        System.out.println("Password is: "+user.getPassword());
        System.out.println("MobileNo is:" + user.getMobileNo());
        System.out.println("DOB is "+user.getDob());
        System.out.println("is User Active:" +user.isActive());
        System.out.println("***********************************");

    }

}

//C = create = savve
//R = Read = list
//U = Update = update
//D = Delete = delete
