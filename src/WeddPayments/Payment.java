
    
    
package WeddPayments;


public class Payment implements WeddPayments.IAmount {

    
    private String paymenID;
    
    

    public Payment(String paymenID) {
        this.paymenID = paymenID;
    }

    public String getPaymenID() {
        return paymenID;
    }

    public void setPaymenID(String paymenID) {
        this.paymenID = paymenID;
    }
    
    
    
    
   

   // @Override
    public double calcTotalAmount(double totalAmount) {
       
        return totalAmount;
    }

    @Override
    public double calcTotalAmount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   CreditCard payWCCard(CreditCard ccPayment)
   {
        return null;
       
   }
   
   Cash payInCash(Cash cashPayment)
   {
        return null;
       
   }
    
}
