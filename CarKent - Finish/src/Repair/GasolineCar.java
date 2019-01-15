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
import Common_Classes.Personality;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

public class GasolineCar extends Repair {
    
    
    private ArrayList<String> DamageSide=new ArrayList<String>();
    private Personality personalty;
    
    private double price=0;
    private double kdv=0;
    private double account=0;
    public int Damage=0;
    private boolean Special;
    public String Empty_Material="";
    
    
    private static int CountFemale=3;
    private static int CountMale=13;
    private static int CountGasoline=17;
    
    public static int Gbattery=5;
    public static int Gengine=10;
    public static int GGearBox=20;
    public static int GRadiator=20;
    public static int Gfuel=12;
    
    private static int SpentGbattery=0;
    private static int SpentGengine=0;
    private static int SpentGGearBox=0;
    private static int SpentGRadiator=0;
    private static int SpentGFuel=0;
    private static int SpentTire=0;
    private static int SpentSeat=0;
    private static int Spentwindow=0;
    private static int Spentrim=0;
    private static int Spentheadlight=0;

    
    public GasolineCar(String name, String surname, String TC, String Profession, String Gender,String Model,String ID,boolean special) 
    {
        super(Model,ID);
        this.personalty = new Personality(name,surname,TC,Profession,Gender);
        this.Special=special;
        
    }

    public Personality getPersonalty() {
        return personalty;
    }
    
    
    
    public String faultDetection()
    {
        
        double Prize;
        
        Random rand = new Random();
        
        ArrayList<Integer> nums=new ArrayList<Integer>();
        
        int rate = rand.nextInt(10) + 1;
            
            
            for(int n=0;n<rate;n++)
            {
                int num=0;
                int random;
                
                
               while(true)
               {
                   boolean flag=true;
                   random=rand.nextInt(10)+1;
                   
                   for(int a=0;a<nums.size();a++)
                     {
                         if(nums.get(a)==random)
                             flag=false;
                         
                     }
                     
                    if(flag==true)
                    {
                        nums.add(random);
                        num=random;
                          break;
                    }
       
               }
  
              switch(num)
              {
                  case 1:
                      DamageSide.add("Tire");
                      break;
                  case 2:
                      DamageSide.add("Seat");
                      break;
                  case 3:
                      DamageSide.add("window");
                      break;
                  case 4:
                      DamageSide.add("rim");
                      break;
                  case 5:
                      DamageSide.add("headlight");
                      break;
                  case 6:
                      DamageSide.add("battery");
                      break;
                  case 7:
                      DamageSide.add("engine");
                      break;
                  case 8:
                      DamageSide.add("GearBox");
                      break;
                  case 9:
                      DamageSide.add("Radiator");
                      break;
                  case 10:
                      DamageSide.add("Fuel");
                      break;

              }
                
            }
        
       String damage="\t       DAMAGE DETECTİON COMPLETED  \n"  +
                      "\nMODEL : "+this.getModel()+"    |    TYPE : GASOLINE  "+"    |    PLATE : "+super.ID+
                      "\n\nREGIONS TO BE REPAIRED: \n";
                
        for(int n=0;n<DamageSide.size();n++)
        {
            damage+=DamageSide.get(n)+" | ";
        }
        
        DecimalFormat shorted = new DecimalFormat("#.##");
        
        Damage=rate*10;
        Prize =getPrice();
        
            if(personalty.Profession.equalsIgnoreCase("SOLDIER") || personalty.Profession.equalsIgnoreCase("POLICE") || personalty.Profession.equalsIgnoreCase("STUDENT"))
            {
                damage+="\n\nPrize : "+shorted.format(Prize)+" TL.";
                price-=price*7/100;
                Prize-=Prize*7/100;
                damage+="    Prize with Discount for Profession :"+shorted.format(Prize)+" TL";
            }  
            else
                damage+="\n\nPrize : "+shorted.format(Prize)+" TL.";
            
            if(this.Special==true)
            {
                price-=price*10/100;
                Prize-=Prize*10/100;
                damage+="\nPrize with Discount for Special C.  :"+shorted.format(Prize)+" TL";               
            }
              return damage;    
            }

    @Override
    public double getPrice() {
        
        for(int n=0;n<DamageSide.size();n++)
        {
            
            if(DamageSide.get(n).equalsIgnoreCase("Tire"))
                      price+=1000.0;
                     
            else if (DamageSide.get(n).equalsIgnoreCase("Seat"))
                      price+=1500.0;
            
            else if (DamageSide.get(n).equalsIgnoreCase("window"))
                      price+=250.0;
            
            else if (DamageSide.get(n).equalsIgnoreCase("rim"))
                      price+=2350.0;
            
            else if (DamageSide.get(n).equalsIgnoreCase("headlight"))
                      price+=80.0;
            
            else if (DamageSide.get(n).equalsIgnoreCase("battery"))
                      price+=500.0;
            
            else if (DamageSide.get(n).equalsIgnoreCase("engine"))
                      price+=4500.9;
            
            else if (DamageSide.get(n).equalsIgnoreCase("GearBox"))
                      price+=1500;
            
            else if (DamageSide.get(n).equalsIgnoreCase("Radiator"))
                      price+=750.0;
            
            else if (DamageSide.get(n).equalsIgnoreCase("Gfuel"))
                      price+=2980.0;
        
        }
            return price;
    }
    
    @Override
    public boolean Repair_Car()
    {
        boolean Repairable=true;
        
        
        for(int n=0;n<DamageSide.size();n++)
        {
            
            if(DamageSide.get(n).equalsIgnoreCase("Tire"))
            {
                
              if(Repair.Tire<4)
              {
                Empty_Material+="There is no Tire in Inventory \n";
                  Repairable=false;
              }
            }
                     
            else if (DamageSide.get(n).equalsIgnoreCase("Seat"))
            {
                if(Repair.Seat<3)
                {
                    Empty_Material+="There is no Seat in Inventory \n";
                    Repairable=false;
                }    
            }
            
            else if (DamageSide.get(n).equalsIgnoreCase("window"))
            {
                if(Repair.window<6)
                {
                    Empty_Material+="There is no window in Inventory \n";
                    Repairable=false;
                }
            }
            
            else if (DamageSide.get(n).equalsIgnoreCase("rim"))
            {
                if(Repair.rim<4)
                {
                    Empty_Material+="There is no Rim in Inventory \n";
                    Repairable=false;
                }    
            }         
            
            else if (DamageSide.get(n).equalsIgnoreCase("headlight"))
            {
                if(Repair.headlight<4)
                {
                    Empty_Material+="There is no headlight in Inventory \n";
                    Repairable=false;
                }
            }
            
            else if (DamageSide.get(n).equalsIgnoreCase("battery"))
            {   
                if(Gbattery<1)
                {
                    Empty_Material+="There is no battery in Inventory \n";
                    Repairable=false;
                }
            }         
            
            else if (DamageSide.get(n).equalsIgnoreCase("engine"))
            {
                if(Gengine<1)
                {
                    Empty_Material+="There is no engine in Inventory \n";
                    Repairable=false;
                }
            }
            
            else if (DamageSide.get(n).equalsIgnoreCase("GearBox"))
            {
               if(GGearBox<1)
                {
                   Empty_Material+="There is no GearBox in Inventory \n";
                   Repairable=false;
               }
            }
            
            else if (DamageSide.get(n).equalsIgnoreCase("Radiator"))
            {
                if(GRadiator<1)
                {
                    Empty_Material+="There is no Radiator in Inventory \n";
                    Repairable=false;
                }
            }
            
            else if (DamageSide.get(n).equalsIgnoreCase("Gfuel"))
            {
                if(Gfuel<1)
                {
                    Empty_Material+="There is no fuel in Inventory \n";
                    Repairable=false;
                }
            }
        }
       
        if(Repairable==true)
        {
            
            for(int n=0;n<DamageSide.size();n++)
        {
            
            if(DamageSide.get(n).equalsIgnoreCase("Tire"))
            {                  
                Repair.Tire-=4;
                SpentTire+=4;
            }
                     
            else if (DamageSide.get(n).equalsIgnoreCase("Seat"))
            {
                Repair.Seat-=3;
                SpentSeat+=3;
            }
            
            else if (DamageSide.get(n).equalsIgnoreCase("window"))
            {
                Repair.window-=6;
                Spentwindow+=6;
            }
            
            else if (DamageSide.get(n).equalsIgnoreCase("rim"))
            {
                Repair.rim-=4;
                Spentrim+=4;
            }
            
            else if (DamageSide.get(n).equalsIgnoreCase("headlight"))
            {
                Repair.headlight-=4;
                Spentheadlight+=4;
           }
            
            else if (DamageSide.get(n).equalsIgnoreCase("battery"))
            {
                Gbattery-=1;
                SpentGbattery+=1;
            }
            
            else if (DamageSide.get(n).equalsIgnoreCase("engine"))
            {
                Gengine-=1;
                SpentGengine+=1;
            }
            
            else if (DamageSide.get(n).equalsIgnoreCase("GearBox"))
            {
                GGearBox-=1;
                SpentGGearBox+=1;
            }
            
            else if (DamageSide.get(n).equalsIgnoreCase("Radiator"))
            {
                GRadiator-=1;
                SpentGRadiator+=1;
            }
            
            else if (DamageSide.get(n).equalsIgnoreCase("Gfuel"))
            {
                Gfuel-=1;
                SpentGFuel+=1;
            }
        
        }
            
           
            MotherMain.totalMoney+=price;
            kdv=price*18/100;
            MotherMain.Tax+=kdv;
            CountGasoline+=1;
            MotherMain.Electric+=DamageSide.size()*3;
            
            if(personalty.Gender.equals("Female"))
                 CountFemale+=1;
            else
                 CountMale+=1;
             return true;
        }
        else
        {
            Empty_Material+="Could not be repaired due to lack of inventory...";
            
            return false;
        }   
    
    }

    @Override
    public String statisticsUsed() {
        return  CountGasoline +"PIECES APPROVED GASOLINE CAR"
                +"Used Materials : \n"
                + "Battery "       + SpentGbattery        + " Pieces Used.\n"
                + "Engine "        + SpentGengine         + " Pieces Used.\n"
                + "GearBox "       + SpentGGearBox        + " Pieces Used.\n"
                + "Radiator "      + SpentGRadiator       + " Pieces Used.\n"
                + "ChargeBattery " + SpentGFuel           + " Pieces Used.\n"
                + "Tire "          + SpentTire            + " Pieces Used.\n"
                + "Seat"           + SpentSeat            + " Pieces Used.\n"
                + "Car Window"     + Spentwindow          + " Pieces Used.\n"
                + "Rim"            + Spentrim             + " Pieces Used.\n"
                + "Headlight"      + Spentheadlight       + " Pieces Used.\n"
                
                ;
    }

    @Override
    protected String staticticOfAdvertisement() 
    {
        String Advertsiment="";
        
        if(CountFemale>CountMale)
        {
            Advertsiment+="The number of women coming for  repair of Gasoline Car is more than the number of men.\n"
                          +"Advertsiment can be making for women";
        }
        else
        {
            Advertsiment+="The number of men coming for  repair of Gasoline Car is more than the number of women.\n"
                          +"Advertsiment can be making for men";
            
        }
        
        return Advertsiment;
    }
    
     @Override
    public void Reset() {
        super.Reset();
        SpentGbattery=0;
        SpentGengine=0; 
        SpentGGearBox=0; 
        SpentGRadiator=0;   
        SpentGFuel=0;  
        SpentTire=0;        
        SpentSeat=0;      
        Spentwindow=0;     
        Spentrim=0;         
        Spentheadlight=0;
        CountGasoline=0;
        CountFemale=0;
        CountMale=0;
        
    }
    

    public static int getCountFemale() {
        return CountFemale;
    }

    public static int getCountMale() {
        return CountMale;
    }

    public static int getCountGasoline() {
        return CountGasoline;
    }
    
     public int getDamage() {
        return Damage;
    }

    public double gettPrice() {
        return price;
    }
     
       public static int getGbattery() {
        return Gbattery;
    }

    public static int getGengine() {
        return Gengine;
    }

    public static int getGGearBox() {
        return GGearBox;
    }

    public static int getGRadiator() {
        return GRadiator;
    }

    public static int getGfuel() {
        return Gfuel;
    }
    

    public static int getSpentGbattery() {
        return SpentGbattery;
    }

    public static int getSpentGengine() {
        return SpentGengine;
    }

    public static int getSpentGGearBox() {
        return SpentGGearBox;
    }

    public static int getSpentGRadiator() {
        return SpentGRadiator;
    }

    public static int getSpentGFuel() {
        return SpentGFuel;
    }

    public static int getSpentTire() {
        return SpentTire;
    }

    public static int getSpentSeat() {
        return SpentSeat;
    }

    public static int getSpentwindow() {
        return Spentwindow;
    }

    public static int getSpentrim() {
        return Spentrim;
    }

    public static int getSpentheadlight() {
        return Spentheadlight;
    }
    

    @Override
    public String toString() {
        
        String info= "\nPersonal Information: \n"
              +personalty.toString()+"\n"
              +"Vehicle Information:  \n"
              +"ID: "+super.ID+" , Model :"+super.getModel()+"Type : Gasoline Car"+"Prize "+price
              +" Spending Inventories : \n**********************************************\n"  ;
        
       for(int n=0;n<DamageSide.size();n++)
       {
           info+=DamageSide.get(n);
       }
        
        return info;
        
        
    }
 
}
