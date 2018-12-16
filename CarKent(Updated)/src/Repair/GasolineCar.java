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

import ProjectAir.MotherMain;
import ProjectAir.Personality;
import java.util.ArrayList;
import java.util.Random;

public class GasolineCar extends Repair {
    
    
    private ArrayList<String> DamageSide=new ArrayList<String>();
    private Personality personalty;
    
    private double prize=0;
    private double kdv=0;
    private double account=0;
    private int Damage;
    public String Empty_Material="";
    
    private static int CountFemale=3;
    private static int CountMale=13;
    private static int CountGasoline=17;
    
    private static int Gbattery=5;
    private static int Gengine=10;
    private static int GGearBox=20;
    private static int GRadiator=20;
    private static int Gfuel=12;
    
    private static int SpentGbattery=7;
    private static int SpentGengine=5;
    private static int SpentGGearBox=6;
    private static int SpentGRadiator=6;
    private static int SpentGFuel=9;
    private static int SpentTire=1;
    private static int SpentSeat=3;
    private static int Spentwindow=3;
    private static int Spentrim=5;
    private static int Spentheadlight=4;

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
    
    
    
    public GasolineCar(String name, String surname, String TC, String Profession, String Gender,String Model,String ID) 
    {
        super(Model,ID);
        this.personalty = new Personality(name,surname,TC,Profession,Gender);
        
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
                      DamageSide.add("Gfuel");
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
        
        Damage=rate*10;
        Prize =getPrice();
        
            damage+="\n\nPrize : "+Prize+" TL.";
        
        return damage;    
        
    }

    @Override
    public double getPrice() {
        

        
        for(int n=0;n<DamageSide.size();n++)
        {
            
            if(DamageSide.get(n).equalsIgnoreCase("Tire"))
                      prize+=1000.0;
                     
            else if (DamageSide.get(n).equalsIgnoreCase("Seat"))
                      prize+=1500.0;
            
            else if (DamageSide.get(n).equalsIgnoreCase("window"))
                      prize+=250.0;
            
            else if (DamageSide.get(n).equalsIgnoreCase("rim"))
                      prize+=2350.0;
            
            else if (DamageSide.get(n).equalsIgnoreCase("headlight"))
                      prize+=80.0;
            
            else if (DamageSide.get(n).equalsIgnoreCase("battery"))
                      prize+=500.0;
            
            else if (DamageSide.get(n).equalsIgnoreCase("engine"))
                      prize+=4500.9;
            
            else if (DamageSide.get(n).equalsIgnoreCase("GearBox"))
                      prize+=1500;
            
            else if (DamageSide.get(n).equalsIgnoreCase("Radiator"))
                      prize+=750.0;
            
            else if (DamageSide.get(n).equalsIgnoreCase("Gfuel"))
                      prize+=2980.0;
        
        }
    
    
            return prize;
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
                Repair.rim=-4;
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
            
           
            MotherMain.totalMoney+=prize;
            kdv=prize*18/100;
            MotherMain.Tax+=kdv;
            CountGasoline+=1;
            
            System.out.println(MotherMain.totalMoney);
            System.out.println(prize);
            
             if(personalty.Gender.equals("Female"))
            {
                CountFemale+=1;
                Repair.CountFemale+=1;
            }
            else
            {
                CountMale+=1;
                Repair.CountMale+=1;
            }
             
             return true;
        }
        else
        {
            Empty_Material+="Could not be repaired due to lack of inventory...";
            
            return false;
        }   
    
    }

    @Override
    protected String statisticsUsed() {
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

    public double gettPrize() {
        return prize;
    }
     
     
    

    @Override
    public String toString() {
        
        String info= "Personal Information: \n"
              +personalty.toString()+"\n"
              +"Vehicle Information:  \n"
              +"ID: "+super.ID+" , Model :"+super.getModel()+"Type : Gasoline Car"+"Prize "+prize
              +"Spending Inventories : "  ;
        
       for(int n=0;n<DamageSide.size();n++)
       {
           info+=DamageSide.get(n);
       }
        
        return info;
        
        
    }

   
    
    
    
}