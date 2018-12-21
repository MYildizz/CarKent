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
    public static double totalMoney=1001.0;
    public static double totalDollarMoney=1000.0;
    public static double totalEuroMoney=1000.0;
    protected static int totalMale=0;
    protected static int totalFemale=0;
    protected static double cost=0.0;
    public static double Tax=0.0;
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

    public static double getTotalMoney() {
        return totalMoney;
    }

    public static double getTotalDollarMoney() {
        return totalDollarMoney;
    }

    public static double getTotalEuroMoney() {
        return totalEuroMoney;
    }
    
    public abstract String statisticsUsed();
    protected abstract String staticticOfAdvertisement();
    
}
