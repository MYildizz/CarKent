/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Murat
 */
public abstract class Repair extends MotherMain
{
    
        private String model;
        private final static int MaxCar=20;
        private static int TotalCar=0;
        
         protected static int Tire=50;
         protected static int Seat=50;
         protected static int window=50;
         protected static int rim=50;
         protected static int headlight=50;
        
        
    public abstract  void faultDetection();   
    public abstract  void Repair_Car();
        

    @Override
    public double getPrice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    
    
        
        
        
        
        
        
        
        
        
   
}
