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
     //public static final int lorry=3;
     static int totalLorry=3;    
    public Lorry(String ID, String name, String surname, String TC, String Profession, String Gender, String CarParkingArea,boolean SpecialCondition) {
        super(ID, name, surname, TC, Profession, Gender, CarParkingArea,SpecialCondition);
        totalLorry++;
    }

    public static int getTotalLorry() {
        return totalLorry;
    }
    

    
   @Override
    public double getPrice(){      
        if (isSpecialCondition()) {
           if (person.Profession.equalsIgnoreCase("Student")||person.Profession.equalsIgnoreCase("Soldier")||person.Profession.equalsIgnoreCase("Police")) {
           if(Hour>=8 && Hour <=17)
           {
               this.Price=this.CalcTotalTime()*IPrice.Lorryy*IPrice.Day*IPrice.PercantageOfDiscount*IPrice.OzelDurum+45;
           }
           else{
               this.Price=this.CalcTotalTime()*IPrice.Lorryy*IPrice.Night*IPrice.PercantageOfDiscount*IPrice.OzelDurum+45;
           }
            
       }
        else{
           if(Hour>=8 && Hour <=17)
           {
               this.Price=this.CalcTotalTime()*IPrice.Lorryy*IPrice.Day*IPrice.OzelDurum+45;
           }
           else{
               this.Price=this.CalcTotalTime()*IPrice.Lorryy*IPrice.Night*IPrice.OzelDurum+45;
           }
            
        }              
       }
        else{
            
        
        if (person.Profession.equalsIgnoreCase("Student")||person.Profession.equalsIgnoreCase("Soldier")||person.Profession.equalsIgnoreCase("Police")) {
           if(Hour>=8 && Hour <=17)
           {
               this.Price=this.CalcTotalTime()*IPrice.Lorryy*IPrice.Day*IPrice.PercantageOfDiscount+45;
           }
           else{
               this.Price=this.CalcTotalTime()*IPrice.Lorryy*IPrice.Night*IPrice.PercantageOfDiscount+45;
           }
            
       }
        else{
           if(Hour>=8 && Hour <=17)
           {
               this.Price=this.CalcTotalTime()*IPrice.Lorryy*IPrice.Day+45;
           }
           else{
               this.Price=this.CalcTotalTime()*IPrice.Lorryy*IPrice.Night+45;
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
