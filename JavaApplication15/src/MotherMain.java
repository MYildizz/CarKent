

/**
 *
 * @author Gurkan
 */
public abstract class MotherMain implements IPrice {
    
    protected String ID;
    protected static double totalMoney=0.0;
    protected static int totalMale=0;
    protected static int totalFemale=0;
    protected static double cost=0.0;   
    protected static double Tax=0.0;
    
    public MotherMain() {
        
    }

    
    public MotherMain(String ID) {
        this.ID = ID;
        
    }

    
    
    
    /*
    protected  String staticticCash();
    protected  String staticticOfAdvertisement();
    protected  double CostOfTax();
    protected  double addProfit();
    protected  double substractionMoney();
    
    */
    
    
    
    
}
