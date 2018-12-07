/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Murat
 */

import java.util.Random;

public class GasolineCar extends Repair {
    
    
    private String[] DamageSide=new String[10];
    private double prize=0;
    private double kdv=0;
    private double account=0;
    
    private static int Gbattery=50;
    private static int Gengine=50;
    private static int GGearBox=50;
    private static int GRadiator=50;
    private static int Gfuel=50;
    
    public void faultDetection()
    {
        Random rand = new Random();
        
        int rate = rand.nextInt(100) + 1;
        
        
        
        if(rate <20)
        {
            for(int n=0;n<2;n++)
            {
              int num=rand.nextInt(n)+1;
              
              switch(num)
              {
                  case 1:
                      DamageSide[n]="Tire";
                      break;
                  case 2:
                      DamageSide[n]="Seat";
                      break;
                  case 3:
                      DamageSide[n]="window";
                      break;
                  case 4:
                      DamageSide[n]="rim";
                      break;
                  case 5:
                      DamageSide[n]="headlight";
                      break;
                  case 6:
                      DamageSide[n]="battery";
                      break;
                  case 7:
                      DamageSide[n]="engine";
                      break;
                  case 8:
                      DamageSide[n]="GearBox";
                      break;
                  case 9:
                      DamageSide[n]="Radiator";
                      break;
                  case 10:
                      DamageSide[n]="Gfuel";
                      break;
                      
                      
              
              }
                
            }
        }
        else if (rate>20 && rate<40)
        {
            for(int n=0;n<4;n++)
            {
              int num=rand.nextInt(n)+1;
              
              switch(num)
              {
                  case 1:
                      DamageSide[n]="Tire";
                      break;
                  case 2:
                      DamageSide[n]="Seat";
                      break;
                  case 3:
                      DamageSide[n]="window";
                      break;
                  case 4:
                      DamageSide[n]="rim";
                      break;
                  case 5:
                      DamageSide[n]="headlight";
                      break;
                  case 6:
                      DamageSide[n]="battery";
                      break;
                  case 7:
                      DamageSide[n]="engine";
                      break;
                  case 8:
                      DamageSide[n]="GearBox";
                      break;
                  case 9:
                      DamageSide[n]="Radiator";
                      break;
                  case 10:
                      DamageSide[n]="Gfuel";
                      break;
                      
                      
              
              }
                
            }
            
           
            
        }
        else if (rate>40 && rate<60)
        {
            for(int n=0;n<6;n++)
            {
              int num=rand.nextInt(n)+1;
              
              switch(num)
              {
                  case 1:
                      DamageSide[n]="Tire";
                      break;
                  case 2:
                      DamageSide[n]="Seat";
                      break;
                  case 3:
                      DamageSide[n]="window";
                      break;
                  case 4:
                      DamageSide[n]="rim";
                      break;
                  case 5:
                      DamageSide[n]="headlight";
                      break;
                  case 6:
                      DamageSide[n]="battery";
                      break;
                  case 7:
                      DamageSide[n]="engine";
                      break;
                  case 8:
                      DamageSide[n]="GearBox";
                      break;
                  case 9:
                      DamageSide[n]="Radiator";
                      break;
                  case 10:
                      DamageSide[n]="Gfuel";
                      break;
                      
                      
              
              }
                
            }
            
        }
        else if (rate>60 && rate<80)
        {
            for(int n=0;n<8;n++)
            {
              int num=rand.nextInt(n)+1;
              
              switch(num)
              {
                 case 1:
                      DamageSide[n]="Tire";
                      break;
                  case 2:
                      DamageSide[n]="Seat";
                      break;
                  case 3:
                      DamageSide[n]="window";
                      break;
                  case 4:
                      DamageSide[n]="rim";
                      break;
                  case 5:
                      DamageSide[n]="headlight";
                      break;
                  case 6:
                      DamageSide[n]="battery";
                      break;
                  case 7:
                      DamageSide[n]="engine";
                      break;
                  case 8:
                      DamageSide[n]="GearBox";
                      break;
                  case 9:
                      DamageSide[n]="Radiator";
                      break;
                  case 10:
                      DamageSide[n]="Gfuel";
                      break;
                      
                      
              
              }
                
            }
            
        }
        else 
        {
            for(int n=0;n<10;n++)
            {
              int num=rand.nextInt(n)+1;
              
              switch(num)
              {
                  case 1:
                      DamageSide[n]="Tire";
                      break;
                  case 2:
                      DamageSide[n]="Seat";
                      break;
                  case 3:
                      DamageSide[n]="window";
                      break;
                  case 4:
                      DamageSide[n]="rim";
                      break;
                  case 5:
                      DamageSide[n]="headlight";
                      break;
                  case 6:
                      DamageSide[n]="battery";
                      break;
                  case 7:
                      DamageSide[n]="engine";
                      break;
                  case 8:
                      DamageSide[n]="GearBox";
                      break;
                  case 9:
                      DamageSide[n]="Radiator";
                      break;
                  case 10:
                      DamageSide[n]="Gfuel";
                      break;
                      
                      
              
              }
                
            }
            
        }
        
    }

    @Override
    public double getPrice() {
        for(int n=0;n<DamageSide.length;n++)
        {
            
            if(DamageSide[n].equalsIgnoreCase("Tire"))
                      prize+=1000.0;
                     
            else if (DamageSide[n].equalsIgnoreCase("Seat"))
                      prize+=1500.0;
            
            else if (DamageSide[n].equalsIgnoreCase("window"))
                      prize+=250.0;
            
            else if (DamageSide[n].equalsIgnoreCase("rim"))
                      prize+=2350.0;
            
            else if (DamageSide[n].equalsIgnoreCase("headlight"))
                      prize+=80.0;
            
            else if (DamageSide[n].equalsIgnoreCase("battery"))
                      prize+=500.0;
            
            else if (DamageSide[n].equalsIgnoreCase("engine"))
                      prize+=4500.9;
            
            else if (DamageSide[n].equalsIgnoreCase("GearBox"))
                      prize+=1500;
            
            else if (DamageSide[n].equalsIgnoreCase("Radiator"))
                      prize+=750.0;
            
            else if (DamageSide[n].equalsIgnoreCase("Gfuel"))
                      prize+=2980.0;
        
        }
    

    
            return prize;
    }
    
    @Override
    public void Repair_Car()
    {
        for(int n=0;n<DamageSide.length;n++)
        {
            
            if(DamageSide[n].equalsIgnoreCase("Tire"))
                     Repair.Tire-=4;
                     
            else if (DamageSide[n].equalsIgnoreCase("Seat"))
                     Repair.Seat-=3;
            
            else if (DamageSide[n].equalsIgnoreCase("window"))
                     Repair.window-=6;
            
            else if (DamageSide[n].equalsIgnoreCase("rim"))
                      Repair.rim=-4;
            
            else if (DamageSide[n].equalsIgnoreCase("headlight"))
                      Repair.headlight-=4;
            
            else if (DamageSide[n].equalsIgnoreCase("battery"))
                      Gbattery-=1;
            
            else if (DamageSide[n].equalsIgnoreCase("engine"))
                      Gengine-=1;
            
            else if (DamageSide[n].equalsIgnoreCase("GearBox"))
                      GGearBox-=1;
            
            else if (DamageSide[n].equalsIgnoreCase("Radiator"))
                      GRadiator-=1;
            
            else if (DamageSide[n].equalsIgnoreCase("Gfuel"))
                      Gfuel-=1;
        
        }
       
        account=getPrice();
        
        kdv=account*18/100;
        MotherMain.Tax+=kdv;
        
        
    
    }
    
    
}
