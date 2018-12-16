/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import ProjectAir.*;
import java.util.ArrayList;

/**
 *
 * @author Gurkan
 */

public class InfoClass {
    
    public static ArrayList<MotherMain> infoCustomer=new ArrayList<MotherMain>();
   
    public static void add(MotherMain motherMain){
        infoCustomer.add(motherMain);
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
