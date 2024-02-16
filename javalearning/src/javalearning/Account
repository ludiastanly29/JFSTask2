package javalearning;

import java.util.Date;

public class Account {
    private double balance = 0.0;
    private String accNo;
    Date date = new Date();
    public Account() {
    	
    }

    public Account(String accNo,double balance) {
    	this.accNo = accNo;
        this.balance = balance;
    }

    public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void main(String[] args) {
        Account account = new Account("SBI0001",1000);
        account.depositAmount(100.0);
        account.withdrawAmount(50.0);
        account.displayBalance();
    }

    public void depositAmount(double amount) {
        if (amount > 0) {
            balance += amount;
			System.out.println("A/c "+accNo+" Credited for Rs." + amount + " is successful on "+date.toLocaleString()+". Available balance: Rs." + balance);
        } else {
            System.out.println("Invalid deposit amount. Amount must be greater than 0.");
        }
    }

    public void withdrawAmount(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("A/c "+accNo+" Debited for Rs." + amount + " is successful on "+date.toLocaleString()+". Available balance: Rs." + balance);
        } else {
            System.out.println("Invalid withdrawal amount. Amount must be greater than 0 and less than or equal to the balance.");
        }
    }

	private void displayBalance() {
		System.out.println("The balance available in your account : Rs." + balance);
		
	}
}
