import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;

/**
 * This package demonstrates the use of synchronized and notify mechanisms
 * in Java for thread communication and synchronization.
 */
//package synchronizedNotify;

public class Account {
    private final Lock lock = new ReentrantLock();
    private final Condition cond = lock.newCondition();
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
    
    public void draw(double drawAmount) {
        try {
            lock.lock();
            if (!flag) 
            {
                cond.await();
            } 
            else 
            {
                System.out.println(Thread.currentThread().getName() + " withdraws " + drawAmount);
                balance -= drawAmount;
                System.out.println("Account balance: " + balance);
                flag = false;
                cond.signalAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
    }

    public void deposit(double depositAmount) {
        try {
            lock.lock();
            if (flag) 
            {
                cond.await();
            } 
            else 
            {
                System.out.println(Thread.currentThread().getName() + " deposits " + depositAmount);
                balance += depositAmount;
                System.out.println("Account balance: " + balance);
                flag = true;
                Thread.sleep(100);
                cond.signalAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
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
