public class Account {
    private String accountNo;
    private double balance;
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
    public void setBalance(double balance) {
        this.balance = balance;
    }           
    public double getBalance() {
        return this.balance;
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
