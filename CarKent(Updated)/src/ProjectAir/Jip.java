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
public class Jip extends Parking{
    public static final int jip=7;
    static int totalJip=0;

      

    public Jip(String ID, String name, String surname, String TC, String Profession, String Gender, String CarParkingArea) {
        super(ID, name, surname, TC, Profession, Gender, CarParkingArea);
        totalJip++;
    }
    
   

    @Override
    public double getPrice(){
        
        this.Price=this.CalcTotalTime()*Jipp;
        return this.Price;
    }
    
    
    
}
