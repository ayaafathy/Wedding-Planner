
package WeddPayments;

import System.projDate;


public class CreditCard {
    
    
    private String holderName;
    private String cardNumber;
    private String bankName;
    private projDate expiryDate;
    private double balance;
  
    public CreditCard(String holderName, String cardNumber, String bankName, projDate expiryDate, double balance) {
        this.holderName = holderName;
        this.cardNumber = cardNumber;
        this.bankName = bankName;
        this.expiryDate = expiryDate;
        this.balance = balance;
       
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public projDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(projDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

  

   
    
    
    
    
    String isCardValid(String cardNumber)
    {
        return null;   
    }
    
    
    
    Payment makePayment(Payment amount)
    {
        return null;
    }
            
    
}
