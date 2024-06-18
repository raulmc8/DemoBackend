package com.demoSpring.backDemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int accountNumber;
    private String bankName;
    private String bankBranch;
    private String accountHolderName;
    private int mobileNumber;
    private String email;

    public Client() {
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public String getBankBranch() {
        return bankBranch;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setBankBranch(String bankBranch) {
        this.bankBranch = bankBranch;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
