package com.group18.capstone.controller;

public class UserCurd {

    private int UserID;
    private String FirstName;
    private String LastName;
    private String UserName;
    private String Password;
    private String EmailAddress;
    private String Role;

    public UserCurd(int UserID, String firstName, String lastName, String userName, String password, String emailAddress, String role) {
        super();
        this.UserID = UserID;
        this.FirstName = firstName;
        this.LastName = lastName;
        this.UserName = userName;
        this.Password = password;
        this.EmailAddress = emailAddress;
        this.Role = role;
    }

    public UserCurd(String firstName, String lastName, String userName, String password, String emailAddress, String role) {
        super();
        this.FirstName = firstName;
        this.LastName = lastName;
        this.UserName = userName;
        this.Password = password;
        this.EmailAddress = emailAddress;
        this.Role = role;
    }

    public UserCurd(int userID, String role) {
        this.UserID = userID;
        this.Role = role;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        this.UserID = userID;
    }

    public String getRole() {
        return Role;
    }
    public void setRole(String role) {
        this.Role = role;
    }
    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String EmailAddress) {
        this.EmailAddress = EmailAddress;
    }



}