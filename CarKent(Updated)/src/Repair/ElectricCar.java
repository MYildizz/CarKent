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

public class ElectricCar extends Repair 
{
    private ArrayList<String> DamageSide=new ArrayList<String>();
    private Personality personalty;
    
    private double prize=0;
    private double account=0;
    private double kdv=0;
    private int Damage;
    public String Empty_Material="";
    
    private static int CountFemale=8;
    private static int CountMale=6;
    private static int CountElectric=10;
     
    private static int Ebattery=50;
    private static int Eengine=50;
    private static int EGearBox=50;
    private static int ERadiator=50;
    private static int EChargebattery=50;
    
    private static int SpentEbattery=3;
    private static int SpentEengine=5;
    private static int SpentEGearBox=7;
    private static int SpentERadiator=4;
    private static int SpentEChargeBattery=2;
    private static int SpentTire=11;
    private static int SpentSeat=17;
    private static int Spentwindow=3;
    private static int Spentrim=0;
    private static int Spentheadlight=18;

    public static int getEbattery() {
        return Ebattery;
    }

    public static int getEengine() {
        return Eengine;
    }

    public static int getEGearBox() {
        return EGearBox;
    }

    public static int getERadiator() {
        return ERadiator;
    }

    public static int getEChargebattery() {
        return EChargebattery;
    }
    

    public static int getSpentEbattery() {
        return SpentEbattery;
    }

    public static int getSpentEengine() {
        return SpentEengine;
    }

    public static int getSpentEGearBox() {
        return SpentEGearBox;
    }

    public static int getSpentERadiator() {
        return SpentERadiator;
    }

    public static int getSpentEChargeBattery() {
        return SpentEChargeBattery;
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
    
    
    
     public ElectricCar(String name, String surname, String TC, String Profession, String Gender,String Model,String ID) 
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
                      "\nMODEL : "+this.getModel()+"    |    TYPE : ELECTRİC "+"    |    PLATE : "+super.ID+
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
    public double getPrice() 
    {
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
                      prize+=1000.0;
            
            else if (DamageSide.get(n).equalsIgnoreCase("engine"))
                      prize+=24860.8;
            
            else if (DamageSide.get(n).equalsIgnoreCase("GearBox"))
                      prize+=4689.0;
            
            else if (DamageSide.get(n).equalsIgnoreCase("Radiator"))
                      prize+=3875.0;
            
            else if (DamageSide.get(n).equalsIgnoreCase("ChargeBattery"))
                      prize+=17.850;
            
   
        
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
                if(Ebattery<1)
                {
                    Empty_Material+="There is no battery in Inventory \n";
                    Repairable=false;
                }
            }         
            
            else if (DamageSide.get(n).equalsIgnoreCase("engine"))
            {
                if(Eengine<1)
                {
                    Empty_Material+="There is no engine in Inventory \n";
                    Repairable=false;
                }
            }
            
            else if (DamageSide.get(n).equalsIgnoreCase("GearBox"))
            {
               if(EGearBox<1)
                {
                   Empty_Material+="There is no GearBox in Inventory \n";
                   Repairable=false;
               }
            }
            
            else if (DamageSide.get(n).equalsIgnoreCase("Radiator"))
            {
                if(ERadiator<1)
                {
                    Empty_Material+="There is no Radiator in Inventory \n";
                    Repairable=false;
                }
            }
            
            else if (DamageSide.get(n).equalsIgnoreCase("ChargeBattery"))
            {
                if(EChargebattery<1)
                {
                    Empty_Material+="There is no ChargeBattery in Inventory \n";
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
                Ebattery-=1;
                SpentEbattery+=1;
            }
            
            else if (DamageSide.get(n).equalsIgnoreCase("engine"))
            {
                Eengine-=1;
                SpentEengine+=1;
            }
            
            else if (DamageSide.get(n).equalsIgnoreCase("GearBox"))
            {
                EGearBox-=1;
                SpentEGearBox+=1;
            }
            
            else if (DamageSide.get(n).equalsIgnoreCase("Radiator"))
            {
                ERadiator-=1;
                SpentERadiator+=1;
            }
            
            else if (DamageSide.get(n).equalsIgnoreCase("Gfuel"))
            {
                EChargebattery-=1;
                SpentEChargeBattery+=1;
            }
        
        }
            
           
            MotherMain.totalMoney+=prize;
            kdv=prize*18/100;
            MotherMain.Tax+=kdv;
            CountElectric+=1;
            
            System.out.println(prize);
            System.out.println(MotherMain.totalMoney);
            
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
            Empty_Material+="Could not be repaired due to lack of inventory...\n";
            return false;
        }   
        
        
    
    }

    @Override
    protected String statisticsUsed() 
    {
        
        return  CountElectric +"PIECES APPROVED ELECTRİC CAR"
                +"Used Materials : \n"
                + "Battery "       + SpentEbattery        + " Pieces Used.\n"
                + "Engine "        + SpentEengine         + " Pieces Used.\n"
                + "GearBox "       + SpentEGearBox        + " Pieces Used.\n"
                + "Radiator "      + SpentERadiator       + " Pieces Used.\n"
                + "ChargeBattery " + SpentEChargeBattery  + " Pieces Used.\n"
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
            Advertsiment+="The number of women coming for  repair of Electric Car is more than the number of men.\n"
                          +"Advertsiment can be making for women";
        }
        else
        {
            Advertsiment+="The number of men coming for  repair of Electric Car is more than the number of women.\n"
                          +"Advertsiment can be making for men";
            
        }
        
        return Advertsiment;
    }

    @Override
    public void Reset() {
        super.Reset();
        SpentEbattery=0;
        SpentEengine=0; 
        SpentEGearBox=0; 
        SpentERadiator=0;   
        SpentEChargeBattery=0;  
        SpentTire=0;        
        SpentSeat=0;      
        Spentwindow=0;     
        Spentrim=0;         
        Spentheadlight=0;
        CountElectric=0;
        CountFemale=0;
        CountMale=0;
        
    }
    
    

    public static int getCountFemale() {
        return CountFemale;
    }

    public static int getCountMale() {
        return CountMale;
    }

    public static int getCountElectric() {
        return CountElectric;
    }

     public int getDamage() {
        return Damage;
    }
     
     public double gettPrize() {
        return prize;
    }
    
    @Override
    public String toString() 
    {
        
        String info= "Personal Information: \n"
              +personalty.toString()+"\n"
              +"Vehicle Information:  \n"
              +"ID: "+super.ID+" , Model :"+super.getModel()+"Type : Electric Car"+"Prize "+prize
              +"Spending Inventories : "  ;
        
       for(int n=0;n<DamageSide.size();n++)
       {
           info+=DamageSide.get(n);
       }
        
        return info;
                
    }

    

   
    
    
    
 }
