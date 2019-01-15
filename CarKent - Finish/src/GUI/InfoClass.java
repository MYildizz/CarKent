/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Park.Parking;
import Common_Classes.MotherMain;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JButton;
import Clean.Cleaning;
import GUI.REPAIR_CLEANING_PARK;
import java.io.*;

/**
 *
 * @author Gurkan
 */

public class InfoClass {
    
    public static ArrayList<MotherMain> infoCustomer=new ArrayList<MotherMain>();
    public static ArrayList<JButton> buttons=new ArrayList<JButton>();
    public static ArrayList<Parking> parking=new ArrayList<Parking>();
    public static ArrayList<Cleaning> cleaning = new ArrayList<Cleaning>();
   
    public static void ParkAdd(Parking park, JButton a){
        parking.add(park);
        buttons.add(a);
    }
    public static void ParkRemove(String plaka){
        for (int i = 0; i < parking.size(); i++) {
            if (plaka.equalsIgnoreCase(parking.get(i).getID())) {
                parking.remove(i);
                buttons.get(i).setBackground(Color.green);
                buttons.get(i).setSelected(false);
                buttons.remove(i);
                
            }
        }
    }
    
    public static void add(MotherMain motherMain){  
        File f=new File("DOKUMAN.txt");
        try{
            infoCustomer.add(motherMain);
            FileWriter fw=new FileWriter(f,true);
            fw.write(motherMain.toString());
            fw.close();            
        }
        catch(IOException e){
            System.out.println("ehuhu uhuhuhuh");
        }
        
                   
        
    }    
    public static int FindIndex(String plaka){
        
        for (int i = 0; i < parking.size(); i++) {
            if (plaka.equalsIgnoreCase(parking.get(i).getID())) {
                return i;
               
            }
        }
        return -1;
    }
   
    public static void remove(String plaka){
        
        for (int i = 0; i < infoCustomer.size(); i++) {
            if (plaka.equalsIgnoreCase(infoCustomer.get(i).getID())) {
                infoCustomer.remove(i);
                
            }
        }
    }
    public static MotherMain search(String plaka){
        
        for (int i = 0; i < infoCustomer.size(); i++) {
            if (infoCustomer.get(i).getID().equalsIgnoreCase(plaka)) {
                return infoCustomer.get(i);
            }
        }
        return null;
    }
    public static String ShowAll(){
        String s="";
        for (int i = 0; i < infoCustomer.size(); i++) {
            s+=infoCustomer.get(i).toString();
            s+="\n";
        }
        return s;
    }
}
