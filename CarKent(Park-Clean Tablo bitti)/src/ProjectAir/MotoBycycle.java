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
    //public static final int motobycycle=9;
    static int totalMoto=2;    
    public MotoBycycle(String ID, String name, String surname, String TC, String Profession, String Gender, String CarParkingArea,boolean SpecialCondition) {
        super(ID, name, surname, TC, Profession, Gender, CarParkingArea,SpecialCondition);
        totalMoto++;
        
    }
    public static int getTotalMoto() {
        return totalMoto;
    }
    
    
    @Override
    public double getPrice(){  
        if (isSpecialCondition()) {
           if (person.Profession.equalsIgnoreCase("Student")||person.Profession.equalsIgnoreCase("Soldier")||person.Profession.equalsIgnoreCase("Police")) {
           if(Hour>=8 && Hour <=17)
           {
               this.Price=this.CalcTotalTime()*IPrice.Moto*IPrice.Day*IPrice.PercantageOfDiscount*IPrice.OzelDurum+25;
           }
           else{
               this.Price=this.CalcTotalTime()*IPrice.Moto*IPrice.Night*IPrice.PercantageOfDiscount*IPrice.OzelDurum+25;
           }
            
       }
        else{
           if(Hour>=8 && Hour <=17)
           {
               this.Price=this.CalcTotalTime()*IPrice.Moto*IPrice.Day*IPrice.OzelDurum+25;
           }
           else{
               this.Price=this.CalcTotalTime()*IPrice.Moto*IPrice.Night*IPrice.OzelDurum+25;
           }
            
        }              
            
        }
        else{                               
        if (person.Profession.equalsIgnoreCase("Student")||person.Profession.equalsIgnoreCase("Soldier")||person.Profession.equalsIgnoreCase("Police")) {
           if(Hour>=8 && Hour <=17)
           {
               this.Price=this.CalcTotalTime()*IPrice.Moto*IPrice.Day*IPrice.PercantageOfDiscount+25;
           }
           else{
               this.Price=this.CalcTotalTime()*IPrice.Moto*IPrice.Night*IPrice.PercantageOfDiscount+25;
           }
            
       }
        else{
           if(Hour>=8 && Hour <=17)
           {
               this.Price=this.CalcTotalTime()*IPrice.Moto*IPrice.Day+25;
           }
           else{
               this.Price=this.CalcTotalTime()*IPrice.Moto*IPrice.Night+25;
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
