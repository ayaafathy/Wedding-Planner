
package WeddPayments;


public class Cash {
    
    private String bankName;
    private String bankAccount;
    

    public Cash(String bankname, String bankAccount) {
        this.bankName = bankname;
        this.bankAccount = bankAccount;
    }

    
    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }
    
    
    public void dispInfo()
    {
    System.out.println(getBankAccount());
    System.out.println(getBankName());

    }
    
}
