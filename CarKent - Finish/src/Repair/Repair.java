package Repair;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Murat
 */

import Common_Classes.MotherMain;
import Common_Classes.IPrice;
public abstract  class Repair extends MotherMain implements IRepair
{
    
         private  String Model;
         private final static int MaxCar=20;
         private static int TotalCar=0;
         
         protected static int CountFemale=DieselCar.getCountFemale()+ElectricCar.getCountFemale()+GasolineCar.getCountFemale();
         protected static int CountMale=DieselCar.getCountMale()+ElectricCar.getCountMale()+GasolineCar.getCountMale();

                                                    
         public static int Tire=49;
         public static int Seat=37;
         public static int window=24;
         public static int rim=5;
         public static int headlight=19;

    public Repair(String model, String ID) 
    {
        super(ID);
        this.Model = model;
    }
    
    @Override
    public  void Reset()
    {
        CountFemale=0;
        CountMale=0;
    }

    public static int getTire() {
        return Tire;
    }

    public static int getSeat() {
        return Seat;
    }

    public static int getWindow() {
        return window;
    }

    public static int getRim() {
        return rim;
    }

    public static int getHeadlight() {
        return headlight;
    }
    
         
     public  String getModel() {
        return Model;
    }

    public static int getCountFemale() {
        return CountFemale;
    }

    public static int getCountMale() {
        return CountMale;
    }
                     
    
    public abstract  String faultDetection();   
    public abstract  boolean Repair_Car();
    
    
    public double getPrice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    
    
        
        
        
        
        
        
        
        
        
   
}
