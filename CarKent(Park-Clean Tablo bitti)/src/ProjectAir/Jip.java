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
    //public static final int jip=7;
    static int totalJip=1;

      

    public Jip(String ID, String name, String surname, String TC, String Profession, String Gender, String CarParkingArea,boolean SpecialCondition) {
        super(ID, name, surname, TC, Profession, Gender, CarParkingArea,SpecialCondition);
        totalJip++;
    }

    public static int getTotalJip() {
        return totalJip;
    }
    
    
   

    @Override
    public double getPrice(){
        if (isSpecialCondition()) {
            if (person.Profession.equalsIgnoreCase("Student")||person.Profession.equalsIgnoreCase("Soldier")||person.Profession.equalsIgnoreCase("Police")) {
           if(Hour>=8 && Hour <=17)
           {
               this.Price=this.CalcTotalTime()*IPrice.Jipp*IPrice.Day*IPrice.PercantageOfDiscount*IPrice.OzelDurum+35;
           }
           else{
               this.Price=this.CalcTotalTime()*IPrice.Jipp*IPrice.Night*IPrice.PercantageOfDiscount*IPrice.OzelDurum+35;
           }
            
       }
        else{
           if(Hour>=8 && Hour <=17)
           {
               this.Price=this.CalcTotalTime()*IPrice.Jipp*IPrice.Day*IPrice.OzelDurum+35;
           }
           else{
               this.Price=this.CalcTotalTime()*IPrice.Jipp*IPrice.Night*IPrice.OzelDurum+35;
           }
            
        }
        }
        else {                   
        if (person.Profession.equalsIgnoreCase("Student")||person.Profession.equalsIgnoreCase("Soldier")||person.Profession.equalsIgnoreCase("Police")) {
           if(Hour>=8 && Hour <=17)
           {
               this.Price=this.CalcTotalTime()*IPrice.Jipp*IPrice.Day*IPrice.PercantageOfDiscount+35;
           }
           else{
               this.Price=this.CalcTotalTime()*IPrice.Jipp*IPrice.Night*IPrice.PercantageOfDiscount+35;
           }
            
       }
        else{
           if(Hour>=8 && Hour <=17)
           {
               this.Price=this.CalcTotalTime()*IPrice.Jipp*IPrice.Day+35;
           }
           else{
               this.Price=this.CalcTotalTime()*IPrice.Jipp*IPrice.Night+35;
           }
            
        }  
        }
        return this.Price;
    }

    @Override
    public String toString() {
        return super.toString()+ person.toString();
    }
    
    
    
}
