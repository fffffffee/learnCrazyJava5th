/**
 * This package demonstrates the use of synchronized and notify mechanisms
 * in Java for thread communication and synchronization.
 */
//package synchronizedNotify;

public class Account {
    private String accountNo;
    private double balance;
    private boolean flag = false;
    public Account() {}
    public Account(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }
    public String getAccountNo() {
        return this.accountNo;
    }
    
    public double getBalance() {
        return this.balance;
    }
    
    public synchronized void draw(double drawAmount) {
        try {
            if (!flag) 
            {
                wait();
            } 
            else 
            {
                System.out.println(Thread.currentThread().getName() + " withdraws " + drawAmount);
                balance -= drawAmount;
                System.out.println("Account balance: " + balance);
                flag = false;
                notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void deposit(double depositAmount) {
        try {
            if (flag) 
            {
                wait();
            } 
            else 
            {
                System.out.println(Thread.currentThread().getName() + " deposits " + depositAmount);
                balance += depositAmount;
                System.out.println("Account balance: " + balance);
                flag = true;
                Thread.sleep(100);
                notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }   

    public int hashCode() {
        return accountNo.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == Account.class) {
            var target = (Account)obj;
            return target.getAccountNo().equals(accountNo);
        }
        return false;
    }
}
