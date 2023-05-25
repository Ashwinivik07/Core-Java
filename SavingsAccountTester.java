package com.xworkz.shopping;

public class SavingsAccountTester {

    public static void main(String[] args) {
        SavingsAccount myAccount = new SavingsAccount();
        myAccount.credit(100000.00);
        System.out.println("Current available balance after credit is "+myAccount.getBalance());

        SavingsAccount zudioAccount = new SavingsAccount();
        myAccount.transfer(zudioAccount, 10000);
        System.out.println("Current balance in MyAccount "+ myAccount.getBalance());

        SavingsAccount zaraAccount = new SavingsAccount();
        myAccount.transfer(zaraAccount, 25000);
        System.out.println("Current balance in MyAccount "+ myAccount.getBalance());

        SavingsAccount malabarAccount = new SavingsAccount();
        myAccount.transfer(malabarAccount, 12000);
        System.out.println("Current balance in MyAccount "+ myAccount.getBalance());

        SavingsAccount relianceFreshAccount = new SavingsAccount();
        myAccount.transfer(relianceFreshAccount, 9000);
        System.out.println("Current balance in MyAccount "+ myAccount.getBalance());

        SavingsAccount unlimitedAccount = new SavingsAccount();
        myAccount.transfer(unlimitedAccount, 8000);
        System.out.println("Current balance in MyAccount "+ myAccount.getBalance());

        SavingsAccount allenSollyAccount = new SavingsAccount();
        myAccount.transfer(allenSollyAccount, 12000);
        System.out.println("Current balance in MyAccount "+ myAccount.getBalance());

        SavingsAccount bataAccount = new SavingsAccount();
        myAccount.transfer(bataAccount, 6000);
        System.out.println("Current balance in MyAccount "+ myAccount.getBalance());

    }

}
