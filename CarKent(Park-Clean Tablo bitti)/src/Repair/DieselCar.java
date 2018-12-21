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

public class DieselCar extends Repair {
    
    private ArrayList<String> DamageSide=new ArrayList<String>();
    private Personality personalty;
    private double prize=0;
    private double account=0;
    private double kdv=0;
    private int Damage;
    public String Empty_Material="";
    private boolean Special;
    
    private static int CountFemale=10;
    private static int CountMale=7;
    private static int CountDiesel=8;
    
    
    public static int Dbattery=50;
    public static int Dengine=50;
    public static int DGearBox=50;
    public static int DRadiator=50;
    public static int Dfuel=50;
    
    private static int SpentDbattery=3;
    private static int SpentDengine=7;
    private static int SpentDGearBox=5;
    private static int SpentDRadiator=6;
    private static int SpentDFuel=2;
    private static int SpentTire=7;
    private static int SpentSeat=7;
    private static int Spentwindow=5;
    private static int Spentrim=11;
    private static int Spentheadlight=2;

 
    
    
   public DieselCar(String name, String surname, String TC, String Profession, String Gender,String Model,String ID ,boolean special) 
    {
        super(Model,ID);
        this.personalty = new Personality(name,surname,TC,Profession,Gender);
        this.Special=special;
        
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
                      "\nMODEL : "+this.getModel()+"    |    TYPE : DIESEL  "+"    |    PLATE : "+super.ID+
                      "\n\nREGIONS TO BE REPAIRED: \n";
                
        for(int n=0;n<DamageSide.size();n++)
        {
            damage+=DamageSide.get(n)+" | ";
        }
        
        Damage=rate*10;
        Prize =getPrice();
        
        System.out.println(personalty.Profession);
        
            if(personalty.Profession.equalsIgnoreCase("SOLDIER") || personalty.Profession.equalsIgnoreCase("POLICE") || personalty.Profession.equalsIgnoreCase("STUDENT"))
            {
                damage+="\n\nPrize : "+Prize+" TL.";
                prize-=prize*7/100;
                Prize-=Prize*7/100;
                damage+="    Prize with Discount :"+Prize+" TL";
            }  
            
            
            else
                damage+="\n\nPrize : "+Prize+" TL.";
            
            if(this.Special==true)
            {
                prize-=prize*10/100;
                Prize-=Prize*10/100;
                damage+="    Prize with Discount for Special C.  :"+Prize+" TL";
            }   
        
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
                      prize+=768.0;
            
            else if (DamageSide.get(n).equalsIgnoreCase("engine"))
                      prize+=6345.9;
            
            else if (DamageSide.get(n).equalsIgnoreCase("GearBox"))
                      prize+=3431.2;
            
            else if (DamageSide.get(n).equalsIgnoreCase("Radiator"))
                      prize+=2984.2;
            
            else if (DamageSide.get(n).equalsIgnoreCase("Gfuel"))
                      prize+=3223.0;
        
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
                if(Dbattery<1)
                {
                    Empty_Material+="There is no battery in Inventory \n";
                    Repairable=false;
                }
            }         
            
            else if (DamageSide.get(n).equalsIgnoreCase("engine"))
            {
                if(Dengine<1)
                {
                    Empty_Material+="There is no engine in Inventory \n";
                    Repairable=false;
                }
            }
            
            else if (DamageSide.get(n).equalsIgnoreCase("GearBox"))
            {
               if(DGearBox<1)
                {
                   Empty_Material+="There is no GearBox in Inventory \n";
                   Repairable=false;
               }
            }
            
            else if (DamageSide.get(n).equalsIgnoreCase("Radiator"))
            {
                if(DRadiator<1)
                {
                    Empty_Material+="There is no Radiator in Inventory \n";
                    Repairable=false;
                }
            }
            
            else if (DamageSide.get(n).equalsIgnoreCase("Dfuel"))
            {
                if(Dfuel<1)
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
                Dbattery-=1;
                SpentDbattery+=1;
            }
            
            else if (DamageSide.get(n).equalsIgnoreCase("engine"))
            {
                Dengine-=1;
                SpentDengine+=1;
            }
            
            else if (DamageSide.get(n).equalsIgnoreCase("GearBox"))
            {
                DGearBox-=1;
                SpentDGearBox+=1;
            }
            
            else if (DamageSide.get(n).equalsIgnoreCase("Radiator"))
            {
                DRadiator-=1;
                SpentDRadiator+=1;
            }
            
            else if (DamageSide.get(n).equalsIgnoreCase("Gfuel"))
            {
                Dfuel-=1;
                SpentDFuel+=1;
            }
        
        }
            
            
            MotherMain.totalMoney+=prize;
            kdv=prize*18/100;
            MotherMain.Tax+=kdv;
            CountDiesel+=1;
            
            
            
            
           
            
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
    public String statisticsUsed() {
       return   
                CountDiesel +"PIECES APPROVED DIESEL CAR"
                +"Used Materials : \n"
                + "Battery "       + SpentDbattery        + " Pieces Used.\n"
                + "Engine "        + SpentDengine         + " Pieces Used.\n"
                + "GearBox "       + SpentDGearBox        + " Pieces Used.\n"
                + "Radiator "      + SpentDRadiator       + " Pieces Used.\n"
                + "ChargeBattery " + SpentDFuel           + " Pieces Used.\n"
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
            Advertsiment+="The number of women coming for  repair of Diesel Car is more than the number of men.\n"
                          +"Advertsiment can be making for women";
        }
        else
        {
            Advertsiment+="The number of men coming for  repair of Diesel Car is more than the number of women.\n"
                          +"Advertsiment can be making for men";
            
        }
        
        return Advertsiment;
    }
    
    
     @Override
    public void Reset() {
        super.Reset();
        SpentDbattery=0;
        SpentDengine=0; 
        SpentDGearBox=0; 
        SpentDRadiator=0;   
        SpentDFuel=0;  
        SpentTire=0;        
        SpentSeat=0;      
        Spentwindow=0;     
        Spentrim=0;         
        Spentheadlight=0;
        CountDiesel=0;
        CountFemale=0;
        CountMale=0;
        
    }
    
    
    

    public static int getCountFemale() {
        return CountFemale;
    }

    public static int getCountMale() {
        return CountMale;
    }

    public static int getCountDiesel() {
        return CountDiesel;
    }
    
    public int getDamage() {
        return Damage;
    }

    public double gettPrize() {
        return prize;
    }
    
       public static int getSpentDbattery() {
        return SpentDbattery;
    }

    public static int getSpentDengine() {
        return SpentDengine;
    }

    public static int getSpentDGearBox() {
        return SpentDGearBox;
    }

    public static int getSpentDRadiator() {
        return SpentDRadiator;
    }

    public static int getSpentDFuel() {
        return SpentDFuel;
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

    public static int getDbattery() {
        return Dbattery;
    }

    public static int getDengine() {
        return Dengine;
    }

    public static int getDGearBox() {
        return DGearBox;
    }

    public static int getDRadiator() {
        return DRadiator;
    }

    public static int getDfuel() {
        return Dfuel;
    }
    
    
    
    
  @Override
    public String toString() {
        
        String info= "Personal Information: \n"
              +personalty.toString()+"\n"
              +"Vehicle Information:  \n"
              +"ID: "+super.ID+" , Model :"+super.getModel()+"Type : Diesel Car"+"Prize "+prize
              +"Spending Inventories : "  ;
        
       for(int n=0;n<DamageSide.size();n++)
       {
           info+=DamageSide.get(n);
       }
        
        return info;
        
        
    }

    

    

   
    
    
    
}
