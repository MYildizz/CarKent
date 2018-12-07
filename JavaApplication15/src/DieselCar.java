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

public class DieselCar extends Repair {
    
    public String[] DamageSide=new String[10];
    private double prize=0;
    private double account=0;
    private double kdv=0;
    
    
    private static int Dbattery=50;
    private static int Dengine=50;
    private static int DGearBox=50;
    private static int DRadiator=50;
    private static int Dfuel=50;
    
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
                      DamageSide[n]="Dfuel";
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
                      DamageSide[n]="Dfuel";
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
                      DamageSide[n]="Dfuel";
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
                      DamageSide[n]="Dfuel";
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
                      DamageSide[n]="Dfuel";
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
                      prize+=768.0;
            
            else if (DamageSide[n].equalsIgnoreCase("engine"))
                      prize+=6345.9;
            
            else if (DamageSide[n].equalsIgnoreCase("GearBox"))
                      prize+=3431.2;
            
            else if (DamageSide[n].equalsIgnoreCase("Radiator"))
                      prize+=2984.2;
            
            else if (DamageSide[n].equalsIgnoreCase("Gfuel"))
                      prize+=3223.0;
        
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
                      Dbattery-=1;
            
            else if (DamageSide[n].equalsIgnoreCase("engine"))
                      Dengine-=1;
            
            else if (DamageSide[n].equalsIgnoreCase("GearBox"))
                      DGearBox-=1;
            
            else if (DamageSide[n].equalsIgnoreCase("Radiator"))
                      DRadiator-=1;
            
            else if (DamageSide[n].equalsIgnoreCase("Gfuel"))
                      Dfuel-=1;
        
        }
       
        account=getPrice();
        
        kdv=account*18/100;
        MotherMain.Tax+=kdv;
        
        
    
    }
    
}
