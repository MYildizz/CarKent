/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectAir;

/**
 *
 * @author Gurkan
 */
public abstract class MotherMain {
    
    protected String ID;
    protected static double totalMoney=1000.0;
    protected static int totalMale=0;
    protected static int totalFemale=0;
    protected static double cost=0.0;
    protected static double Tax=0.0;
    protected static int ParkingCounter=0;
    protected static int CleaningCounter=0;
    protected static int RepairCounter=0;

    public MotherMain() {
        
    }

    
    public MotherMain(String ID) {
        this.ID = ID;
        
    }

    public String getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "Plate : " + ID;
    }
    
    

    
    
    
    protected abstract String statisticsUsed();
    protected abstract String staticticOfAdvertisement();
    
    
    
    
}
