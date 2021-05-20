package com.company;

public class Main {

    public static void main(String[] args) {

        // Bank athhb = new Bank("8412886725", 100.48, "athhb", "1112233", "athhb@gmail.com");
        Bank athhb = new Bank();
//        athhb.setCustomerName("athhb");
//        athhb.setAccountNo("112233");
//        athhb.setEmail("athhb@gmail.com");
//        athhb.setPhone("8412886725");

        System.out.println(athhb.getCustomerName());
        System.out.println(athhb.getAccountNo());
        System.out.println(athhb.getEmail());
        System.out.println(athhb.getPhone());

        System.out.println("isDeposited : "+athhb.deposit(100));
        System.out.println("Balance : "+athhb.getBalance());
        System.out.println("isWithdraw : "+athhb.withdraw(50));
        System.out.println("Balance : "+athhb.getBalance());
        System.out.println("isDeposited : "+athhb.deposit(-50));
        System.out.println("isWithdraw : "+athhb.withdraw(-50));
        System.out.println("isWithdraw : "+athhb.withdraw(1000));
        System.out.println("Balance : "+athhb.getBalance());


    }
}
