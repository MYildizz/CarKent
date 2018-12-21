/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermproject;

import ProjectAir.MotherMain;
import ProjectAir.Personality;


public class Cleaning  extends MotherMain {
    
    protected static int  total_water_and_Foam= 200;
    protected static int total_wax_quantity = 150;
    protected static int sales = 0;
    protected static int consume_wax = 0;
    protected static int consume_WaF = 0;
    protected static int total_Cleaning = 0;
    protected static int Cleaning_Male = 0;
     protected static int Cleaning_Female = 0;
    protected Personality person;
    private String VehicleType;
    public double price = 0;
    public String typeOfwashing = "";

    public Cleaning(String ID, String name, String surname, String identity, String profession, String gender, String car) {
        super(ID);
        this.person = new Personality(name, surname, identity, profession, gender);
        total_Cleaning++;
        this.VehicleType = car;
        
        if (gender.equalsIgnoreCase("male")) 
            Cleaning_Male++;
        else
            Cleaning_Female++;
    }

    public String getVehicleType() {
        return VehicleType;
    }

    public Personality getPerson() {
        return person;
    }

    public double getPrice() {
        return price;
    }
    
    public String getTypeOfwashing() {
        return typeOfwashing;
    }
    
    
    public static double DecidePriceAccordingtoCarType(String car, String profession , boolean condition, boolean interior_wash , boolean exterior_wash, boolean auto_Hairdresser, boolean wax_polish)
    {
        sales = 0;
        if (car.equalsIgnoreCase("lorry"))
        {
            if (interior_wash == true && exterior_wash == false && wax_polish ==  false){
                total_water_and_Foam--;
                consume_WaF++;
                sales += 60.0; 
            }
            
            else if (interior_wash == true && exterior_wash == false && wax_polish ==  true){
                total_water_and_Foam--;
                total_wax_quantity--;
                consume_WaF++;
                consume_wax++;
                sales += 210.0; 
            }
            
            else if (interior_wash == false && exterior_wash == true && wax_polish ==  false){
                total_water_and_Foam--;
                consume_WaF++;
                sales += 50.0;
            }
            
            else if (interior_wash == false && exterior_wash == true && wax_polish ==  true){
                total_water_and_Foam--;
                total_wax_quantity--;
                consume_WaF++;
                consume_wax++;
                sales += 200.0;
            }
            
            else if(interior_wash == true && exterior_wash == true && wax_polish == false){
                total_water_and_Foam -= 2;
                consume_WaF += 2;
                sales += 100.0;
            }
            
            else if(interior_wash == true && exterior_wash == true && wax_polish == true){
                total_water_and_Foam -= 2;
                total_wax_quantity--;
                consume_WaF += 2;
                consume_wax++;
                sales += 250.0;
            }
            
            else if(interior_wash == false && exterior_wash == false && auto_Hairdresser == false && wax_polish == false)
                return 0;
            
            else if (auto_Hairdresser == true && wax_polish == false){
                total_wax_quantity--;
                consume_WaF++;
                sales += 500.0;
            }
            
            else if(auto_Hairdresser == true && wax_polish == true){
                total_water_and_Foam--;
                total_wax_quantity--;
                consume_wax++;
                consume_WaF++;
                sales += 635.0;
            }
            
            else{ //auto_Hairdresser == false && wax_polish == true
                total_wax_quantity--;
                consume_wax++;
                sales += 150.0;
            }

            if( ( profession.equalsIgnoreCase("Police") || profession.equalsIgnoreCase("Student") || profession.equalsIgnoreCase("Soldier") ) && condition == true  )
                sales -= sales * 0.12;
            
            if(( profession.equalsIgnoreCase("Police") || profession.equalsIgnoreCase("Student") || profession.equalsIgnoreCase("Soldier") ) && condition == false)
                sales -= sales * 0.08;
  
            return sales;
        }
        
        
        else if(car.equalsIgnoreCase("automobile"))
        {
            if (interior_wash == true && exterior_wash == false && wax_polish == false){
                total_water_and_Foam--;
                consume_WaF++;
                sales += 30.0;
            }
            
            else if (interior_wash == true && exterior_wash == false && wax_polish == true){
                total_water_and_Foam--;
                total_wax_quantity--;
                consume_WaF++;
                consume_wax++;
                sales += 110.0;
            }
            
            else if (interior_wash == false && exterior_wash == true && wax_polish == false){
                total_water_and_Foam--;
                consume_WaF++;
                sales += 20.0;
            }
            
            else if (interior_wash == false && exterior_wash == true && wax_polish == true){
                total_water_and_Foam--;
                total_wax_quantity --;
                consume_WaF++;
                consume_wax++;
                sales += 100.0;
            }
            
            else if(interior_wash == true && exterior_wash == true && wax_polish == false){
                total_water_and_Foam -= 2;
                consume_WaF += 2;
                sales += 45.0;
            }
            
            else if(interior_wash == true && exterior_wash == true && wax_polish == true){
                total_water_and_Foam -= 2;
                total_wax_quantity -= 1;
                consume_WaF += 2;
                consume_wax++;
                sales += 125.0;
            }
            
            if(interior_wash == false && exterior_wash == false && auto_Hairdresser == false && wax_polish == false)
                return 0;
                
            if (auto_Hairdresser == true && wax_polish == false){
                total_water_and_Foam--;
                consume_WaF++;
                sales += 350.0;
            }
            
            else if(auto_Hairdresser == true && wax_polish == true){
                total_water_and_Foam--;
                total_wax_quantity--;
                consume_wax++;
                consume_WaF++;
                sales += 420.0;
            }
                
            else{  //auto_Hairdresser == false && wax_polish == true
                total_wax_quantity--;
                consume_wax++;
                sales += 90.0;
            }
            
            if( ( profession.equalsIgnoreCase("Police") || profession.equalsIgnoreCase("Student") || profession.equalsIgnoreCase("Soldier") ) && condition == true  )
                sales -= sales * 0.12;
            
            if(( profession.equalsIgnoreCase("Police") || profession.equalsIgnoreCase("Student") || profession.equalsIgnoreCase("Soldier") ) && condition == false)
                sales -= sales * 0.08;
            
            return sales;
        }
        
        
        else{  //MotoCycle part
            if (wax_polish){
                total_wax_quantity--;
                consume_wax++;
                sales += 300.0;
            }
            
            else if(interior_wash == false && exterior_wash == false && auto_Hairdresser == false && wax_polish == false)
                return 0;
            
            else if (auto_Hairdresser == true && wax_polish == true){
                total_water_and_Foam--;
                total_wax_quantity--;
                consume_wax++;
                consume_WaF++;
                sales += 82.50;
            }
            
            else{
                total_water_and_Foam--;
                consume_WaF++;
                sales += 20.0;
            }
            
            if( ( profession.equalsIgnoreCase("Police") || profession.equalsIgnoreCase("Student") || profession.equalsIgnoreCase("Soldier") ) && condition == true  )
                sales -= sales * 0.12;
            
            if( (profession.equalsIgnoreCase("Police") || profession.equalsIgnoreCase("Student") || profession.equalsIgnoreCase("Soldier") ) && condition == false)
                sales -= sales * 0.08;
            if(condition == true)
                sales -= sales * 0.07;
            
             return sales;   
        }
    }    
    
    public static int getTotal_water_and_Foam() {
        return total_water_and_Foam;
    }

    public static int getTotal_wax_quantity() {
        return total_wax_quantity;
    }

    public static int getConsume_wax() {
        return consume_wax;
    }

    public static int getConsume_WaF() {
        return consume_WaF;
    }
    
    public static double getMaterial_WaF(){
        double PriceWaF = consume_WaF;
        consume_WaF = 0;
        return PriceWaF;
    }
    
    public static double getMaterial_WaX(){
        double PriceWax = consume_wax;
        consume_wax = 0;
        return PriceWax;
    }
    
    public static void AddtoCase(){
        MotherMain.totalMoney += sales;
        MotherMain.Tax += sales * 0.08;
    }
    
    @Override
    protected String staticticOfAdvertisement() {
        if (Cleaning_Male > Cleaning_Female) {
            return "\nMale customers used cleaning service more than female customers";
        }
        else if(Cleaning_Male == Cleaning_Female)
            return "\nNumber of Male and Female customers who used cleaning services are the same";
        else
            return "\nFemale customers used cleaning service more than Male customers";
    }

    @Override
    public String statisticsUsed() {
        
        if (consume_WaF > consume_wax) 
            return "\nExterior or/and Interior washing and/or Auto Hairdresser used more than Wax Polish" + "\nTotal Exterior and/or total Interior wash and/or Auto Hairdresser" + consume_WaF + "\nTotal Wax Polish" + consume_wax ;
        else if(consume_WaF == consume_wax)
            return "\nExterior or/and Interior washing and/or Auto Hairdresser as used as Wax Polish" + "\nTotal Exterior and/or total Interior wash and/or Auto Hairdresser" + consume_WaF + "\nTotal Wax Polish" + consume_wax;
        else
            return "\nExterior or/and Interior washing and/or Auto Hairdresser used less than Wax Polish" + "\nTotal Exterior and/or total Interior wash and/or Auto Hairdresser" + consume_WaF + "\nTotal Wax Polish" + consume_wax;
        
    }

    @Override
    public String toString() {
        return super.toString() + person.toString() + "\nVehicle Type : "+ VehicleType + "\nTotal Cleaning" + total_Cleaning + "\nTotal count of Male Customers : "+ Cleaning_Male + "\nTotal count of Female Customer : " + Cleaning_Female;
    }
}
