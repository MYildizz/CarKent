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
public class MotoBycycle extends Parking{
    public static final int motobycycle=9;
    static int totalMoto=0;

   
    

   

    public MotoBycycle(String ID, String name, String surname, String TC, String Profession, String Gender, String CarParkingArea) {
        super(ID, name, surname, TC, Profession, Gender, CarParkingArea);
        totalMoto++;
    }
    
    @Override
    public double getPrice(){
        
      
       this.Price= this.CalcTotalTime()* Moto;
        
       
        return this.Price;
    }

    
    
}
