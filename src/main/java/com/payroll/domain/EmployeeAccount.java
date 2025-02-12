/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.payroll.domain;

/**
 *
 * @author leniejoice
 */
public class EmployeeAccount extends Person implements AccountInfo {
    private int accountID;
    private String empUserName; 
    private String empPassword;
    private EmployeeDetails empDetails;
    private UserRole userRole;
    private LeaveDetails leaveDetail;

    public LeaveDetails getLeaveDetail() {
        return leaveDetail;
    }

    public void setLeaveDetail(LeaveDetails leaveDetail) {
        this.leaveDetail = leaveDetail;
    }
    

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }
    
    public int getAccountID() {
        return accountID;
    }
    
    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }
    
    @Override
    public String getEmpUserName() {
        return empUserName;
    }

    public void setEmpUserName(String empUserName) {
        this.empUserName = empUserName;
    }
    
    @Override
    public String getEmpPassword() {
        return empPassword;
    }

    public void setEmpPassword(String empPassword) {
        this.empPassword = empPassword;
    }
    
    public EmployeeDetails getEmpDetails() {
        return empDetails;
    }

    public void setEmpDetails(EmployeeDetails empDetails) {
        this.empDetails = empDetails;
    }
    
    
}
