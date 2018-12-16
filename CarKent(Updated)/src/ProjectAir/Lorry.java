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
public class Lorry extends Parking{
     public static final int lorry=3;
     static int totalLorry=0;

    

    public Lorry(String ID, String name, String surname, String TC, String Profession, String Gender, String CarParkingArea) {
        super(ID, name, surname, TC, Profession, Gender, CarParkingArea);
        totalLorry++;
    }

    
   @Override
    public double getPrice(){
        
        this.Price=this.CalcTotalTime()*Lorryy;
        return this.Price;
    }
    
   
}
