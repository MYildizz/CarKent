/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Park;
import Common_Classes.Personality;
import Common_Classes.IPrice;
import Common_Classes.MotherMain;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author Gurkan
 */
public class Parking extends MotherMain implements IPrice{

    private static int totalCar=0;
    private String CarParkingArea;
    protected static int ParkMale=0;
    protected static int ParkFemale=0;
    protected double Price = 0;
    protected boolean SpecialCondition;
    protected int Hour;
    protected int Minute;
    protected String Enteringtime;
    protected String ExitingTime;
    protected int DifferenceTime;         
    protected Personality person;

    public Parking(String ID,String name, String surname, String TC, String Profession, String Gender,String CarParkingArea, boolean SpecialCondition) {
        super(ID);
        this.CarParkingArea=CarParkingArea;    
        this.SpecialCondition=SpecialCondition;
        totalCar++;
        person=new Personality(name, surname, TC, Profession, Gender);
        if(person.Gender.equalsIgnoreCase("male")){
            ParkMale++; 
            totalMale++;
        }       
        
        else
        {
            ParkFemale++; 
            totalFemale++;
        }                  
    }

    public Personality getPerson() {
        return person;
    }

    public String getCarParkingArea() {
        return CarParkingArea;
    }
    
    public void EnteringTime(){
        
       Calendar cal=Calendar.getInstance();           
       Date date=cal.getTime();
       DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
       String formattedDate=dateFormat. format(date);
       this.Enteringtime=formattedDate;           
       String[] al=this.Enteringtime.split(":");
       this.Hour=Integer.parseInt(al[0]);
       this.Minute=Integer.parseInt(al[1]);
       
    }

    public String getEnteringtime() {
        return Enteringtime;
    }
    
    public int CalcTotalTime(){
       Calendar cal=Calendar.getInstance();           
       Date date=cal.getTime();
       DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
       String formattedDate=dateFormat. format(date);
       String s=formattedDate;
       this.ExitingTime = s;
       String[] al=s.split(":");
       int saat,dakika,saniye;
       saat=Integer.parseInt(al[0]);
       dakika=Integer.parseInt(al[1]);
       saniye=Integer.parseInt(al[2]);
        if (dakika<this.Minute) {
           this.DifferenceTime= (this.Minute-dakika+60)+(saat-this.Hour-1)*60;
        }
        else
           this.DifferenceTime= (dakika-this.Minute)+(saat-this.Hour)*60;
        return this.DifferenceTime;
    }

    public boolean isSpecialCondition() {
        return SpecialCondition;
    }

    public String getExitingTime() {
        return this.ExitingTime;
    }
    
    @Override
    public String statisticsUsed() {       
        
        String s="There are "+MotoBycycle.totalMoto+"Motobycycle\n";
      
        
       
       return "There are "+MotoBycycle.totalMoto +" motoBycycle\n"+"There are "+Lorry.totalLorry+" Lorry\n"+"There are "+Jip.totalJip+" Jip";
    }

    @Override
    protected String staticticOfAdvertisement() {
       
      
       return "Total Male is "+ParkMale+" Total Female is "+ParkFemale;
       
    }   
    @Override
    public double getPrice() {
        
        return this.Price;
    }
    public double CurrentMoney(){
        return this.Price;
    }

    @Override
    public String toString() {
        return super.toString()+ "\n CarParkingArea : " + CarParkingArea  +  "\n Enteringtime : " + Enteringtime+"\n Exiting Time : "+ ExitingTime;
    }
    

   
    
}
