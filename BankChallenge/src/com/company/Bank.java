package com.company;

public class Bank {
    private String accountNo;
    private double balance;
    private String customerName;
    private String email;
    private String phone;

    public Bank() {
        this("8412886725",1223.44,"default","112233", "default@gmail.com");
        System.out.println("empty called!");
    }

    public Bank(String phone, double balance, String customerName, String accountNo, String email) {
        this.phone = phone;
        this.balance = balance;
        this.email = email;
        this.customerName = customerName;
        this.accountNo = accountNo;
    }

    public Bank(String customerName, String email, String phone) {
        this(phone,1223.44,customerName,"112233", email);
    }


    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getAccountNo() {
        return this.accountNo;
    }

    public String getPhone() {
        return this.phone;
    }

    public double getBalance() {
        return this.balance;
    }

    public boolean deposit(int depositAmount) {
        if (depositAmount <= 0) return false;
        this.balance += depositAmount;
        return true;
    }

    public boolean withdraw(int withdrawAmount) {
        if (withdrawAmount <= 0 || withdrawAmount > this.balance) return false;

        this.balance -= withdrawAmount;
        return true;
    }
}
